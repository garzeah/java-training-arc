public class Main {

    // An interface is an abstract type that is used to
    // group related methods with empty bodies, the body
    // is provided when a class implements it
    public static void main(String[] args) {
        // When using an interface, have to declare it this way
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();
    }
}
