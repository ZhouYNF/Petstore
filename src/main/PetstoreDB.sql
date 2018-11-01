
create table petstore_order (
or_id	integer primary key ,
or_petId	integer,
or_quantity	integer,
or_shipDate	varchar(50),
or_status	ENUM('placed','approved','delivered'),
or_complete	boolean default false
);

 create table petstore_Category(
  cg_id	integer primary key ,
  cg_name	varchar(20)
    );
insert into petstore_Category values
(1,'猫'),(2,'狗'),(3,'猪');

   create table petstore_User (
     User_id integer primary key ,
     User_username varchar(20),
     User_firstName varchar(20),
     User_lastName  varchar(20),
     User_email  varchar(20),
     User_password  varchar(20),
     User_phone  varchar(20),
     User_userStatus integer
   );

insert  into petstore_User values
(1,"张三","张","三","1010sadas@qq.com","1234567","13128293928",1),
(2,"李四","李","四","1010asdass@qq.com","1234567","1312324324",2),
(3,"王五","王","五","1010aadasass@qq.com","1234567","1312324324",3);

create table petstore_Tag (
  Tag_id integer primary key,
  Tag_name varchar(20)
);
insert into petstore_Tag values
(1,'神魔都没有'),(2,'还是神魔都没有'),(3,'一样是神魔都没有');

create table petstore_Pet (
 pet_id          integer primary key,
 pet_category_id integer,
 pet_name        varchar(50),
 pet_photoUrls   varchar(50),
 pet_tags_id     integer,
 pet_status      Enum ('available', 'pending', 'sold')
);

insert into petstore_Pet values
(1,1,'橘猫','ddddd',1,'available'),
(2,2,'泰迪','ccc',2,'available'),
(3,3,'小猪佩奇','dddd',3,'available');

 create table petstore_ApiResponse (
   ar_code integer,
   ar_type varchar(20),
   ar_message varchar(20)
 );