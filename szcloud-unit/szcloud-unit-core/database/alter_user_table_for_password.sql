ALTER TABLE p_un_manage_user_base_info
CHANGE COLUMN USER_PWD USER_PWD VARCHAR(48) NOT NULL COMMENT '密码';
ALTER TABLE p_un_user_base_info
CHANGE COLUMN USER_PWD USER_PWD VARCHAR(48) NOT NULL COMMENT '密码';
ALTER TABLE p_un_dev2_user_info
CHANGE COLUMN `PASSWORD` `PASSWORD` VARCHAR(48) NOT NULL COMMENT '密码';