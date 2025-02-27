// Class Mother


// Class Child that extends Mother

// Class Application to test the inheritance
public class Application {
    public static void main(String[] args) {
        // Creating an instance of Mother
        Mother m = new Mother();
        m.show(); // Show of Mother is called

        // Creating an instance of Child
        Child ch = new Child();
        ch.show(); // Show inherited in Child from Mother is called
    }
}
