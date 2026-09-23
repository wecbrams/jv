// Guess: Is it runtime or compile-time polymorphism?

class Hillstations {
    void location() {
        System.out.println("Location is:");
    }

    void famousFor() {
        System.out.println("Famous for:");
    }
}

class Manali extends Hillstations {
    @Override
    void location() {
        System.out.println("Manali is in Himachal Pradesh");
    }

    @Override
    void famousFor() {
        System.out.println("It is famous for Hadimba Temple and adventure sports");
    }
}

class Mussoorie extends Hillstations {
    @Override
    void location() {
        System.out.println("Mussoorie is in Uttarakhand");
    }

    @Override
    void famousFor() {
        System.out.println("It is famous for education institutions");
    }
}

class Gulmarg extends Hillstations {
    @Override
    void location() {
        System.out.println("Gulmarg is in Jammu & Kashmir");
    }

    @Override
    void famousFor() {
        System.out.println("It is famous for skiing");
    }
}

public class HillStationMain {
    public static void main(String[] args) {
        Hillstations A = new Hillstations(); // Parent class object
        Hillstations M = new Manali();      // Manali object
        Hillstations Mu = new Mussoorie();  // Mussoorie object
        Hillstations G = new Gulmarg();     // Gulmarg object

        // Calling methods for each object
        A.location();
        A.famousFor();

        M.location();
        M.famousFor();

        Mu.location();
        Mu.famousFor();

        G.location();
        G.famousFor();
    }
}
