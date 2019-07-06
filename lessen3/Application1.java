package by.peleng.java.lessen3;


/*1 Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
алфавиту.*/

import com.sun.deploy.util.StringUtils;

import java.util.*;
import java.util.regex.Pattern;

public class Application1 {

    static int tochka(String toc) {

        int size = 0;
        for (int i = 1; i < toc.length(); i++) {
            char ch = toc.charAt(i);

            if ((ch == 33 || ch == 46 || ch == 63)) {
                size++;

            }

        }
        return size;
    }


    static String[] sortParagraph(String sort) {
        Pattern pattern = Pattern.compile("\n");
        String[] words = pattern.split(sort);


        //      System.out.println(Arrays.toString(words));
        for (int i = 0; i < words.length; i++) {
            int min = i;
            for (int j = i + 1; j < words.length; j++) {


                if (tochka(words[j]) > tochka(words[min])) {
                    min = j;
                }
            }
            System.out.println(tochka(words[i]));
            String tmp = words[min];
            words[min] = words[i];
            words[i] = tmp;
        }

        return words;
    }

    static void sortSlovo(String sort) {
        Pattern pattern = Pattern.compile("[.!?]");
        String[] words = pattern.split(sort);
        Pattern patternslovo = Pattern.compile("[ ^'\":,]");

        for (int i = 0; i < words.length; i++) {
            String[] slovo = patternslovo.split(words[i]);

            for (int k = 0; k < slovo.length; k++) {
                for (int j = 0; j < slovo.length - 1 - k; j++) {
                    if (slovo[j].length() > slovo[j + 1].length()) {
                        String str = slovo[j];
                        slovo[j] = slovo[j + 1];
                        slovo[j + 1] = str;
                    }
                }
            }
            //words=slovo.clone();
            for (int h = 0; h < slovo.length; h++) {
                System.out.print(" " + slovo[h] + " ");
            }
            System.out.println();
        }

    }

    static int leksemaSort(String sort, String simvol) {
        String string = sort;
        String[] splitArray = string.split(simvol);


        return splitArray.length - 1;


    }

    static int leksemaSortNew(String sort, char simvol) {
        int j = 0;
        for (int i = 0; i < sort.length(); i++) {
            if (sort.charAt(i) == simvol) {
                j++;
            }
        }

        return j;
    }

    static public String[] removeNull(String[] a) {
        ArrayList<String> removedNull = new ArrayList<String>();
        for (String str : a)
            if (str != null)
                removedNull.add(str);
        return removedNull.toArray(new String[0]);
    }

