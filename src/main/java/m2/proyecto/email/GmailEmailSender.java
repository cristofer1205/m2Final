package m2.proyecto.email;

public class GmailEmailSender implements EmailSender{
    private static GmailEmailSender instance;

    private GmailEmailSender() {
    }

    public static GmailEmailSender getInstance(){
        if (instance == null){
            instance = new GmailEmailSender();
        }
        return instance;
    }

    @Override
    public void send(Email gmailEmail) {
        System.out.println("Enviando correo de Gmail a " + gmailEmail.getRecipient());
    }
}
