//subclass

public class DVD extends Product {
    private int length;
    private String rating;
    private String studio;

    public DVD() {
        super(19, "Arash", 98, 1000000);
        length = 100;
        rating = "NC-14";
        studio = "Renzz";
    }

    public DVD(int number, String name, int quantity, double price, int length, String rating, String studio) {
        super(number, name, quantity, price);
        this.length = length;
        this.rating = rating;
        this.studio = studio;
    }

        public void print() {
            super.print();
            System.out.println("Length = "+ length); 
            System.out.println("Rating = "+ rating);
            System.out.println("Studio = "+ studio);
        }
    }