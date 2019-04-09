package myservlet.control;

import mybean.data.Bean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lei02 on 2019/4/9.
 */
public class Servlet2 extends HttpServlet{
    public void init(ServletConfig config) throws ServletException{
        super.init(config);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");

        Bean  seriesBean = new Bean();
        request.setAttribute("seriesBean", seriesBean);

        double firstItem = Double.parseDouble(request.getParameter("firstItem"));
        double var = Double.parseDouble(request.getParameter("var"));
        int number = Integer.parseInt(request.getParameter("number"));

        seriesBean.setFirstItem(firstItem);
        seriesBean.setVar(var);
        seriesBean.setNumber(number);

        double sum =0, item = firstItem;
        seriesBean.setName("等比数列的公比");
        int i = 0;
        while (i < number) {
            sum += item;
            item *= var;
            i++;
        }
        seriesBean.setSum(sum);

        RequestDispatcher dispatcher = request.getRequestDispatcher("showResult.jsp");
        dispatcher.forward(request, response);
    }
}
