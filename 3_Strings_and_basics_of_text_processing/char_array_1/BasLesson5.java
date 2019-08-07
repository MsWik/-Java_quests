package by.peleng.java.lessen3;

/*Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.*/
public class BasLesson5 {

    public static void main(String[] args) {
        final String twoSpaces = "  ";
        final String oneSpace = " ";
        String myText = " c dhfjgshf sdfsdfsd sdfsdf    sdfsd      dsfsd    fd "; //наша строка

        char[] myTextChar = myText.toCharArray();
        char[] finalChar = new char[myText.length()];

        int i = 0;
        int j = 0;
        int k = 0;
        char c = myText.charAt(0);
        char b = myText.charAt(myText.length() - 1);

        while (true) {
            char ch = myTextChar[i++];
            //      char supCh=myTextChar[i+1];
            if (ch != 32) {
                finalChar[j++] = ch;
            }
            ;
            if (ch == 32 && i != 1) {

                while (true) {
                    char supCh = myTextChar[i + k];
                    if (supCh == 32 && i < myTextChar.length - 1) {
                        k++;
                    } else {
                        finalChar[j++] = ch;
                        break;
                    }
                    ;

                }
                i += k;
                k = 0;


            }

            //     if (ch==32 && supCh!=32 && i!=0 && i!=myTextChar.length ){finalChar[j++]=ch; }
            if (i == myTextChar.length - 1) {
                //    finalChar[j]=ch;

                break;
            }

        }
        //  if (c!=32) {}


        System.out.println(String.valueOf(finalChar));

        //if (c == ' ') {myText.substring(1);}


        //System.out.println(myText.replaceAll("[\\s]{2,}", " "));

    }
}
