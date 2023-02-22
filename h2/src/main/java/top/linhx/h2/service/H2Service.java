package top.linhx.h2.service;

import top.linhx.h2.entity.ScheduleTask;

import java.util.List;

public interface H2Service {
    List<ScheduleTask> getTask(int pageNum, int pageSize);

    ScheduleTask getTaskById(String id);

    ScheduleTask addTask(ScheduleTask task);

    void updateTask(ScheduleTask task);

    void delTaskById(String id);
}
