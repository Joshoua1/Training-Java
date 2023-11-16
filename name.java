class Person {
    private String name;
    private int age;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

public class name {
    public static void main(String[] args) {
        Person person = new Person();

        // Set values using setter methods
        person.setName("Al Bashir");
        person.setAge(30);
        person.setCountry("Pakitan");

        // Get values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Country: " + person.getCountry());

        // Modify values using setter methods
        person.setAge(35);
        person.setCountry("India");

        // Get modified values using getter methods
        System.out.println("Modified Age: " + person.getAge());
        System.out.println("Modified Country: " + person.getCountry());
    }
}
