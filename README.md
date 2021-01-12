# 서버프로그램 시험

## 환경 및 활용도구
- Windows
- jdk  version 1.8
- Tomcat9.0
- sts tool
- Database : mySQL 8.0
- Postman
- lombok.jar
- gson (json파싱)
- Encoding : UTF-8
- github

## 데이터 베이스

### MySQL 데이터 베이스 생성 및 사용자 생성

### root
```sql
create user 'serveruser'@'%' identified by 'bitc5600';
GRANT ALL PRIVILEGES ON *.* TO 'serveruser'@'%';
create database serveruser;
```


### serveruser
```sql
use serveruser;
create table users;

CREATE TABLE user(
    id int primary key auto_increment,
    username varchar(100) not null unique,
    password varchar(100) not null,
    email varchar(100) not null,
    role varchar(20)
) engine=InnoDB default charset=utf8;



insert into user(username,password,email,role) values('ssar','1234','ssar@nate.com','user');
commit;
```