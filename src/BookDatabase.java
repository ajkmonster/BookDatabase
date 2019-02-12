import java.util.Scanner;

public class BookDatabase {
    public static void main(String[] args){
        Scanner keybd = new Scanner(System.in);
        Scanner keybd2 = new Scanner(System.in);
        int amount;
        String input;
        do {
            System.out.print("Enter the amount of books you would like: ");
            amount = keybd.nextInt();
            Book a = new Book("Java1001","Head First Java","Kathy Sierra and Bert Bates","Easy to read Java workbook",
                    47.50, "Yes", amount);
            Book b = new Book("Java1002","Thinking in Java","Bruce Eckel","Details about Java under the hood",
                    20.00, "Yes", amount);
            Book c = new Book("Orcl1003","OCP: Oracle Certified Professional Java SE","Jeanne Boyarsky",
                    "Everything you need to know in one place",	45.00, "No",amount);
            Book d = new Book( "Python1004","Automate the Boring Stuff with Python","Al Sweigart",
                    "Fun with Python",10.50,"Yes",amount);
            Book e = new Book( "Zombie1005",	"The Maker's Guide to the Zombie Apocalypse","Simon Monk",
                    "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi",	16.50,"Yes",amount);
            Book f = new Book("Rasp1006","Raspberry Pi Projects for the Evil Genius","Donald Norris",
                    "A dozen fiendishly fun projects for the Raspberry Pi!",	14.75,"Yes",amount);
            System.out.print("Please enter your SKU code or "+"\"quit\""+": ");
            input = keybd2.nextLine().toLowerCase();
            switch (input){
                case "java1001":
                    System.out.println(a.getDisplayText());
                    break;
                case "java1002":
                    System.out.println(b.getDisplayText());
                    break;
                case "Orc11003":
                    System.out.println(c.getDisplayText());
                    break;
                case "python1004":
                    System.out.println(d.getDisplayText());
                    break;
                case "zombie1005":
                    System.out.println(e.getDisplayText());
                    break;
                case "rasp1006":
                    System.out.println(f.getDisplayText());
                    break;
                case "quit":
                    System.out.println("Thank you for using our database.");
                    break;
                default:
                    System.out.println("You have given the wrong SKU. Please try again.");
                    break;

            }
        }while (!input.equalsIgnoreCase("quit"));
    }
}
