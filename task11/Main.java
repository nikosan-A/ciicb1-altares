package task11;
// Main.java
public class Main {
    public static void main(String[] args) {
        // Create three Book objects
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        // Print details
        System.out.println("Book 1:\n" + book1 + "\n");
        System.out.println("Book 2:\n" + book2 + "\n");
        System.out.println("Book 3:\n" + book3);
    }
}
