# Users schema
 
# --- !Ups
 
CREATE TABLE Account (
  id             bigint     primary key,
  title          varchar(255),
  url          	 varchar(255),
  group_id       bigint
);

INSERT INTO ACCOUNT (id, title, url, group_id)
  VALUES(1, 'Hatena Diary', 'http://d.hatena.ne.jp/Ehren/', 1);
INSERT INTO ACCOUNT (id, title, url, group_id)
  VALUES(2, 'Twitter', 'http://twitter.com/masahito', 3);
INSERT INTO ACCOUNT (id, title, url, group_id)
  VALUES(3, 'Github', 'http://github.com/masahitojp', 3);
INSERT INTO ACCOUNT (id, title, url, group_id)
  VALUES(4, 'Bitbucket', 'http://bitbucket.org/ehren', 3);
INSERT INTO ACCOUNT (id, title, url, group_id)
  VALUES(5, 'Another Do-It-Yourself Framework 和訳', 'http://dev-ehren.appspot.com/another-do-it-yourself/index.html', 2);
INSERT INTO ACCOUNT (id, title, url, group_id)
  VALUES(6, 'Play! framework Java 和訳(一部)', 'http://playdocja.appspot.com/', 2);



# --- !Downs

DROP TABLE Account;
