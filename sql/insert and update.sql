use Blog;
show create table tag_post;

alter table comments add date_of_comment date;

alter table category drop foreign key cat_id_fk;

alter table category add constraint cat_id_fk foreign key (parent_cat_id)
        references category (cat_id);

alter table comments change content  text1 varchar(50);

alter table comments modify content;


delete from blog_table where bg_id=1;

select * from blog_table;



select * from category;



select * from comments;


select * from post;



select * from tag_post;


select * from tag;





insert into blog_table (bg_id,bg_name,bg_url,created_date)
values (2,'blog2','blog2.com',"2012-01-02"),
(3,'blog3','blog3.com',"2012-01-03"),
 (4,'blog4','blog4.com',"2012-01-04"),
 (5,'blog5','blog5.com',"2012-01-05");




insert into category(cat_id,cat_name,parent_cat_id,bg_id)
values (2,'Gifts',2,3),
(3,'letters',3,2),
(4,'food',3,4),
(5,'hotel',4,5);




insert into post (post_id,post_name,author,cat_id)
values (2,'Lion','Azar',1),
(3,'birthday','Amol',5),
(4,'giraffe','Azar',3),
(5,'chinese','Azar',2);



insert into comments (cat_id,post_id,comment_by,date_of_comment)
values (2,1,'Anil',"2012-01-05"),
(4,1,'Amol',"2012-01-01"),
(5,1,'Azar',"2012-01-04"),
(3,1,'Anil',"2012-01-03");



insert into tag (tag_id,tag_name,tag_date)
values (3,'Wildlife',"2012-01-06"),
(2,'food',"2012-01-03"),
(4,'Wildlife',"2012-01-07"),
(5,'presents',"2012-01-01");




insert into tag_post (tag_id,post_id)
values (1,2),
(4,1),
(5,3),
(3,2);


update tag set tag_name='East' where tag_date="2012-01-07";

update tag set tag_id=2 where tag_date="2012-01-07";

select * from post where cat_id=1;


select p.post_name,c.comment_by from 
post as p left join comments as c
 on p.post_id=c.post_id;


update comments set post_id=5 where cat_id=2;



select p.post_name,c.comment_by from 
post as p left join comments as c
 on p.post_id=c.post_id
;

select p.post_name,c.comment_by from 
post as p inner join comments as c
 on p.post_id=c.post_id
;



select b.bg_name,c.cat_name from 
blog_table as b inner join category as c
 on b.bg_id=c.bg_id
;

select count(*) from post;


select author,count(*) as num_posts from post group by author;


select parent_cat_id,count(cat_id)
 from category group by parent_cat_id;

select cat_name from category where 
cat_id = (select MAX(cat_id) from category);

select cat_name from category where cat_id between 1 and 3;


select cat_name from category where 
cat_id = (select AVG(cat_id) from category );


select count(*) as no_posts from post where cat_id in
 (select cat_id from category where cat_name="Animals");



commit;