//public class ExtendedPassword extends Password {
//    private int decryptedPassword;
//
//    public ExtendedPassword(int password) {
//        // While it goes to the main class, hackers
//        // can save the actual password if u make it
//        // extendable
//        super(password);
//        this.decryptedPassword = password;
//    }
//
//    // Mark Password class method as final to prevent overrides
//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
//}
