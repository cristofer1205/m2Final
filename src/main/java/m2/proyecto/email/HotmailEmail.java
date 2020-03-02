package m2.proyecto.email;

public class HotmailEmail extends Email {
    public HotmailEmail(String sender, String recipient, String subject, String body) {
        super(sender, recipient, subject, body);
    }

    @Override
    public void send() {
        HotmailEmailSender sender = HotmailEmailSender.getInstance();
        sender.send(this);
    }
}
