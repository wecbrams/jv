// Parent class representing a generic wonder
class Wonder {
    private String name;
    private String location;

    public Wonder(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    // Method to be overridden by subclasses (Polymorphism)
    public void displayDetails() {
        System.out.println(name + " is located in " + location + ".");
    }
}

// Subclasses for specific wonders inheriting from the Wonder class
class GreatWall extends Wonder {
    public GreatWall() {
        super("Great Wall of China", "China");
    }
}

class Petra extends Wonder {
    public Petra() {
        super("Petra", "Jordan");
    }
}

class Colosseum extends Wonder {
    public Colosseum() {
        super("Colosseum", "Italy");
    }
}

class ChichenItza extends Wonder {
    public ChichenItza() {
        super("Chichen Itza", "Mexico");
    }
}

class MachuPicchu extends Wonder {
    public MachuPicchu() {
        super("Machu Picchu", "Peru");
    }
}

class TajMahal extends Wonder {
    public TajMahal() {
        super("Taj Mahal", "India");
    }
}

class ChristTheRedeemer extends Wonder {
    public ChristTheRedeemer() {
        super("Christ the Redeemer", "Brazil");
    }
}

// Main execution class
public class SevenWonders {
    public static void main(String[] args) {
        // Polymorphism: Storing different subclass objects in a parent class array
        Wonder[] wonders = {
            new GreatWall(),
            new Petra(),
            new Colosseum(),
            new ChichenItza(),
            new MachuPicchu(),
            new TajMahal(),
            new ChristTheRedeemer()
        };

        System.out.println("--- The Seven Wonders of the World ---");
        
        // Looping through the array and invoking the polymorphic method
        for (Wonder wonder : wonders) {
            wonder.displayDetails();
        }
    }
}
