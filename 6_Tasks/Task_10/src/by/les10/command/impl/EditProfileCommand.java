package by.les10.command.impl;

import by.les10.bean.User;
import by.les10.command.Command;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class EditProfileCommand implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        User user =(User)session.getAttribute("user");
        String goToPage;
        if(user.getRole().equals("user")){
            goToPage="WEB-INFO/jsp/edit_profile.jsp";
        } else {
            goToPage="index.jsp";
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(goToPage);
        dispatcher.forward(request,response);
    }
}
