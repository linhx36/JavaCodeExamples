package top.linhx.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.linhx.h2.entity.ScheduleTask;

@Repository
public interface H2Repository extends JpaRepository<ScheduleTask, String> {

}
