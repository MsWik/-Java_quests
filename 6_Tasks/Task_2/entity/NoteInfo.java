package by.peleng.note.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoteInfo extends Note {
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final String TITLE_PATTERN = "^[.+]{2,}";
    private static final String MESSAGE_PATTERN = "^[.+]{2,}";
    private Pattern pattern;
    private Matcher matcher;

    public NoteInfo() {
    }


    public void noteInfo() throws IOException {
        System.out.println("-------------");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите тему заметки");




        super.setTheme(reader.readLine());
        super.setDate(Calendar.getInstance().getTime());
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(super.getDate());
        System.out.println("Дата создания заметки " + strDate);

        System.out.println("Введите e-mail");

        while (true) {
            pattern = Pattern.compile(EMAIL_PATTERN);
            String email = "";
            email = reader.readLine();
            matcher = pattern.matcher(email);
            if (matcher.matches()) {
                super.setEmail(email);
                break;
            } else {
                System.out.println("Не валидный e-mail");
            }
        }


        System.out.println("Введите сообщение");


        String message = "";
        message = reader.readLine();

        super.setMesage(message);


    }


    @Override
    public String toString() {
        return super.toString();
    }
}
