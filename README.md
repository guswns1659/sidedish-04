# 1. 프로젝트 소개
반찬을 판매하는 온라인 쇼핑몰 어플리케이션 개발 프로젝트    

# 2. 서비스 링크
[서비스 링크]()

# 3. 사용기술
- API 개발 : 스프링 프레임워크, 
- API 배포 : AWS EC2, Nginx
- 로그인 인증 : GitHub OfAuth
- 데이터베이스 : Mysql, Spring Data JDBC

# 4. 개발내용
- 클라이언트가 로그인 시도 시 Github OAuth를 통해 로그인 기능 구현  
- 클라이언트가 반찬 전체 목록 또는 1건 조회 시 해당 데이터 응답하는 API 개발 

# 5. 어려움과 해결책
## 5.1 어려움 : DB 설계 시 객체 간 N:M 관계 설정 
- 문제 : N:M 관계를 갖는 객체들을 DB에서 insert하고 select할 때 어려움을 겪음. 
- 해결책 : 현재 이해안되는 N:M 대신 1:N 관계로 설정. 


## 프로젝트 피드백
- 2명이 1조로 함께 개발을 했는데 기능을 분담하지 않고 각자 기능을 구현하는 방법으로 정했다. 이런 방식으로 하니 모든 기능을 구현해볼 수 있어서 좋았다. 
- 

## Api 문서 
[Api 문서]()
