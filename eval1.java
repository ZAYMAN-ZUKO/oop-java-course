//create a class named yourname_ID
//with attribute string type name and int type id 
//also create an object called 'Lab1' that will initialize all attributes value of these class .
//then create another obj named 'Lab2' that will just copy all the values from obj Lab1

public class Nahim_1844 {
    // Fields - marked public so they can be printed in main
    public String name;
    public int id;

    // 1. Parameterized Constructor
    public Nahim_1844(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // 2. Copy Constructor
    public Nahim_1844(Nahim_1844 lab1) {
        this.name = lab1.name;
        this.id = lab1.id;
    }

    public static void main(String[] args) {
        // Create the first object
        Nahim_1844 lab1 = new Nahim_1844("Masrur", 1844);
        
        // Create the second object by copying the first
        Nahim_1844 lab2 = new Nahim_1844(lab1);

        // Print values to verify the copy worked
        System.out.println("Lab 1: " + lab1.name + " (ID: " + lab1.id + ")");
        System.out.println("Lab 2 (Copy): " + lab2.name + " (ID: " + lab2.id + ")");
    }
}
