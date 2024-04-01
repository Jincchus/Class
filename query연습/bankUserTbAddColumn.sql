-- 테이블 분리 origin_file_name, upload_file_name
alter table user_tb
add column origin_file_name varchar(255),
add column upload_file_name varchar(255);

-- user_tb e-mail column 추가
alter table user_tb
add column e_mail varchar(255);

SELECT * FROM user_tb;

#unique 속성 추가
ALTER TABLE user_tb ADD CONSTRAINT e_mail UNIQUE (e_mail);