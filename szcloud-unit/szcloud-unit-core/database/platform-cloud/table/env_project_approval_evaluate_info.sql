CREATE TABLE `env_project_approval_evaluate_info` (
  `APPROVAL_ID` varchar(36) NOT NULL COMMENT '审批表ID',
  INSTITUTION_CONSTRUCTIO INT NULL DEFAULT NULL COMMENT '制度建设',
  PLATFORM_CONDITION INT NULL DEFAULT NULL COMMENT '研发基础条件',
  EXPECT_BENEFIT INT NULL DEFAULT NULL COMMENT '经济社会贡献度',
  MORALITY INT NULL DEFAULT NULL COMMENT '思想品德',
  SCIENCE_CONTRIBUTION INT NULL DEFAULT NULL COMMENT '科技贡献',
  SOCIAL_REPUTATION INT NULL DEFAULT NULL COMMENT '社会威望',
  TOTAL INT NULL DEFAULT NULL COMMENT '评分结果-总分',
  PRIMARY KEY (`APPROVAL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '审批评分信息表-科学技术奖－处室审批表';