    static void leksema(String sort, String simvol) {
        Pattern pattern = Pattern.compile("[ ^'\":,]");
        String[] words = pattern.split(sort);
        // String[] result = new String[words.length];
        List<String> result = new ArrayList<String>();


        for (int i = 0, j = 0; i < words.length; i++) {
            if (words[i].contains(simvol)) {
                result.add(words[i]);
//                result[j++]=words[i];

            }


        }


        //  for (int k = 0; k < result.size(); k++) {
     /*   for (int k = 0; k < result.length; k++) {


            for (int j = 0; j <  result.length- 1 - k; j++) {
                String splitArray = result[j];
                String splitArraynew = result[j+1];

                String[] splitArrayS;
                String[] splitArrayW;


                    splitArrayS = splitArray.split(simvol);
                    splitArrayW = splitArraynew.split(simvol);
                    System.out.println(Arrays.toString(splitArrayS));
                System.out.println(Arrays.toString(splitArrayW));

                if (splitArrayS.length > splitArrayW.length) {
                    String str = result[j];
                    result[j]=result[j+1];
                    result[j+1]=result[j];
                //  result.add(j,result.get(j+1));

                  // result.add(j+1,str);
                }
            }

        }*/


        //   for (int i = 0; i < result.length; i++) {
        //  if (result[i] != null) {
        //        System.out.println(result[i]);
        //      }

        /*for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
            System.out.print("   " + leksemaSortNew(result.get(i),simvol.charAt(0))+"  ");




        }*/
        int min = 0;
        String[][] stringResult = new String[10][result.size()];
        for (int j = 0, i = 0, k = 0; j < result.size(); j++) {

            stringResult[leksemaSortNew(result.get(j), simvol.charAt(0))][k++] = result.get(j);


        }

        String[][] stringResultNew = new String[10][];
        for (int i = 0; i < stringResult.length; i++) {
            stringResultNew[i] = removeNull(stringResult[i]);

        }

        for (int i = 0; i < stringResultNew.length; i++) {
            Arrays.sort(stringResultNew[i], String.CASE_INSENSITIVE_ORDER);
                /*
            for (int k = 0; k < stringResultNew[i].length; k++) {
                for (int j = 0; j < stringResultNew[i].length - 1 - k; j++) {
                    if (stringResultNew[i][j] != null && stringResultNew[i][j + 1] != null) {
                        if (stringResultNew[i][j].charAt(0) > stringResultNew[i][j + 1].charAt(0)) {
                            String str = stringResult[i][j];
                            stringResultNew[i][j] = stringResultNew[i][j + 1];
                            stringResultNew[i][j + 1] = str;
                        }
                    }
                }
            }*/
        }


        for (int i = 0; i < stringResultNew.length; i++) {  //идём по строкам
            for (int j = 0; j < stringResultNew[i].length; j++) {//идём по столбцам

                if (stringResultNew[i][j] != null) {
                    System.out.print(" " + stringResultNew[i][j] + " " + i + "    " + j);
                }
                ; //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }


    }


    public static void main(String[] args) {

        String sytimg = "Rosemary Fell was not exactly beautiful. She was young, brilliant, extremely modern, well dressed and amazingly well read in the newest of the new books. Rosemary had been married two years, and her husband was very fond of her. They were rich, really rich, not just comfortably well-off, so if Rosemary wanted to shop, she would go to Paris as you and I would go to Bond Street.\n" +
                "One winter afternoon she went into a small shop to look at a little box which the shopman had been keeping for her. He had shown it to nobody as yet so that she might be the first to see it.\n" +
                "\"Charming!\" Rosemary admired the box. But how much would he charge her for it? For a moment the shopman did not seem to hear. The lady could certainly afford a high price. Then his words reached her, \"Twenty-eight guineas, madam.\"\n" +
                "\"Twenty-eight guineas.\" Rosemary gave no sign. Even if one is rich. Her voice was dreamy as she answered: \"Well, keep it for me, will you? I'll.\" The shopman bowed. He would be willing of course, to keep it for her forever.\n" +
                "Outside rain was falling, there was a cold, bitter taste in the air, and the newly lighted lamps looked sad. At that very moment a young girl, thin, dark, appeared at Rosemary's elbow and a voice, like a sigh, breathed: \"Madam, may I speak to you a moment?\"\n" +
                "\"Speak to me?\" Rosemary turned. She saw a little creature, no older than herself who shivered as though she had just come out of the water.\n" +
                "\"Madam,\" came the voice, \"would you let me have the price of a cup of tea?\"";


        Scanner in = new Scanner(System.in);
        System.out.println("Выберете один из 4 вариантов действия с текстом. \n" +
                "1)\tОтсортировать абзацы по количеству предложений\n" +
                "2)\tВ каждом предложении отсортировать слова по длине\n" +
                "3)\tОтсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.\n" +
                "4)\tВыйти из программы\n");
        while (!in.hasNextInt()) {
            System.out.print("Ввеедите корректно А:   ");
            in.next();
        }
        int sizeA = in.nextInt();

        switch (sizeA) {
            case 1:
                String[] str = sortParagraph(sytimg);
                for (int i = 0; i < str.length; i++) {
                    System.out.println("\n" + str[i] + "  \n "
                            + i);
                }
                break;
            case 2:
                sortSlovo(sytimg);
                break;
            case 3:
                System.out.println("Введите символ (в случае вода строки поиск будет по 1му введенному символу)");
                Scanner scaner = new Scanner(System.in);
                String scaners = scaner.nextLine();
                leksema(sytimg, scaners);


                break;

            default:
                break;
        }

    /*    String[] str = sortParagraph(sytimg);
        for (int i=0;i<str.length;i++){
            System.out.println("\n" + str[i]+"  \n "
                    +i);
        }*/

//  sortSlovo(sytimg);
//    leksema(sytimg, "a");

    }
}