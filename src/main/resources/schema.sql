CREATE TABLE MEMBER(
           id LONG AUTO_INCREMENT PRIMARY KEY,
           loginId VARCHAR(255) UNIQUE NOT NULL,
           password VARCHAR(10) NOT NULL,
           name VARCHAR(255) NOT NULL,
           email VARCHAR(255) NOT NULL,
           phoneNumber VARCHAR(15) NOT NULL,
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