# SSM_for_CZH
写的一个SSM框架demo，只有用户名密码匹配和插入一条用户两个接口
## 环境
JDK1.8

MySQL8.0（用的8.0.16版本驱动）

Tomcat8

Maven3.6

## 数据库配置
mysql账户：root  密码:123

库：csn

表：csnuser,五个字段

####  建表sql（直接在csn库中执行即可）
~~~
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for csnuser
-- ----------------------------
DROP TABLE IF EXISTS `csnuser`;
CREATE TABLE `csnuser`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of csnuser
-- ----------------------------
INSERT INTO `csnuser` VALUES (1, '测试1628', 'qheqh', NULL, NULL);
INSERT INTO `csnuser` VALUES (2, 'admin', '1', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;


