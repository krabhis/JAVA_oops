// package playingWithJava;

interface Animal {
    void makesound();
}

class Horse implements Animal {
    @Override
    public void makesound() {
        System.out.println("hen hen hen");
    }
}

class Dog implements Animal {
    @Override
    public void makesound() {
        System.out.println("Bhau Bhau");
    }
}

class Lion implements Animal {
    @Override
    public void makesound() {
        System.out.println("Nahi pta");
    }
}

public class interfacePrac {
    public static void main(String[] args) {
        Animal obj1 = new Horse();
        Animal obj2 = new Dog();
        Animal obj3 = new Lion();

        obj1.makesound();
        obj2.makesound();
        obj3.makesound();

    }
}
