class Animal {
    void fazerSom() {
        System.out.println("Som de animal");
    }
}

class Cachorro extends Animal {
    void latir() {
        System.out.println("Latido");
    }
}

public class Heritage {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.latir();
        dog.fazerSom();
    }
}