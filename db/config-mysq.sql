CREATE TABLE `sys_dd_value` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编码',
  `dd_key` varchar(64) NOT NULL COMMENT '数据字典编码',
  `dd_label` varchar(128) NOT NULL COMMENT '数据字典域名称',
  `dd_value` varchar(500) NOT NULL COMMENT '数据字典域取值',
  `seq_no` int(11) DEFAULT NULL COMMENT '顺序号',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_enable` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否可用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12184 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT