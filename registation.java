 package karunakar;  
 import java.io.IOException;  
 import java.io.PrintWriter;  
 import java.sql.Connection;  
 import java.sql.DriverManager; 
 import java.sql.PreparedStatement;  
 import java.sql.SQLException; 
 import jakarta.servlet.ServletException; 
 import jakarta.servlet.http.HttpServlet;  
 import jakarta.servlet.http.HttpServletRequest; 
 import jakarta.servlet.http.HttpServletResponse; 
 public class registation extends HttpServlet {  private static final long serialVersionUID = 1L; 
 public registation() {  super(); 
 // TODO Auto-generated constructor stub 
 } 
 protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException { 
 PrintWriter out = response.getWriter(); 
 String first = request.getParameter("first"); 
 String last = request.getParameter("last"); 
 String email = request.getParameter("email");  
 String password = request.getParameter("password"); 
 String phone = request.getParameter("phone"); 
 String gender = request.getParameter("gender"); 
 String repassword = request.getParameter("repassword"); 
 String address = request.getParameter("address"); 
 try { 
 Class.forName("com.mysql.cj.jdbc.Driver"); 
 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8081/karunakar", 
 "root", 
 "karunakar"); 
 PreparedStatement ps = con.prepareStatement("insert into register  values(?,?,?,?,?,?,?,?,?)"); 
 ps.setString(1, first);  ps.setString(2,last);  ps.setString(3, email);  ps.setString(4, password);  ps.setString(5, repassword);  ps.setString(6, phone);  ps.setString(7, gender);  ps.setString(8, address);  
 int count = ps.executeUpdate(); 
 if (count > 0) 
 { 
 out.println("<h1>User Registered Successfully</h1>"); 
 } 
 else 
 { 
 out.println("<h1 >User Not Registered</h1>"); 
 } 
 con.close(); 
 } 
 catch (ClassNotFoundException e) { 
 e.printStackTrace(); 
 out.println("<h1 >User Not Registered</h1>"); 
 out.println("<h1 >Error in ClassNotFoundException</h1>"); 
 } 
 catch (SQLException e) { 
 e.printStackTrace();  out.println("<h1 >User Not Registered</h1>");  
 out.println("<h1 >Data Already Exist</h1>"); 
 out.println("<p>Use Different mail</p>"); 
 } 
 } 
 } 

