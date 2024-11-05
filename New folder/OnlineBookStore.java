class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

class Order {
    private Customer customer;
    private Book book;
    private int quantity;

    public Order(Customer customer, Book book, int quantity) {
        this.customer = customer;
        this.book = book;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return book.getPrice() * quantity;
    }

    public void placeOrder() {
        System.out.println("Order placed successfully!");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Book: " + book.getTitle());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + calculateTotal());
    }
}

public class OnlineBookStore {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", 50.0);
        Customer customer = new Customer("John Doe", "johndoe@example.com");
        Order order = new Order(customer, book, 2);

        order.placeOrder();
    }
}