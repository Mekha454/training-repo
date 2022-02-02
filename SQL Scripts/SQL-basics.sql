/*
 * We are going to first create some "tables".
 * 
 * The syntax for creating and dropping a table is as follows:
*/
drop table recipes;
create table recipes(
recipe_id numeric primary key             , 
recipe_name varchar,
recipe_cookTimeInMinutes numeric check (recipe_cookTimeInMinutes > 0),
author_id numeric references author(author_id)
);

select * from hibernate_recipe;

drop table author;
create table author(
author_id numeric unique not null,
author_name varchar not null,
author_speciality varchar
);

drop table ingredient cascade;
create table ingredient(
ingredient_id serial primary key,
ingredient_name varchar unique,
ingredient_flavor varchar
)

drop table recipe_ingredient;
--creating bridge table--
create table recipe_ingredient(
	recipe_id numeric references recipes(recipe_id),
	ingredient_id numeric references ingredient(ingredient_id),
	constraint recipe_ingredient_pk primary key(recipe_id, ingredient_id)
);

insert into recipes values(1, 'Birthday Cake', 80, 1);
insert into recipes values(2, 'Candy Corn', 1, 2), (3, 'Burger', 30, 3), (4, 'Water', 1, 4);
insert into recipes values(5, 'Pancakes', 30, 3);
insert into recipes values(6, 'Pizza', 40, 4);
insert into recipes values(7, 'Cereal', 3, 5); 

insert into author(author_id, author_name, author_speciality) values(1, 'Gordon', 'Steak');
insert into author values(2, 'Bobby', 'Not often beaten');
insert into author values(3, 'Salt Bey', 'Salt');
insert into author values(4, 'Randy', 'Dropping Bowls');
insert into author values(5, 'Toucan Dan', 'Smelling');

insert into ingredient values(5, 'Salt' , 'salty'), (2, 'Pepper', 'spicy'), (3, 'Clove', 'spicy'), (4, 'Celery Salt', 'salty')

insert into recipe_ingredient values(1, 1);
insert into recipe_ingredient values(1, 2);
insert into recipe_ingredient values(5, 1);
insert into recipe_ingredient values(1, 1); --this will not work as there is primary key constraint--

select * from recipes;

select recipe_name, recipe_cooktimeinminutes from recipes;

/*
 * to select specific records, you can use 'where' keyword
 */

select * from recipes where recipe_cooktimeinminutes <= 30 and recipe_id = 3;

select * from recipes order by recipe_cooktimeinminutes;

select * from recipes order by recipe_cooktimeinminutes desc;

select * from recipes where recipe_cooktimeinminutes between -1 and 30;

update recipes set recipe_name = 'Best Burger' where recipe_name = 'Burger';
update recipes set author = 'Bobby' where recipe_name = 'Best Burger';

delete from recipes where recipe_name = 'Candy Corn';

--Union
select recipe_id, recipe_name from recipes union;
select ingredient_id, ingredient_name from ingredient;

--Union All
select recipe_name from recipes union all select ingredient_name from ingredient;

--Intersect
select * from recipes intersect select * from recipes;

select * from ingredient intersect select * from author;

--Except

select * from ingredient except select * from author;

select ingredient_id; 

create unique index custom_index on ingredient(ingredient_name);

select custom_index;

insert into hibernate_author values(1, 'mike', 'chicken parm');
insert into hibernate_author values(2, 'diane', 'adobo');

select * from hibernate_author;

select * from app_user;

select * from testitem;

SELECT * FROM pg_catalog.pg_tables;


