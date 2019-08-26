package by.les10.command;

import by.les10.command.impl.AuthorizationCommand;
import by.les10.command.impl.EditProfileCommand;
import by.les10.command.impl.NoSuchCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandHelper   {
    private static final CommandHelper instance = new CommandHelper();
    private Map<CommandName,Command> commands = new HashMap<>();
    public CommandHelper(){
        commands.put(CommandName.AUTHORIZATION,new AuthorizationCommand());
        commands.put(CommandName.NO_SUCH_COMMAND, new NoSuchCommand());
        commands.put(CommandName.EDIT_PROFILE, new EditProfileCommand());

    }

    public static CommandHelper getInstance() {
        return instance;
    }

    public  Command getCommand(String commandName){
        CommandName name = CommandName.valueOf(commandName.toUpperCase());
        Command command;
        if (null!=name){//name!=null
            command=commands.get(name);

        } else command=commands.get(CommandName.NO_SUCH_COMMAND);
        return command;
    }
}
