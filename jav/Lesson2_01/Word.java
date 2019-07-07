package by.peleng.jav.Lesson2_01;
/*1 Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.*/
public class Word {
  private String word;

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public Word(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }
}
