package top.linhx.h2.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ScheduleTask {
    @Id
    private String taskId;
    private String taskName;
    private String cron;
    private String remark;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ScheduleTask that = (ScheduleTask) o;
        return taskId != null && Objects.equals(taskId, that.taskId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
