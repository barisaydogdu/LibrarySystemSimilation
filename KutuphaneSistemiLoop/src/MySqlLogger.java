public class MySqlLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("MySql Loglama işlemi gerçekleşti"+ message);
    }
}
