package servlet;

    //引入所需要的包
import model.User;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LoginServlet extends HttpServlet {
    //重写doGet方法
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

//        //服务器端打印信息
//        //System.out.println("username=" + username);
//        //System.out.println("password=" + password);
//        //设置编码格式
//        response.setContentType("text/html;charset=UTF-8");
//        response.setCharacterEncoding("UTF-8");
//        //返回html页面
//        response.getWriter().println("<html>");
//        response.getWriter().println("<head>");
//        response.getWriter().println("<title>登录信息</title>");
//        response.getWriter().println("</head>");
//        response.getWriter().println("<body>");
//        response.getWriter().println("欢迎【" + username + "】用户登录成功！！！");
//        response.getWriter().println("</body>");
//        response.getWriter().println("</html>");
    }
    //重写doPost方法
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException,
            IOException {
        doGet(request, response);
    }
}
