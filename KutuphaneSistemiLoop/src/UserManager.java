import java.util.Date;

public class UserManager {
    private final ILogger logger;

    public UserManager(ILogger logger) {
        this.logger = logger;
    }

    public void addUser(User user) {
        // Üye ekleme işlemleri
        logger.log("Yeni bir kullanıcı eklendi: " + user.getFirstName());
    }

    public void removeUser(User user) {
        // Üye silme işlemleri


        logger.log("Bir kullanıcı silindi: " + user.getFirstName());
    }

}
