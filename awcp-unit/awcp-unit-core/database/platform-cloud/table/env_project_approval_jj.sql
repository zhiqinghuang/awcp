
CREATE TABLE `env_project_approval_jj` (
  `APPROVAL_ID` varchar(36) NOT NULL COMMENT '评审表ID',
  HAS_CREATIVELY_USE_NEW_TECH VARCHAR(100) NULL DEFAULT NULL COMMENT '是否创造性运用科学技术新知识,枚举，是或者否',
  IS_NEW_TECH_VALUABLE VARCHAR(100) NULL DEFAULT NULL COMMENT '在技术、工艺、产品（服务）方面的创新是否有价值,枚举，是或者否',
  IS_EFFECTIVE VARCHAR(100) NULL DEFAULT NULL COMMENT '对本市该领域的技术、工艺领先是否有推动作用,枚举，是或者否',
  PRIMARY KEY (`APPROVAL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '加计扣除审批表的特殊信息表';
