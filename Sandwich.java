import java.text.DecimalFormat;

public class Sandwich {
    private String meat;
    private String bread;
    private String cheese;

    public Sandwich() {
        meat = chooseMeat();
        bread = chooseBread();
        cheese = chooseCheese();
    }

    public Sandwich(String meat, String bread, String cheese) {
        this.meat = meat;
        this.bread = bread;
        this.cheese = cheese;
    }

    private String chooseBread() {
	    String [] breads = {"White", "Flat Bread", "Sourdough", "Wheat", "Briosche"};
	    int choice = (int)(Math.random()*breads.length);
    	return breads[choice];
    }


    private String chooseMeat() {
	    String [] meats = {"Ham", "Roast Beef", "Chicken", "Turkey", "Tuna Salad"};
	    int choice = (int)(Math.random()*meats.length);
	    return meats[choice];
    }

    private String chooseCheese() {
	    String [] cheeses = {"Mozzarella", "Blue", "American", "Cheddar", "Brie"};
	    int choice = (int)(Math.random()*cheeses.length);
	    return cheeses[choice];
    }

    public String getMeat() {
        return meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCheese() {
        return cheese;
    }

    private double calculatePrice() {
        double price = 2.50;
        if (bread.equals("Flat Bread")) {
            price += .75;
        }
        if (meat.equals("Roast Beef")) {
            price += 1;
        }
        return price;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("$#.##");
        return meat + " on " + bread + " with " + cheese + " cheese : " + df.format(this.calculatePrice());
    }
}
