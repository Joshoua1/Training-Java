class Degree {
    public void getDegree() {
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree {
    public void getDegree() {
        System.out.println("I am an undergraduate");
    }
}

class Postgraduate extends Degree {
    public void getDegree() {
        System.out.println("I am a postgraduate");
    }
}

public class Main {
    public static void main(String[] args) {
        Degree degreeObj = new Degree();
        Undergraduate undergradObj = new Undergraduate();
        Postgraduate postgradObj = new Postgraduate();

        degreeObj.getDegree();
        undergradObj.getDegree();
        postgradObj.getDegree();
    }
}
