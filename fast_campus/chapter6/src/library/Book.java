package library;

public class Book {
    private String name;
    private String author;
    private int serialNumber;
    private static int SN = 101;

    public Book(String name, String author){
        int num = SN;
        setSerialNumber(num);
        ++SN;
        setName(name);
        setAuthor(author);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}
