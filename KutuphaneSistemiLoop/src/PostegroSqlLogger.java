public class PostegroSqlLogger implements ILogger{
    @Override
    public void log(String message) {
        System.out.println("PostegroSql Loglama işlemi gerçekleşti"+ message);

    }
}
