package m2.proyecto;


import m2.proyecto.email.Email;
import m2.proyecto.email.EmailSender;
import m2.proyecto.email.EmailSenderFactory;

import java.util.Objects;
import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer {
    private String name;
    private String emailAddress;

    public Subscriber(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof Email) {
            EmailSender emailSender = EmailSenderFactory.FactoryEmailSender(emailAddress.substring(emailAddress.lastIndexOf("@")));
            Objects.requireNonNull(emailSender).send((Email) observable);
        }
    }

}
