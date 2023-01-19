package by.teachmeskills.Lesson8;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone firstPhone = new Phone();
        firstPhone.getNumber();
        firstPhone.receiveCall("ALEX", "+375291112233");
        Phone secondPhone = new Phone("+375442224455", "Sony");
        String numberOfSecondPhone = secondPhone.getNumber();
        secondPhone.receiveCall("MARK");
        Phone thirdPhone = new Phone(numberOfSecondPhone, "Samsung", 110.1);
        String[] numbers = {"+375441112233", "+37529292233444", "+375338800777"};
        thirdPhone.sendMessage(numbers);
    }
}