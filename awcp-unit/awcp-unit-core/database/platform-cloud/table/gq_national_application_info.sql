CREATE TABLE `gq_national_application_info` (
  `ID` varchar(36) NOT NULL COMMENT '填报号',
  `YEAR` INT NULL COMMENT '业务年度',
  `COMPANY_REGION` varchar(255) NOT NULL COMMENT '企业所在地',
  `COMPANY_NAME` varchar(255) NOT NULL COMMENT '企业名称',
  `REGISTER_TYPE` varchar(255) DEFAULT NULL COMMENT '注册类型',
  `REGISTER_DATE` date DEFAULT NULL COMMENT '注册日期',
  `ORG_CODE` varchar(20) DEFAULT NULL COMMENT '法人代码',
  `CORPORATE_REPRESENTATIVE` varchar(100) DEFAULT NULL COMMENT '法人名称',
  `CONTACT_EMAIL` varchar(255) DEFAULT NULL COMMENT '联系邮件',
  `TAX_CODE` varchar(20) DEFAULT NULL COMMENT '税务登记号',
  `ADDRESS` varchar(255) DEFAULT NULL COMMENT '通信地址',
  `POST_CODE` varchar(20) DEFAULT NULL COMMENT '邮政编码',
  `CONTACT_PERSON` varchar(20) DEFAULT NULL COMMENT '联系人姓名',
  `CONTACT_MOBILE` varchar(20) DEFAULT NULL COMMENT '联系人手机',
  `CONTACT_PHONE` varchar(100) DEFAULT NULL COMMENT '联系人电话',
  `PRODUCT_FIELD` varchar(100) DEFAULT NULL COMMENT '主营产品所属技术领域',
  `PATENT` int(11) DEFAULT NULL COMMENT '近三年发明专利数量',
  `PRA_PATENT` int(11) DEFAULT NULL COMMENT '近三年实用型专利数量',
  `SUR_PATENT` int(11) DEFAULT NULL COMMENT '近三年外观设计专利数量',
  `AUTHORISED_SOFTWARE` int(11) DEFAULT NULL COMMENT '近三年软件著作权数量',
  `OWN_IC_LAYOUT` int(11) DEFAULT NULL COMMENT '近三年集成电路布图设计专有权数量',
  `DISCOVER_PLANT` int(11) DEFAULT NULL COMMENT '近三年植物新品种数量',
  `OTHER_INTELLECTUAL_PROPERTY` int(11) DEFAULT NULL COMMENT '近三年其他知识产权数量',
  `TOTAL_EMPLOYEE` int(11) DEFAULT NULL COMMENT '职工总数',
  `ABOVE_JUN_COL_EMPLOYEE` int(11) DEFAULT NULL COMMENT '大专以上学历科技人员数',
  `RD_EMPLOYEE` int(11) DEFAULT NULL COMMENT '从事研究开放人员数',
  `RETURNED_STUDENT_EMPLOYEE` int(11) DEFAULT NULL COMMENT '留学归国人员数',
  `SALES_REVENUE_1` decimal(19,2) DEFAULT NULL COMMENT '去年销售收入',
  `SALES_REVENUE_2` decimal(19,2) DEFAULT NULL COMMENT '前年销售收入',
  `SALES_REVENUE_3` decimal(19,2) DEFAULT NULL COMMENT '大前年销售收入',
  `TOTAL_ASSETS_1` decimal(19,2) DEFAULT NULL COMMENT '去年资产总额',
  `TOTAL_ASSETS_2` decimal(19,2) DEFAULT NULL COMMENT '前年资产总额',
  `TOTAL_ASSETS_3` decimal(19,2) DEFAULT NULL COMMENT '大前年资产总额',
  `HICH_TECH_SALES_REV` decimal(19,2) DEFAULT NULL COMMENT '去年高新技术产品（服务）收入（万元）',
  `TOTAL_RD_EXPENSE` decimal(19,2) DEFAULT NULL COMMENT '前三年研发费用总额',
  `TOTAL_INTERANL_RD_EXPENSE` decimal(19,2) DEFAULT NULL COMMENT '前三年国内研发费用总额',
  `INSIDE_RD_EXPENSE_1` decimal(19,2) DEFAULT NULL COMMENT '去年内部研究开发投入额合计',
  `OTHER_RD_EXPENSE_1` decimal(19,2) DEFAULT NULL COMMENT '去年其他研究开发费用合计',
  `PRE_RD_EXPENSE_1` decimal(19,2) DEFAULT NULL COMMENT '去年委托外部研究开发投入额合计',
  `INTERNAL_OUTSIDE_RD_EXPENSE_1` decimal(19,2) DEFAULT NULL COMMENT '前年境内的外部研发投入额',
  `INSIDE_RD_EXPENSE_2` decimal(19,2) DEFAULT NULL COMMENT '前年内部研究开发投入额合计',
  `OTHER_RD_EXPENSE_2` decimal(19,2) DEFAULT NULL COMMENT '前年其他研究开发费用合计',
  `PRE_RD_EXPENSE_2` decimal(19,2) DEFAULT NULL COMMENT '前年委托外部研究开发投入额合计',
  `INTERNAL_OUTSIDE_RD_EXPENSE_2` decimal(19,2) DEFAULT NULL COMMENT '前年境内的外部研发投入额',
  `INSIDE_RD_EXPENSE_3` decimal(19,2) DEFAULT NULL COMMENT '大前年内部研究开发投入额合计',
  `OTHER_RD_EXPENSE_3` decimal(19,2) DEFAULT NULL COMMENT '大前年其他研究开发费用合计',
  `PRE_RD_EXPENSE_3` decimal(19,2) DEFAULT NULL COMMENT '大前年委托外部研究开发投入额合计',
  `INTERNAL_OUTSIDE_RD_EXPENSE_3` decimal(19,2) DEFAULT NULL COMMENT '大前年境内的外部研发投入额',
  `APP_TYPE` varchar(20) DEFAULT NULL COMMENT '申报类型',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='国家高新技术企业认定的申请书';
