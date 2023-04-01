/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author CTXYYX
 */
public class Sql {
    Connection conn=null;
String Id="";
String PassWord="";
Statement stmt=null;
public Sql(String id,String pw){
Id=id;
PassWord=pw;
}

void Connettion(){
try{
Class.forName("com.mysql.jdbc.Driver");
 conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/B19031104",Id,PassWord);
stmt=conn.createStatement();
}catch(Exception e){
e.printStackTrace();
}
}

void Insert(String A,String B,String C,String D,String E,String F,String G,String H){
try{
String sql="insert into library values('"+A+"','"+B+"','"+C+"','"+D+"','"+E+"','"+F+"','"+G+"','"+H+"')";
stmt.executeUpdate(sql);
}
catch(Exception e){
}
}

void Update(String A,String B,String C,String D,String E,String F,String G,String H){
try{
String sql="update library set "+"price="+"'"+A+"',"+"classification="+"'"+B+"',"+"press="+"'"+C+"',"+"seat="+"'"+D+"',"+"whether="+"'"+E+"',"+"rent="+"'"+G+"',"+"borrower="+"'"+H+"'"+" where name="+"'"+H+"'";
stmt.executeUpdate(sql);
}catch(Exception e){
}
}

void Delete(String A){
try{
String sql="delete from library where name="+"'"+A+"'";
stmt.executeUpdate(sql);
}catch(Exception e){
}
}
String[][] SelectAll(){
String[][] a=new String[10][8];
try{
String sql="select * from library";
ResultSet rs=stmt.executeQuery(sql);
int i=0;
while(rs.next()){
a[i][0]=rs.getString(1);
a[i][1] =rs.getString(2);
a[i][2] =rs.getString(3);
a[i][3] =rs.getString(4);
a[i][4] =rs.getString(5);
a[i][5] =rs.getString(6);
a[i][6] =rs.getString(7);
a[i][7]=rs.getString(8);
System.out.println(a[i][0]);
i++;
}
}catch(Exception e){
}
return a;
}

String[] Select(String A){
String[] a=new String[8];
try{
String sql="select * from library where name="+"'"+A+"'";

ResultSet rs=stmt.executeQuery(sql);
rs.next();
a[0] =rs.getString(1);
a[1] =rs.getString(2);
a[2]  =rs.getString(3);
a[3]=rs.getString(4);
a[4] =rs.getString(5);
a[5] =rs.getString(6);
a[6] =rs.getString(7);
a[7]=rs.getString(8);
}catch(Exception e){
}
return a;
}


}










