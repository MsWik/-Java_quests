package by.peleng.jav.lesson3;
/*
3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.
*/
public class Student {
    private String surname ;
    private int groupNumber;
    private int assessment[] = new int[5] ;
    // Student[] student= new Student[10];


    public String getSurname() {
        return surname;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int[] getAssessment() {
        return assessment;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setAssessment(int[] assessment) {
        this.assessment = assessment;
    }




    public boolean goodBoy(int max1, int max2) {
        for(int i=0;i<assessment.length;i++){
            if (assessment[i]!=max1 && assessment[i]!=max2){
               return false;
            }

        }
        return true;

    }



}
