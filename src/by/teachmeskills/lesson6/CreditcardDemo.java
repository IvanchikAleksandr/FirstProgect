package by.teachmeskills.lesson6;

public class CreditcardDemo {
    public static void main(String[] args){
        Creditcard firstcreditcard = new Creditcard( "123by");
        Creditcard secondcreditcard = new Creditcard( "456by");
        Creditcard thirdcreditcard = new Creditcard( "789by");

        firstcreditcard.addsumm(100);
        secondcreditcard.addsumm(500);
        thirdcreditcard.addsumm(1000);

        firstcreditcard.withdraw(10);
        secondcreditcard.withdraw(10);
        thirdcreditcard.withdraw(10);

        System.out.println(firstcreditcard.getinfo());
        System.out.println(secondcreditcard.getinfo());
        System.out.println(thirdcreditcard.getinfo());
    }
}
