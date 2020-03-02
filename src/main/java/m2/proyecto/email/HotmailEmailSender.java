package m2.proyecto.email;

public class HotmailEmailSender implements EmailSender {
    private static HotmailEmailSender instance;

    private HotmailEmailSender() {
    }

    public static HotmailEmailSender getInstance() {
        if (instance == null) {
            instance = new HotmailEmailSender();
        }
        return instance;
    }

    @Override
    public void send(Email HotmailEmail) {
        System.out.println("Enviando correo de Hotmail a " + HotmailEmail.getRecipient());
    }
}
