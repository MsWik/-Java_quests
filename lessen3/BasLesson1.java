package by.peleng.java.lessen3;

public class BasLesson1 {

/* Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.*/
    public static void main(String[] args) {


        String[] cArray = new String[]{"aA","dssDb","cccDs"};

      //  String regex = "([a-z])([A-Z]+)";
    //    String replacement = "$1_$2";

        for (int i = 0; i < cArray.length; i++) {
            StringBuilder test = new StringBuilder(cArray[i]);

             for (int j=0;j<cArray[i].length();j++){
                 char ch=cArray[i].charAt(j);
               if (Character.isUpperCase(ch)) {
                   test.delete(j,j+1);
                   test.insert(j,"_"+Character.toLowerCase(ch));

               }


             }
            System.out.print("   " + test+ "   ");
            //   System.out.println(cArray[i].replaceAll(regex, replacement)
        //            .toLowerCase());// Замена элемента при выводе. Сам массив не изменяется.
        }



    }



}
