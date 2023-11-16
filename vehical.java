class Vehicle {
  int noOfTyres;
  
  void start() {
    
  }
}

class Car extends Vehicle {

  void start() {
    System.out.println("Car starts with keys");
  }
}

class Scooter extends Vehicle {

  void start() {
    System.out.println("Scooter starts with kicks");
  }
}

public class vehical {
  public static void main(String[] args) {
    Car c1 = new Car();
    c1.start();
    
    Scooter s1 = new Scooter();
    s1.start();
}
}