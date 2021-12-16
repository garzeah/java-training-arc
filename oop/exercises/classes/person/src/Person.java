public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }

    public void setFirstName(String name) { firstName = name; }
    public void setLastName(String name) { lastName = name; }
    public void setAge(int num) {
        if (num < 0 || num > 100) age = 0;
        else age = num;
    }
    public boolean isTeen() { return age > 12 && age < 20; }
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) return "";
        if (lastName.isEmpty()) return firstName;
        if (firstName.isEmpty()) return lastName;
        return firstName + " " + lastName;
    }
}
