public class Main {
    public static int multiplier = 7;

    public static void main(String[] args) {
        // The same because it is not static and we're creating a new instance
        // every time. If we made it static then it would increment
//        StaticTest firstInstance = new StaticTest("1st");
//        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("2nd instance");
//        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstances());

        // Can also write it like this
//        StaticTest firstInstance = new StaticTest("1st");
//        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("2nd instance");
//        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        // Need to make multiply static so we have reference to it
        // If there is no static, then that means it doesn't exist
        // until an instance of it is created so we have to use static
        int answer = multiply(6);
        System.out.println("The answer is " + answer);
    }

    public static int multiply(int number) {
        return number * multiplier;
    }

}
