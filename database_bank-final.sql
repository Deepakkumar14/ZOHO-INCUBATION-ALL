CREATE database bank;
use bank;

CREATE TABLE customer_details
       (customer_id int PRIMARY KEY  not null,
       full_name VARCHAR(30)not null,
       city VARCHAR(15)not null);
      
 CREATE TABLE account_details
   (   
        customer_id  int   not null,
      account_number bigint not null ,
       balance decimal(14,4) ,
 
      CONSTRAINT ac_number_pk PRIMARY KEY(account_number),
    CONSTRAINT account_custid_fk FOREIGN KEY(customer_id) REFERENCES customer_details(customer_id)); 
      
       INSERT INTO customer_details VALUES(0001,'Dhatchinamoorthi','karaikudi'),
	   (0002,'Arun','paramakudi'),
	  (0003,'vijay','sivagangai'),
	   (0004,'Saravanan','karur'),
		(0005,'Markret','sivagangai'),
		(0006,'Janet','karur'),
		(0007,'Azhagusundaram','sivakasi'),
		(0008,'Deepak','Tiruvannamalai'),
		(0009,'Logehsan','Madurai'),
		(0010,'Frank','Dindugal');
	
     INSERT INTO account_details VALUES(0001,124001,100000);
     INSERT INTO account_details VALUES(0001,124002,123456);
     INSERT INTO account_details VALUES(0001,124003,321654);
	
	   INSERT INTO account_details VALUES(0002,124010,100600);
        INSERT INTO account_details VALUES(0002,123020,104560);
         INSERT INTO account_details VALUES(0002,134030,104710);
         
	   INSERT INTO account_details VALUES(0003,234200,700000);
        INSERT INTO account_details VALUES(0003,234010,300000);
         INSERT INTO account_details VALUES(0003,23400,200000);
         
	   INSERT INTO account_details VALUES(0004,123456,100000);
       INSERT INTO account_details VALUES(0004,123465,200000);
       INSERT INTO account_details VALUES(0004,123654,300000);
       
		INSERT INTO account_details VALUES(0005,123643,300000);
        INSERT INTO account_details VALUES(0005,123345,400000);
        INSERT INTO account_details VALUES(0005,126543,200000);
        
		INSERT INTO account_details VALUES(0006,123423,1200000);
		INSERT INTO account_details VALUES(0007,126435,1300000);
		INSERT INTO account_details VALUES(0008,321654,1100000);
		INSERT INTO account_details VALUES(0009,526131,1300000);
		INSERT INTO account_details VALUES(0010,634512,100300); 
        
