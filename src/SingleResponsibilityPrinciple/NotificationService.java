package SingleResponsibilityPrinciple;

public class NotificationService {

    public void sendOTP(String medium) {
        if (medium.equals("email")){
            // write email related logic
            // use JavaMailSenderAPI
        } else if (medium.equals("mobile")) {
            // write logic using twillio API
        }
    }
}
