package by.peleng.java.lesson5.lesson1;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFile extends File {


    public void create() {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(DIR+NAME), "utf-8"))) {
            writer.write("");
            writer.close();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void rename(String newName) throws IOException {


        //  File newFile = new File(DIR, newName);
        Path move = FileSystems.getDefault().getPath(DIR+NAME);
        Files.move(move,move.resolveSibling(newName));
      //  Files.delete(Paths.get(DIR + NAME));
        this.NAME = newName;






    }

    public void withdraw() throws FileNotFoundException {
        try (BufferedReader in = new BufferedReader(new FileReader(DIR+NAME))) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public void add(String text){
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(DIR+NAME,true), "utf-8"))) {
            writer.write(text);
            writer.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public void del (){
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(DIR+NAME), "utf-8"))) {
            writer.write("");
            writer.close();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
