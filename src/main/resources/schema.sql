CREATE TABLE MEMBER(
                       id LONG AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(255) NOT NULL,
                       address VARCHAR(255) NOT NULL,
                       createdDate TIMESTAMP NOT NULL,
                       updatedDate TIMESTAMP NOT NULL,
                       createdBy VARCHAR(255) NOT NULL,
                       updatedBy VARCHAR(255) NOT NULL
);