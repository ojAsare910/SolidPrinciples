package DependencyInversionPrinciple;

public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount) {
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard bankCard1 = new DebitCard();
        BankCard bankCard2 = new CreditCard();
        ShoppingMall shoppingMall1 = new ShoppingMall(bankCard1);
        shoppingMall1.doPurchaseSomething(5000);
        ShoppingMall shoppingMall2 = new ShoppingMall(bankCard2);
        shoppingMall1.doPurchaseSomething(1000);
    }
}
