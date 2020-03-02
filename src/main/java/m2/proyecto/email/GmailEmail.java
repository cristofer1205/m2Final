package m2.proyecto.email;

public class GmailEmail extends Email {
    public GmailEmail(String sender, String recipient, String subject, String body) {
        super(sender, recipient, subject, body);
    }

    @Override
    public void send() {
        GmailEmailSender sender = GmailEmailSender.getInstance();
        sender.send(this);
    }
}
