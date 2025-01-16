package Practice.ppp;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        // Creating a new Person object using the constructor
        Person person = new Person("John", 30);

        // Using getter methods to access the attributes
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Using setter methods to modify the attributes
        person.setName("Alice");
        person.setAge(25);

        // Printing the modified attributes using getter methods
        System.out.println("Modified Name: " + person.getName());
        System.out.println("Modified Age: " + person.getAge());
    }
}
