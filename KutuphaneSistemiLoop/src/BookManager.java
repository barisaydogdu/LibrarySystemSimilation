import java.util.Date;

public class BookManager {
    private final ILogger logger;

    public BookManager(ILogger logger) {
        this.logger = logger;
    }
    public void addBook(Book book) {
        // Kitap ekleme işlemleri


        logger.log("Yeni bir kitap eklendi: " + book.getBaslik());
    }

    public void removeBook(Book book) {
        // Kitap silme işlemleri


        logger.log("Bir kitap silindi: " + book.getBaslik());
    }

    public void lendBook(User user, Book book, Date returnDate) {
        // Kitap ödünç alma işlemleri


        logger.log(user.getFirstName() + " adlı kullanıcı " + book.getBaslik() + " adlı kitabı ödünç aldı. Geri teslim tarihi: " + returnDate);
    }
}

