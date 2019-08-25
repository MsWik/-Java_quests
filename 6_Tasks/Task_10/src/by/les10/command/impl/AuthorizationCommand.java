package by.les10.command.impl;

import by.les10.bean.User;
import by.les10.command.Command;
import by.les10.controller.JSPPageName;
import by.les10.controller.RequestParameterName;
import by.les10.service.ServiceException;
import by.les10.service.ServiceProvider;
import by.les10.service.UserSetvice;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AuthorizationCommand implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String login;
        String password;
        login = request.getParameter(RequestParameterName.REQ_PARAM_LOGIN);
        password = request.getParameter(RequestParameterName.REQ_PARAM_PASS);

        UserSetvice userSetvice = ServiceProvider.getInstance().getUserSetvice();
        User user;
        try {
            user = userSetvice.authoruzation(login,password);
            request.setAttribute("user",user);
            RequestDispatcher dispatcher =request.getRequestDispatcher(JSPPageName.USER_AUTH_PAGE);
            dispatcher.forward(request,response);


      /*      PrintWriter out = response.getWriter();
            out.println("<h1>Привет  , </h1> <br>" + user.getName());*/
        } catch (ServiceException e) {
            e.printStackTrace();
        }

    }
}
