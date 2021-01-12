# 서버프로그램 시험

## 요구사항

### 제작 내용
1) JSP/Servlet Model 2 기반의 웹 애플리케이션을 구현한다.
2) MySQL DB와 연동하고 기본적인 CRUD 동작을 포함한다.

### 요구 사항

- User 테이블을 생성한다. (id, username, password, email, role)
- MVC 서버를 구축한다. (userList.jsp, login.jsp, join.jsp 필요)
- (role 종류 = user, admin)
- 회원가입, 로그인 기능을 포함한다.
- 일반 user가 로그인하면 자신의 정보만 삭제할 수 있다.
- 관리자 admin으로 로그인하면 모든 정보를 삭제할 수 있다.
- 부트스트랩을 이용하여 디자인한다.

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

## 이벤트 흐름

![Screenshot_3](https://user-images.githubusercontent.com/44068819/104349401-3b8b7900-5546-11eb-91c4-dab06a0f65f2.png)
![Screenshot_4](https://user-images.githubusercontent.com/44068819/104349420-3fb79680-5546-11eb-9e0d-aec06c4ab050.png)
![Screenshot_5](https://user-images.githubusercontent.com/44068819/104349483-5231d000-5546-11eb-8909-ede7134144f1.png)
![Screenshot_7](https://user-images.githubusercontent.com/44068819/104349457-4a722b80-5546-11eb-903e-fd734a23b1df.png)
![Screenshot_8](https://user-images.githubusercontent.com/44068819/104349508-5b22a180-5546-11eb-8a11-8e0c68131f6c.png)
![Screenshot_9](https://user-images.githubusercontent.com/44068819/104349513-5cec6500-5546-11eb-8201-ccc4b19967b9.png)
