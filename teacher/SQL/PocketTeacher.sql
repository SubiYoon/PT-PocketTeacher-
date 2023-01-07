use pocketteacher;

DROP TABLE user;

CREATE TABLE user
(
  user_code INT      NOT NULL AUTO_INCREMENT COMMENT '유저코드',
  user_id   VARCHAR(20) NOT NULL COMMENT '아이디',
  user_pwd  VARCHAR(20) NOT NULL COMMENT '비밀번호',
  user_name VARCHAR(20) NOT NULL COMMENT '이름',
  user_tel   VARCHAR(20) NOT NULL COMMENT '전화번호',
  PRIMARY KEY (user_code)
) COMMENT '유저';

select * from user;