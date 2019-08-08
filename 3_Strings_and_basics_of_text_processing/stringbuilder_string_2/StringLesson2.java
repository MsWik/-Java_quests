package by.peleng.java.lessen3;

/*2. В строке вставить после каждого символа 'a' символ 'b'.*/
public class StringLesson2 {
    public static void main(String[] args) {
        String myTextS = "aaaaaaaaa ghfdjatyhgfdhjg";
        //   int b = myText.length();

        /*for(char i = 0; i < b; i++) {
            char dd = 'b';
            char c = myText.charAt(i);

            if (c=='a'){myText.insert(i+1,dd);}


        }*/
        System.out.println(myTextS.replaceAll("a", "ab"));

    }

}
