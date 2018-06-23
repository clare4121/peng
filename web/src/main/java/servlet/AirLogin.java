package servlet;

import model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
public class AirLogin  extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException,
            IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserServices userServices=new UserServices();

        User user =userServices.getUser(username);
        request.getSession().setAttribute("user",user);
        System.out.println(password);
        System.out.println(user.toString());
        if(password.equals(user.getPassid())){
            request.getRequestDispatcher("main.jsp").forward(request,response);
        } else{
            response.sendRedirect("error.jsp");
        }
    }
    //重写doPost方法
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException,
            IOException {
        doGet(request, response);
    }
}
