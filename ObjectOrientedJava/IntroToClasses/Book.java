public class Book {
    

    //these are attributes of the book
    int pageCount = 2000;
    String coverColor = "Brown";
    boolean isHardCover = true;
    String author = "Jack Miles";
    String publisher = "Norton";
    boolean isBookOpen = false;

    //these methods are how we interact with the book
    void openBook() {
        isBookOpen = true;
    }

    void closeBook() {
        isBookOpen = false;
    }
}
