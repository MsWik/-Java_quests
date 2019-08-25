package by.les10.command;

import javax.servlet.ServletException;
import java.io.IOException;

public interface Command {
    void execute(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException, ServletException;
}
