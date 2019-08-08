package by.peleng.java.entity;

public class StrudentCreator {
    public Student createStudent(String students){
        Student student = new Student();
        String[] studentSplit = students.split("\\|");
        student.setId(Integer.parseInt(studentSplit[0].split("=")[1]));

        student.setName(studentSplit[1].split("=")[1]);
        student.setSurname(studentSplit[2].split("=")[1]);
        student.setAge(Integer.parseInt(studentSplit[3].split("=")[1]));
        student.setLocation(studentSplit[4].split("=")[1]);
        student.setGrupnumber(studentSplit[5].split("=")[1]);


        return student;
    }

}
