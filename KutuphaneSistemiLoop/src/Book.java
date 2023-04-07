import java.util.Date;

public class Book {
    private String isbn;
    private String baslik;
    private String yazar;
    private String yayinevi;
    private Date basimTarihi;

    public Book(String isbn, String baslik, String yazar, String yayinevi, Date basimTarihi) {
        this.isbn = isbn;
        this.baslik = baslik;
        this.yazar = yazar;
        this.yayinevi = yayinevi;
        this.basimTarihi = basimTarihi;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getBaslik() {
        return baslik;
    }

    public String getYazar() {
        return yazar;
    }

    public String getYayinevi() {
        return yayinevi;
    }

    public Date getBasimTarihi() {
        return basimTarihi;
    }
}

