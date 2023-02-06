use java_workshop;
CREATE TABLE if not exists `t_demo`
(
    `id`          bigint unsigned NOT NULL AUTO_INCREMENT,
    `create_time` datetime        NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `update_time` datetime        NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    `name`        varchar(32)     NOT NULL DEFAULT '',
    PRIMARY KEY (`id`),
    UNIQUE KEY `uniq_name` (`name`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

quit;