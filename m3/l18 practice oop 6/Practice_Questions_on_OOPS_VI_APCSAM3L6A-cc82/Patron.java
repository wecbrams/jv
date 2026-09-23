import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private int id;
    private List<Item> checkedOutItems;

    public Patron(String name, int id) {
        this.name = name;
        this.id = id;
        this.checkedOutItems = new ArrayList<>();
    }

    // Part (c): Check out an item if under limit
    public void checkOutItem(Item item) {
        if (checkedOutItems.size() < 10) {
            checkedOutItems.add(item);
        }
    }

    // Part (d): Return an item
    public void returnItem(Item item) {
        checkedOutItems.remove(item);
    }

    // Part (e): Get number of checked-out items
    public int getNumItemsCheckedOut() {
        return checkedOutItems.size();
    }

    // Getters
    public String getName() { return name; }
    public int getId() { return id; }
    public List<Item> getCheckedOutItems() { return checkedOutItems; }
}
