CREATE TABLE MEMBER(
           id LONG AUTO_INCREMENT PRIMARY KEY,
           name VARCHAR(255) NOT NULL,
           address VARCHAR(255) NOT NULL,
           createdDate TIMESTAMP NOT NULL,
           updatedDate TIMESTAMP NOT NULL,
           createdBy VARCHAR(255) NOT NULL,
           updatedBy VARCHAR(255) NOT NULL
);

CREATE TABLE POST(
        id LONG AUTO_INCREMENT PRIMARY KEY,
        title VARCHAR(255) NOT NULL,
        contents VARCHAR(255) NOT NULL,
        likeCnt INT NOT NULL DEFAULT 0,
        createdDate TIMESTAMP NOT NULL,
        updatedDate TIMESTAMP NOT NULL,
        createdBy VARCHAR(255) NOT NULL,
        updatedBy VARCHAR(255) NOT NULL
);