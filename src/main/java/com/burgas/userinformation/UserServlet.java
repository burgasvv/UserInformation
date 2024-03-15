package com.burgas.userinformation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "UserServlet", urlPatterns = "/user-servlet", initParams = {
        @WebInitParam(name = "name", value = "Not provided"),
        @WebInitParam(name = "email", value = "Not provided")
})
public class UserServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("name", getRequestParameter(request, "name"));
        request.setAttribute("email", getRequestParameter(request, "email"));
        request.setAttribute("country", getContextParameter("country"));
        request.setAttribute("city", getContextParameter("city"));
    }

    protected String getRequestParameter(HttpServletRequest request, String name) {
        String parameter = request.getParameter(name);
        return !parameter.isEmpty() ? parameter : getInitParameter(name);
    }

    protected String getContextParameter(String name) {
        return getServletContext().getInitParameter(name);
    }

    protected void forwardRequest(HttpServletRequest request, HttpServletResponse response,
                                  @SuppressWarnings("SameParameterValue") String path)
            throws ServletException, IOException {

        request.getRequestDispatcher(path).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        processRequest(req, resp);
        forwardRequest(req,resp, "/user/user-info.jsp");
    }
}
