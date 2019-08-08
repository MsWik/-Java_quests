package by.peleng.java.controller.impl;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailSender {
    public void mailAdd(String fromWhereEmail, String whereToSend, String subject,  String messages, String passwords) throws MessagingException {

        final String password = passwords;
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.mail.ru");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(fromWhereEmail, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromWhereEmail));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(whereToSend));
            message.setSubject(subject);
            message.setText(messages);

            Transport.send(message);

            System.out.println("Письмо " +whereToSend + " успешно отправлено");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }


}




