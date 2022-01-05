public class Main {

    public static void main(String[] args) {
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");

//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());

        // Can't do this bc it is final
        // one.instanceNumber = 4;

//        System.out.println(Math.PI);

        // Marking a class as final prevents your class from
        // being a sub-class
//        Math m = new Math();

//        int pw = 674312;
//        Password password = new Password(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(2);
//        password.letMeIn(674312);

        // Good to mark it as final so ppl don't extend class
        // and override methods, big security vulnerability
//        Password extendedPassword = new ExtendedPassword(pw);
//        extendedPassword.storePassword();
//
//        extendedPassword.letMeIn(1);
//        extendedPassword.letMeIn(2);
//        extendedPassword.letMeIn(674312);


        // Static initialization block example
        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }
}
