package by.peleng.java.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentValidator {
    public boolean studentValidator(Student student){

        String regexp="^([А-ЯЁ]{1}[а-яё]{1,29})|([A-Z]{1}[a-z]{1,29})$//u";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(student.getName());
        if (!matcher.find()){return false;};
        matcher.reset();
        matcher = pattern.matcher(student.getSurname());
        if (!matcher.find()){return false;};
        matcher.reset();
        if (student.getId()<0 || student.getId()>100){return false;}
        if (student.getAge()>99 || student.getAge()<12){return false;}
        matcher = pattern.matcher(student.getLocation());
        if (!matcher.find()){return false;};
        return true;
    }
}
