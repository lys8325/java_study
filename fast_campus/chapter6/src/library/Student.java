package library;
import java.util.ArrayList;

public class Student {
    private static int ID = 10001;
    private String name;
    private int sid;
    private ArrayList<Book> list;

    public Student(String name){
        int num = ID;
        setName(name);
        setSid(num);
        ++ID;
        list = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void showList(){
        int total = 0;
        System.out.println("=== 학번 : "+getSid()+" - "+getName()+"님의 도서 대여 기록 ===");
        for(Book b : list){
            System.out.println(b.getSerialNumber()+"-"+b.getName()+"-"+b.getAuthor());
            ++total;
        }
        System.out.println("총 대여 권 수 : "+total);
    }


    public void getBook(int num){
        Library lib = Library.getInstance();
        Book rent = lib.findbook(num);
        list.add(rent);
        System.out.println(getName()+"님이 도서관에서 "+rent.getName()+"을 대여하였습니다.");
    }

}
