import java.text.DecimalFormat;

public class Book {
    //Create a Book class that allows for Book title, author, description, price and isInStock variables
    //The Book class shall contain private member variables, a default constructor, an overloaded constructor
    // and a method called getDisplayText() which prints the author, title and description.
    //The application shall also contain getters and setters for each private member variable.
    // In the main method you shall create an instance of a Book and print the Author, Title and Description.
    private String sku;
    private String bookTitle;
    private String author;
    private String description;
    private double price;
    private String isInStock;
    private int amount;
    public Book(){
        String sku = "";
        String bookTitle = "";
        String author = "";
        String description = "";
        double price = 0.0;
        String isInStock = "";
        int amount = 0;
    }

    public Book(String sku,String bookTitle,String author, String description, double price, String isInStock, int amount){
super();
this.sku =sku;
this.bookTitle = bookTitle;
this.author =author;
this.description = description;
this.price = price;
this.isInStock = isInStock;
this.amount = amount;
    }
public String getDisplayText(){
    return  "SKU                 " + getSku() + "\n" +
            "Book Title:         " + getBookTitle() + "\n" +
            "Author:             " + getAuthor() + "\n" +
            "Description:        " + getDescription() + "\n" +
            "In Stock:           " + getIsInStock() + "\n" +
            "Amount:             " + getAmount() + "\n" +
            "Price per book:     " + getPrice() + "\n" +
            "Price altogether:   " + this.getFormattedPrice(getTotal()) + "\n";
}

    public String getSku() {
        return sku;
    }
    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
    public double getTotal() {
        if (getIsInStock().equalsIgnoreCase("yes")) {
            return price * amount;
        }else {
            return 0;
        }
}
    public String getBookTitle() {
        return bookTitle;
    }

    public String getDescription() {
        return description;
    }

    public String getIsInStock() {
        return isInStock;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIsInStock(String isInStock) {
        this.isInStock = isInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getFormattedPrice(Double price){
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(price);
    }
    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
}