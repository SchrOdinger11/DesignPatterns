package BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {
        // Create a new object of the class
        User user = new User()
                .setAge("30")
                .setPhone("1234567890")
                .setAddress("Fake Address 123")
                .build();

        // Print the object
        user.details();
        user.setGender("M");
       user.details();
        user.removePhone();
        user.details();
    }
}
