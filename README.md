# library-SQL

/*本图书馆系统使用NetBeans12.6图形界面编程*/


Sql类的Connettion方法中
/*
Class.forName("com.mysql.jdbc.Driver");
 conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/B19031104",Id,PassWord);
*/需要改成自己的数据库

数据库事先需要创建表library
(name,price,classification,press,seat,whether,rent,borrower)
分别代表：书名，价格，类别，出版社，位置，是否被借出，租金，借阅者

登录界面，
用户id：client
密码：password

管理员id：manage
密码：password

用户界面实现了查询功能
管理员界面实现了增、删、改、查
