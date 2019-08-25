package by.les10.controller;

import by.les10.command.Command;
import by.les10.command.CommandHelper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends javax.servlet.http.HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final CommandHelper helper = CommandHelper.getInstance();

    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
        super.service(arg0, arg1);
    }

    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }


    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String commandName;
        Command command;
        //   String page =null;
        commandName = request.getParameter(RequestParameterName.REQ_PARAM_COMMAND_NAME);
        command = helper.getCommand(commandName);
        command.execute(request, response);
    }



    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }}
/*    try {
    page = command.execute(request);
    } catch (CommandExceprion e){page=JspPageName.ERROR_PAGE;}
    catch (Exception e){page=JspPageName.ERROR_PAGE;}
    }*/

