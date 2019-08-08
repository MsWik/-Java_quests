package by.peleng.java.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationInfo extends User {
    private Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_PATTERN ="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            +"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public RegistrationInfo() {
    }

    public void regestration() throws IOException {
        System.out.println("-------------");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите id");
        super.setId(Integer.parseInt(reader.readLine()));
        System.out.println("Введите name ");
        super.setName(reader.readLine());
        System.out.println("Введите famali ");
        super.setFamali(reader.readLine());
        System.out.println("Введите email ");
        while (true) {
            pattern = Pattern.compile(EMAIL_PATTERN);
            String email="";
            email=reader.readLine();
            matcher = pattern.matcher(email);
            if (matcher.matches()){
            super.setEmail(email);break;}
            else {System.out.println("Не валидный e-mail");}
        }
        System.out.println("Введите age ");
        super.setAge(reader.readLine());
        System.out.println("Введите login ");
        super.setLogin(reader.readLine());
        System.out.println("Введите password ");
    String pasHeh=reader.readLine();
        super.setPassword(Integer.toString(pasHeh.hashCode()));
        super.setAdmin(false);

}

    @Override
    public String toString() {
        return super.toString();
    }
}
