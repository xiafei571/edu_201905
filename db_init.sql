-- 创建数据库
CREATE DATABASE setsu0406;

-- 使用数据库
USE setsu0406;

-- 创建部门表
CREATE TABLE `dept` (
  `deptno` int(4) NOT NULL AUTO_INCREMENT COMMENT '部门ID',
  `dname` varchar(14) DEFAULT NULL COMMENT '部门名称',
  `loc` varchar(13) DEFAULT NULL COMMENT '所在地',
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8;

/* 修改主键为自增 */ 
-- ALTER TABLE `dept` CHANGE `deptno` `deptno` INT(4)  NOT NULL  AUTO_INCREMENT  COMMENT '部门ID';

-- 学生表
CREATE TABLE `student` (
  `sid` int(10) NOT NULL AUTO_INCREMENT COMMENT '学生ID',
  `sname` varchar(10) DEFAULT NULL COMMENT '学生名前',
  `sex` int(2) DEFAULT '0' COMMENT '性別　0無知　1男　2女',
  `birth` date DEFAULT NULL COMMENT '生年月日',
  `loc` varchar(10) DEFAULT NULL COMMENT '出身',
  `ethnic` varchar(10) DEFAULT NULL COMMENT '民族',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=20190004 DEFAULT CHARSET=utf8;

-- 创建员工表
CREATE TABLE `emp` (
  `empno` int(4) NOT NULL AUTO_INCREMENT COMMENT '员工编号',
  `ename` varchar(10) NOT NULL DEFAULT '' COMMENT '员工姓名',
  `job` varchar(10) DEFAULT NULL COMMENT '职位',
  `mgr` int(4) DEFAULT NULL COMMENT '上级ID',
  `hiredate` date DEFAULT NULL COMMENT '入职时间',
  `sal` int(7) DEFAULT NULL COMMENT '薪资',
  `deptno` int(2) DEFAULT NULL COMMENT '部门ID',
  PRIMARY KEY (`empno`)
) ENGINE=InnoDB AUTO_INCREMENT=7936 DEFAULT CHARSET=utf8;

-- 图书表
CREATE TABLE `book` (
  `bookId` int(4) NOT NULL AUTO_INCREMENT COMMENT '图书ID',
  `bname` varchar(14) DEFAULT NULL COMMENT '图书名称',
  `btype` varchar(13) DEFAULT NULL COMMENT '类型',
  `price` decimal(10,0) DEFAULT '0' COMMENT '类型',
  `author` varchar(13) DEFAULT NULL COMMENT '作者',
  PRIMARY KEY (`bookId`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8;

-- 初始化数据
INSERT INTO `dept` (`deptno`, `dname`, `loc`)
VALUES
  (10, '开发部', '东京'),
  (20, '测试部', '东京'),
  (30, '人力资源部', '东京'),
  (40, '销售部', '大阪'),
  (50, '研究所', '京都'),
  (60, '运营部', '名古屋'),
  (62, 'test2', '北京');


INSERT INTO `book` (`bookId`, `bname`, `btype`, `price`, `author`)
VALUES
  (100, '《人类简史》', '历史', 35, '尤瓦尔'),
  (101, '《哈利波特》', '小说', 50, 'JK罗琳'),
  (102, '《平凡的世界》', '小说', 29, '陆瑶'),
  (103, '《Java编程思想》', '技术', 99, '李教授'),
  (104, '《时间简史》', '科普', 56, '霍金'),
  (105, '《钢铁是怎样练成的》', '传记', 78, '聂夫托尔斯泰'),
  (106, '小盖自传', '自传', 199, '小盖');


INSERT INTO `emp` (`empno`, `ename`, `job`, `mgr`, `hiredate`, `sal`, `deptno`)
VALUES
  (7369, '周伯通', '测试', 7566, '2019-01-01', 800, 20),
  (7499, '欧阳克', '销售', 7900, '2018-02-20', 1600, 40),
  (7521, '周芷若', 'HR', 7844, '2018-02-22', 1250, 30),
  (7566, '杨康', '部门经理', 7839, '2018-04-02', 2975, 20),
  (7654, '张无忌', '开发', 7698, '2018-09-28', 4250, 50),
  (7698, '张三丰', '研究总管', 7839, '2018-05-01', 5850, 50),
  (7782, '黄蓉', '部门经理', 7839, '2018-06-09', 3450, 10),
  (7788, '杨过', '自动化测试', 7566, '2018-04-19', 3000, 20),
  (7839, '郭靖', '总管', NULL, '2018-11-17', 5000, 10),
  (7844, '灭绝师太', 'HRBP', 7839, '2018-09-08', 1500, 30),
  (7876, '小龙女', '测试', 7566, '2018-05-23', 1500, 20),
  (7900, '欧阳锋', '销售经理', 7839, '2018-12-03', 1950, 40),
  (7902, '李莫愁', '性能测试', 7566, '2018-12-03', 3100, 20),
  (7934, '郭襄', '开发', 7782, '2018-01-23', 3000, 10),
  (7935, '霍元甲', '武夫', 1001, '2019-01-01', 9000, 1001);


INSERT INTO `student` (`sid`, `sname`, `sex`, `birth`, `loc`, `ethnic`)
VALUES
  (20190001, 'tom', 0, '1980-01-01', '东京', '汉族'),
  (20190002, 'json', 2, '1990-02-02', '北京', '满族'),
  (20190003, '梁同学', 1, '2019-01-01', '吉林', '朝鲜族');

-- FIFA dataset
-- mysql --local-infile -uroot -p
-- LOAD DATA LOCAL INFILE '/root/software/data.csv' INTO TABLE players FIELDS TERMINATED BY ',' ENCLOSED BY '"' LINES TERMINATED BY '\n' IGNORE 1 ROWS SET Joined_date = STR_TO_DATE(@Joined_date, '%m %d, %Y');

CREATE TABLE `user` (
  `uid` int(8) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `loginId` varchar(20) NOT NULL DEFAULT '' COMMENT '登录ID',
  `uname` varchar(16) NOT NULL DEFAULT '' COMMENT '用户姓名',
  `password` varchar(16) NOT NULL DEFAULT '' COMMENT 'password',
  `email` varchar(20) DEFAULT '' COMMENT 'email',
  `phone` varchar(20) DEFAULT '' COMMENT 'phone',
  `valid` tinyint(4) NOT NULL DEFAULT '1' COMMENT '1有效 0无效',
  `gmt_create` date DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` date DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`uid`),
  UNIQUE KEY `loginId` (`loginId`)
) ENGINE=InnoDB AUTO_INCREMENT=1002 DEFAULT CHARSET=utf8;

INSERT INTO `user` (`uid`, `loginId`, `uname`, `password`, `email`, `phone`, `valid`, `gmt_create`, `gmt_modified`)
VALUES
  (1001, 'admin', '管理员', '7A57A5A743894A0E', 'admin@demo.com', '+81 13877665544', 1, '2019-07-26', '2019-07-26');

