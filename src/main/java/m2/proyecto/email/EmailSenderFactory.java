package m2.proyecto.email;

public class EmailSenderFactory {
    public static EmailSender FactoryEmailSender(String senderType){

        if (senderType.equals("gmail.com")){
            return GmailEmailSender.getInstance();
        }
        if (senderType.equals("hotmail.com")){
            return HotmailEmailSender.getInstance();
        }
        return null;
    }
}
