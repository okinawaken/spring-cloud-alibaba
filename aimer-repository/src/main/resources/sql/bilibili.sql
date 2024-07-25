drop table if exists `account_info`;
create table `account_info`
(
    `id`          int(11) unsigned not null auto_increment comment '主键ID',
    `biz_id`      varchar(64)      not null default '' comment '第三方平台用户ID',
    `username`    varchar(64)      not null default '' comment '用户名',
    `password`    varchar(64)      not null default '' comment '用户密码',
    `email`       varchar(64)      not null default '' comment '用户邮件地址',
    `sex`         tinyint(4)       not null default 0 comment '用户性别：0、未知 1、男 2、女',
    `cookie`      varchar(1024)    not null default '' comment '用户cookie信息',
    `login_type`  tinyint(4)       not null default 0 comment '登录方式：0、账号密码登录 1、邮件登录 2、cookie登录',
    `platform`    tinyint(4)       not null default 0 comment '第三方平台类型：0、哔哩哔哩',
    `create_time` timestamp        not null default current_time comment '创建时间',
    `update_time` timestamp        not null default current_time on update current_time comment '更新时间',
    `is_deleted`  tinyint(4)       not null default 0 comment '是否被删除：0、未删除 1、已删除'
) engine = InnoDB comment ='账户信息表';