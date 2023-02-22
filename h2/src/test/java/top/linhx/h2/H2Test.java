package top.linhx.h2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.linhx.h2.entity.ScheduleTask;
import top.linhx.h2.repository.H2Repository;
import top.linhx.h2.service.H2Service;

import java.util.List;

@SpringBootTest
public class H2Test {

    @Autowired
    private H2Service h2Service;

    @Autowired
    private H2Repository h2Repository;

    @Test
    public void addTask() {
        ScheduleTask newTask = new ScheduleTask();
        newTask.setTaskId("task_new");
        newTask.setTaskName("newTaskName");
        newTask.setCron("* * * * * * ?");
        newTask.setRemark("remark");
        ScheduleTask scheduleTask = h2Service.addTask(newTask);
        System.out.println(scheduleTask);
    }

    @Test
    public void getTaskPage() {
        List<ScheduleTask> tasks = h2Service.getTask(0, 15);
        tasks.forEach(System.out::println);
    }

    @Test
    public void getTask() {
        ScheduleTask task_8 = h2Service.getTaskById("task_8");
        System.out.println(task_8);
    }

    @Test
    public void updateTask() {
        String taskId = "task_1";
        ScheduleTask task_1 = h2Service.getTaskById(taskId);
        System.out.println("before update -> " + task_1);

        String taskName = task_1.getTaskName() + "_new";
        task_1.setTaskName(taskName);
        h2Service.updateTask(task_1);

        task_1 = h2Service.getTaskById(taskId);
        System.out.println("after update -> " + task_1);
    }

    @Test
    public void delTask() {
        String taskId = "task_1";
        System.out.println(taskId + "exist " + h2Repository.existsById(taskId));
        h2Service.delTaskById("task_1");
        System.out.println("after del : " + taskId + "exist " + h2Repository.existsById(taskId));
    }
}
