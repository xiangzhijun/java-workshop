#sh
#docker启动mysql数据库
docker pull mysql
docker run --name mysql -v /Users/xiangzhijun/docker/mysql:/var/lib/mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 -d mysql:latest

#创建数据库
mysql -h localhost -u root -p123456 <./init_mysql_database.sql
#创建表
mysql -h localhost -u root -p123456 <./init_mysql_tables.sql

