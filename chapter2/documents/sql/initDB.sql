CREATE DATABASE `smart` /*!40100 COLLATE 'latin1_swedish_ci' */;

CREATE TABLE `customer` (
	`id` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'ID（自增主键）',
	`name` VARCHAR(255) NOT NULL DEFAULT '0' COMMENT '客户名称',
	`contact` VARCHAR(255) NOT NULL DEFAULT '0' COMMENT '联系人',
	`telephone` VARCHAR(255) NULL DEFAULT '0' COMMENT '电话号码',
	`email` VARCHAR(255) NULL DEFAULT '0' COMMENT '邮箱地址',
	`remark` VARCHAR(500) NULL DEFAULT '0' COMMENT '备注',
	PRIMARY KEY (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB;
