drop table if exists `account_info`;
show create table `account_info`;
create table `account_info`
(
    `id`          bigint(20) unsigned not null auto_increment comment '主键ID',
    `biz_id`      varchar(64)         not null default '' comment '第三方平台用户ID',
    `username`    varchar(64)         not null default '' comment '用户名',
    `password`    varchar(64)         not null default '' comment '用户密码',
    `email`       varchar(64)         not null default '' comment '用户邮件地址',
    `phone`       varchar(64)         not null default '' comment '用户手机号',
    `cookie`      varchar(1024)       not null default '' comment '用户cookie信息',
    `sex`         tinyint(4) unsigned not null default 0 comment '用户性别：枚举值参考SexEnum',
    `login_type`  tinyint(4) unsigned not null default 0 comment '登录方式：枚举值参考LoginTypeEnum',
    `platform`    tinyint(4) unsigned not null default 0 comment '第三方平台类型：枚举值参考PlatFormTypeEnum',
    `create_time` timestamp           not null default current_timestamp comment '创建时间',
    `update_time` timestamp           not null default current_timestamp on update current_timestamp comment '更新时间',
    `is_deleted`  tinyint(4) unsigned not null default 0 comment '是否被删除：0、未删除 1、已删除',
    primary key `pk_id` (`id`),
    index `idx_biz_id` (`biz_id`)
) engine = InnoDB comment ='账户信息表';