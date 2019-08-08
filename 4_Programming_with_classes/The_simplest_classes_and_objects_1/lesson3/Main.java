package by.peleng.jav.lesson3;
/*
3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.
*/
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Student student[] =new Student[10];
        for (int i=0;i<student.length;i++){
            student[i]= new Student();


        }
        student[0].setSurname("Хохлов Зиновий Мэлсович");
        student[1].setSurname("Харитонов Мирослав Альбертович");
        student[2].setSurname("Родионов Авраам Олегович");
        student[3].setSurname("Шарапов Клим Макарович");
        student[4].setSurname("Филатов Моисей Григорьевич");
        student[5].setSurname("Ермаков Юлий Владимирович");
        student[6].setSurname("Дементьев Арнольд Ильяович");
        student[7].setSurname("Филиппов Донат Алексеевич");
        student[8].setSurname("Аксёнов Бенедикт Демьянович");
        student[9].setSurname("Шилов Валерий Адольфович");


        for (int i=0;i<student.length;i++){

            student[i].setGroupNumber(random.nextInt(3));
            int[] asses= new int[5];
            for (int j=0;j<asses.length;j++ ){
                asses[j]=random.nextInt(3)+8;

            }
            student[i].setAssessment(asses);
        }
        for (int i=0;i<student.length;i++){
            if (student[i].goodBoy(9,10)){
                System.out.println(" Студент:   " + student[i].getSurname()+ "    ");
                System.out.print("  из группы  " +student[i].getGroupNumber());
                System.out.println(" Имеет оценки " + Arrays.toString(student[i].getAssessment()));
            }


        }






    }
}
