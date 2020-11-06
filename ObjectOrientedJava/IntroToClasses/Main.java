

public class Main {


    public static void main(String...args) {
        System.out.println("hello");

        double val = 0.0001;

        System.out.println(val);

        Book book = new Book(); //this gives us access to the book class we made (it is called "instantation")

         //using the dot operator will allow you to see all the methods and variables the book has to offer
        System.out.println(book.coverColor);
        System.out.println(book.isBookOpen);

        book.openBook();

        System.out.println(book.isBookOpen);

        Mask mask = new Mask();
        System.out.println(mask.size);
    }
}