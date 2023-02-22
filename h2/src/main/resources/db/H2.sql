CREATE TABLE if not exists schedule_task
(
    task_id   varchar(20) PRIMARY KEY,
    task_name varchar(20),
    cron      varchar(40),
    remark    varchar(100)
);


insert into schedule_task
values ('task_0', '任务 0', '0/5 * * * * ? *', '每 5s 运行一次'),
       ('task_1', '任务 1', '0/5 * * * * ? *', '每 5s 运行一次'),
       ('task_2', '任务 2', '0/10 * * * * ? *', '每 10s 运行一次'),
       ('task_3', '任务 3', '0/10 * * * * ? *', '每 10s 运行一次'),
       ('task_4', '任务 4', '0/15 * * * * ? *', '每 15s 运行一次'),
       ('task_5', '任务 5', '0/15 * * * * ? *', '每 15s 运行一次'),
       ('task_6', '任务 6', '0 * * * * ? *', '每 1m 运行一次'),
       ('task_7', '任务 7', '0 0/2 * * * ? *', '每 2m 运行一次'),
       ('task_8', '任务 8', '0 0/30 * * * ? *', '每 30m 运行一次'),
       ('task_9', '任务 9', '0 0 0/1 * * ? *', '每 1h 运行一次');