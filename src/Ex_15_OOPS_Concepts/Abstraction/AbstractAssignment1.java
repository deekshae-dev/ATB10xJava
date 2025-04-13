package Ex_15_OOPS_Concepts.Abstraction;

public class AbstractAssignment1 {
    public static void main(String[] args) {
        MyBook b1 = new MyBook("Harry Potter", "JK Rowling", "1000");
        b1.getDetails();
            }
        }

    abstract class Book {
        String name;
        String author;
        String price;

        public Book(String name, String author, String price) {
            this.name = name;
            this.author = author;
            this.price = price;
        }

        abstract void getDetails();
    }

//concrete subclass
class MyBook extends Book {

    public MyBook(String name, String author, String price) {
            super(name, author, price);
        }

        //override abstract method
        @Override
        void getDetails () {
            System.out.println("Name:" + name + ",Author :" + author + ", price:" + price);
        }
    }


