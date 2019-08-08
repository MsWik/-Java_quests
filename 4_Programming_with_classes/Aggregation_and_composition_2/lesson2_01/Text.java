package by.peleng.jav.Lesson2_01;
/*1 Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Arrays;

public class Text {

    String title;
    Sentence[] sentences;

    public String getTitle() {
        return title;
    }

    public void setSentences(Sentence[] sentences) {
        this.sentences = sentences;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    public void GenereteText() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Генерация текста");
        System.out.println("-----------");
        System.out.println("Введите число предложений");

        int size = Integer.parseInt(reader.readLine());
        sentences = new Sentence[size];
        System.out.println("Введите заголовок текста");
        this.title = reader.readLine();


        for (int i = 0; i < size; i++) {
            int j = i + 1;
            System.out.println("Введите предложение №  " + j + "\n");
            String str = reader.readLine();
            Sentence sentence = new Sentence(str.split(" "));


            sentences[i] = sentence;
        }


    }


    public void toStrings() {
        System.out.println(title);
        System.out.println("-------------");
        for (int i = 0; i < sentences.length; i++) {
            sentences[i].toStrings();
            System.out.println("Предложение " + i);

        }
    }
    public void addText(int n) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--------------");
        System.out.println("Дополнить текст" + n + "Предложений");

        System.out.println("--------------");

        Sentence[] sentencesNew = new Sentence[sentences.length+n];
        for (int i=0; i<sentences.length;i++){
            sentencesNew[i]=sentences[i];
        }

        for (int i=sentences.length;i<sentencesNew.length;i++){
            int j = i + 1;
            System.out.println("Введите предложение №  " + j + "\n");
            String str = reader.readLine();
            Sentence sentence = new Sentence(str.split(" "));


            sentencesNew[i] = sentence;


        }

        sentences=sentencesNew;


    }

}