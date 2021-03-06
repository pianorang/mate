create table tn_user (
       id bigint generated by default as identity,
        is_admin boolean not null,
        is_denied boolean not null,
        user_email varchar(255),
        user_id varchar(255),
        user_level integer not null,
        user_name varchar(255),
        user_password varchar(255),
        primary key (id)
    );
insert into tn_user (user_id, user_name, user_password, user_email, user_level, is_admin, is_denied) values ('admin', '관리자', '$2a$12$YUFu4SwwNTv/PBBuGVwvguRYCon9n9Vt8KoDB4e2TtOHbiAQSDVla', 'admin@admin.com', 1, 1, 0);