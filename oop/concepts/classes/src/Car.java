public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // Encapsulation prevents code being accessed directly.
    // It can only be accessed through a protective shield,
    // in this case it's through setters/getters

    // Setters
    // 1) Good to use setters bc we can do validation
    // 2) Can do some logic before we set the value
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("porsche") || validModel.equals("corolla")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    // Getters
    public String getModel() {
        return this.model;
    }
}
