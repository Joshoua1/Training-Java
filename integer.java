// Q12. A class has an integer data member 'i' and a method named 'printNum' to print the value of 'i' .
//      Its subclass also an integer data member 'j' and an method named 'printNum' to print the value of'j' 
//      Make an object of the subclass and use it to assign a value to 'i' and to 'j' Now call the method  'printNum' by this object



     class BaseClass {
    protected int i;

    public void printNum() {
        System.out.println("Value of i: " + i);
    }
}

class SubClass extends BaseClass {
    private int j;

    public SubClass(int j) {
        this.j = j;
    }

    public void printNum() {
        System.out.println("Value of i: " + i);
        System.out.println("Value of j: " + j);
    }
}

public class integer {
    public static void main(String[] args) {
        SubClass obj = new SubClass(20);
        obj.i = obj.j; 
        obj.printNum(); 
    }
}