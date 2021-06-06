package day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "intro to java";
        book.author = "Savith";
        book.type = "programming";
        book.price = 69;
        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        AudioBook audioBook = new AudioBook();
        audioBook.author = "Unmesh";
        audioBook.length = 60;
        audioBook.narrator = "Irina";
        audioBook.price = 33;
        audioBook.title = "Seleniom CookBook";
        audioBook.type = "automation";
        audioBook.listen();

        EBook eBook = new EBook();
        eBook.title = "Java data structure";
        eBook.author = "Savitch";
        eBook.type = "programming";
        eBook.price = 85;
        eBook.size = 2;
        eBook.pages = 1000;
        eBook.readBook();



    }
}
