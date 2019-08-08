package by.peleng.java.lesson5.lesson5.impl;

import by.peleng.java.lesson5.lesson5.Pack.Pack;
import by.peleng.java.lesson5.lesson5.flower.Flover;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Provider {
    private Map<String, Command> commands= new HashMap<String, Command>();
Random random = new Random();
    public Provider(){
        commands.put("ЦВЕТОК", new Flover(random.nextInt(50), "Свежи", random.nextInt(40)+20, "Гвозьдика"));
        commands.put("УПАКОВКА", new Pack(random.nextInt(40)+10,"Бумажная","Красная"));



    }

    public Command getCommand(String commandName) {
        Command command;
        command = commands.get(commandName);

        return command;
    }

}
