CREATE TABLE if not exists schedule_task (
   task_id varchar(20) PRIMARY KEY,
   task_name varchar(20),
   cron varchar(40),
   remark varchar(100)
);