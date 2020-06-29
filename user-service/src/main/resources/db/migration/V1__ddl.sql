CREATE TABLE user_data
  (
     id         INTEGER NOT NULL,
     email      VARCHAR(255),
     name       VARCHAR(255),
     age 		VARCHAR(50),
     PRIMARY KEY (id)
  );
  
  INSERT INTO user_data 
  values (1,'rohit@gmail.com','rohit', '25');
  
  INSERT INTO user_data 
  values (2,'ashish@gmail.com','ashish', '24');
  
  INSERT INTO user_data 
  values (3,'jitesh@gmail.com','jitesh', '23');