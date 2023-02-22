package top.linhx.h2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import top.linhx.h2.entity.ScheduleTask;
import top.linhx.h2.repository.H2Repository;
import top.linhx.h2.service.H2Service;

import java.util.List;

@Service
public class H2ServiceImpl implements H2Service {

    @Autowired
    private H2Repository h2Repository;

    @Override
    public List<ScheduleTask> getTask(int pageNum, int pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNum, pageSize);
        Page<ScheduleTask> taskPage = h2Repository.findAll(pageRequest);
        return taskPage.getContent();
    }

    @Override
    public ScheduleTask getTaskById(String id) {
        return h2Repository.findById(id).orElse(null);
    }

    @Override
    public ScheduleTask addTask(ScheduleTask task) {
        return h2Repository.save(task);
    }

    @Override
    public void updateTask(ScheduleTask task) {
        h2Repository.save(task);
    }

    @Override
    public void delTaskById(String id) {
        h2Repository.deleteById(id);
    }
}
