package library;
import java.util.ArrayList;
public class Library {
    private static Library instance = new Library();
    private Library(){}
    ArrayList<Book> library = new ArrayList<Book>();

    public static Library getInstance(){
        return instance;
    }

    public void addBook(String name,String author){
        Book newBook = new Book(name,author);
        library.add(newBook);
    }

    public void booklist(){
        int total = 0;
        System.out.println("=== 도서관 보유 도서 목록 ===");
        for(Book b : library){
            System.out.println(b.getSerialNumber()+"-"+b.getName()+"-"+b.getAuthor());
            ++total;
        }
        System.out.println("총 도서 수 : "+total);
    }

    public Book findbook(int num){
        Book target = new Book(null,null);
        for(Book b : library){
            if(b.getSerialNumber() == num){
                 target = b;
            }
        }
        return target;
    }
}
