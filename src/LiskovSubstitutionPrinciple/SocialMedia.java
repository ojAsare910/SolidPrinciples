package LiskovSubstitutionPrinciple;

public abstract class SocialMedia {

    // @support WhatsApp, Facebook, Instagram
    public abstract void chatWithFriend();

    // @support Facebook, Instagram, Twitter
    public abstract void publishPost(Object post);

    // @support WhatsApp, Facebook, Instagram
    public abstract void sendPhotosAndVideos();

    // @support WhatsApp, Facebook
    public abstract void groupVideoCall(String... users);
}
