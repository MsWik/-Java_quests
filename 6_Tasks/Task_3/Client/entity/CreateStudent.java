package by.peleng.java.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateStudent {
    public String createStudent(){
        StudentValidator studentValidator = new StudentValidator();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Student student=new Student();
        try {

            System.out.println("-------");
            System.out.println("Введите ID стулента");
            student.setId(Integer.parseInt(reader.readLine()));

        System.out.println("-------");
        System.out.println("Введите Имя стулента");
        student.setName(reader.readLine());

        System.out.println("-------");
        System.out.println("Введите фамилию студента");
        student.setSurname(reader.readLine());

        System.out.println("-------");
        System.out.println("Введите возраст студента");
        student.setAge(Integer.parseInt(reader.readLine()));

        System.out.println("-------");
        System.out.println("Введите локацию студента");
        student.setLocation(reader.readLine());

        System.out.println("-------");
        System.out.println("Введите номер группы студента");
        student.setGrupnumber(reader.readLine());

    } catch (IOException e) {
        e.printStackTrace();
        return e.toString();
    }
        if (studentValidator.studentValidator(student)){
        return student.toString();} else {return "Ошибка валидации";}
    }
}
