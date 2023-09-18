package LiskovSubstitutionPrinciple;

public class WhatsApp extends SocialMedia{
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost(Object post) {
        // Not applicable
    } // This does support liskov substitution principle

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall(String... users) {

    }
}
