# 프로젝트 소개
반찬을 판매하는 온라인 쇼핑몰 어플리케이션 개발 프로젝트    

# 서비스 이미지

<details markdown="1">
<summary> 메인, 상세페이지, Github OAuth </summary>

## 메인페이지
![메인페이지](https://github.com/codesquad-member-2020/sidedish-04/blob/develop/BE/serviceImages/1.png)

## 상세페이지
![상세페이지](https://github.com/codesquad-member-2020/sidedish-04/blob/develop/BE/serviceImages/%EC%83%81%EC%84%B8%ED%8E%98%EC%9D%B4%EC%A7%80.png)

## OAuth 로그인
![로그인](https://github.com/codesquad-member-2020/sidedish-04/blob/develop/BE/serviceImages/%EB%A1%9C%EA%B7%B8%EC%9D%B8%20%EB%B2%84%ED%8A%BC%20%ED%81%B4%EB%A6%AD%20%EC%8B%9C%20github%20OAuth.png)

</details>

# 프로젝트 속 나의 역할 
- 백엔드 개발자 : DB 설계, 배포 서버 운영, API 개발 

# 개발환경 [참고](https://www.slideshare.net/hyeonjaeCheon/ss-122972422)해서 수정하기.
- API 개발 : 스프링 프레임워크, 
- API 배포 : AWS EC2, Nginx
- 로그인 인증 : GitHub OAuth
- 데이터베이스 : Mysql, Spring Data JDBC

# 설계 구조 
- ERD 사진 첨부 후 설명하기. 

# 구현 기능
## 4.1 Github OAuth를 이용한 로그인 기능 구현
### OAuth 사용 이유 
- 회원 정보 DB를 직접 운영하지 않고도 로그인 기능을 구현하기 위함. 
### 어떻게 
- [GitHub 공식 가이드](https://developer.github.com/apps/building-oauth-apps/authorizing-oauth-apps/) 참고하며 구현. 

## Spring Jdbc Template 활용한 CRUD 구현 
### Jdbc Template 사용 이유 
- CrudRepositoy 제외하고 DB 쿼리를 직접 작성해서 Crud를 구현하고 싶은 욕구 
### 어떻게 
- 

# 어려움과 해결책
## 5.1 어려움 : DB 설계 시 객체 간 N:M 관계 설정 
- 문제 : N:M 관계를 갖는 객체들을 DB에서 insert하고 select할 때 어려움을 겪음. 
- 해결책 : 현재 이해안되는 N:M 대신 1:N 관계로 설정. 


## 프로젝트 피드백
- 2명이 1조로 함께 백엔드 개발을 했는데 기능을 분담하지 않고 각자 기능을 구현하는 방법으로 정했다. 이런 방식으로 하니 모든 기능을 구현해볼 수 있어서 좋았다. 

## Api 문서 
[Api 문서](https://github.com/codesquad-member-2020/sidedish-04/wiki/Api-Docs)
