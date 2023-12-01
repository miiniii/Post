INSERT INTO MEMBER(loginId, password, name, email, phoneNumber,
                   createdDate, updatedDate, createdBy, updatedBy)
VALUES ('IUIUIU01','abc123123!', '아이유', 'IUIU0302@naver.com','010-1234-1234', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin'),
       ('aaa0001','dasd12!@#','aaa','adsd@daum.net','010-1233-6456', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin'),
       ('bbbas','asd123','bbb', 'sadas@gmail.com','010-7657-2334', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');

INSERT INTO POST(title, contents,likeCnt ,createdDate, updatedDate, createdBy, updatedBy)
VALUES ('테스트 제목1', '테스트 내용1', 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin'),
       ('테스트 제목2', '테스트 내용2', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin'),
       ('테스트 제목3', '테스트 내용3', 2, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');