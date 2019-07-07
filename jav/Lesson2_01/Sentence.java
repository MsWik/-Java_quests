package by.peleng.jav.Lesson2_01;

import java.util.Arrays;

/*1 Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.*/
public class Sentence {
   private Word[] sentence;

    public Sentence(String[] s) {
        sentence = new Word[s.length];
    for (int i=0; i<s.length;i++)
    {
        sentence[i]=new Word(s[i]);

    }

    }

    public void setSentence(Word[] sentence) {
        this.sentence = sentence;
    }

    public Word[] getSentence() {
        return sentence;
    }

    public Sentence(Word[] sentence) {
        this.sentence = sentence;
    }


    public void toStrings() {
        String str = " ";
        String output="";
        for (int i=0; i<sentence.length;i++){
            output+=sentence[i]+str;

     }
       System.out.print(output);
    }



}
