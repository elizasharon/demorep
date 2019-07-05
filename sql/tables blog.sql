create database Blog;

use Blog;

create table blog_table (
    bg_id int unsigned primary key,
    bg_name varchar(50) not null,
    bg_url varchar(50) not null unique,
    created_date date
);


create table category (
    cat_id int unsigned primary key,
    cat_name varchar(40),
    parent_cat_id int unsigned,
    bg_id int unsigned,
    constraint blog_id_fk foreign key (bg_id)
        references blog_table (bg_id),
    constraint cat_id_fk foreign key (parent_cat_id)
        references category (cat_id)
);

create table post (
    post_id int unsigned primary key,
    post_name varchar(40),
    author varchar(40),
    cat_id int unsigned,
    constraint cat_id_fk_post foreign key (cat_id)
        references category (cat_id)
);

create table comments (
    cat_id int unsigned,
    post_id int unsigned,
    comment_by varchar(40),
    content varchar(40),
    constraint cat_id_fk_comment foreign key (cat_id)
        references category (cat_id),
    constraint post_id_fk_comment foreign key (post_id)
        references post (post_id)
);


create table tag (
    tag_id int unsigned primary key,
    tag_name varchar(50),
    tag_date date
);

create table tag_post (
    tag_id int unsigned,
    post_id int unsigned,
    primary key (tag_id , post_id),
    constraint post_id_fk_tagpost foreign key (post_id)
        references post (post_id),
    constraint tag_id_fk_tagpost foreign key (tag_id)
        references tag (tag_id)
);













drop table tag_post;

use demo;

