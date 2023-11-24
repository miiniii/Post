INSERT INTO MEMBER(name, address, createdDate, updatedDate, createdBy, updatedBy)
VALUES ('아이유', '강남구', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin'),
       ('aaa', '용산구', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin'),
       ('bbb', '영등포구', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');

INSERT INTO POST(title, contents,likeCnt ,createdDate, updatedDate, createdBy, updatedBy)
VALUES ('테스트 제목1', '테스트 내용1', 0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin'),
       ('테스트 제목2', '테스트 내용2', 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin'),
       ('테스트 제목3', '테스트 내용3', 2, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'admin', 'admin');