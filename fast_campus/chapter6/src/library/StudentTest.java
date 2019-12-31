package library;

public class StudentTest {
    public static void main(String[] args) {
        Library hongik = Library.getInstance();
        hongik.addBook("해리포터1","롤링");
        hongik.addBook("해리포터2","롤링");
        hongik.addBook("해리포터3","롤링");
        hongik.addBook("해리포터4","롤링");
        hongik.addBook("해리포터5","롤링");
        hongik.addBook("해리포터6","롤링");
        hongik.addBook("해리포터7","롤링");
        hongik.addBook("삼국지1","작자미상");
        hongik.addBook("삼국지2","작자미상");
        hongik.addBook("삼국지3","작자미상");
        hongik.addBook("삼국지4","작자미상");
        hongik.addBook("삼국지5","작자미상");
        hongik.addBook("수학의 정석1","윤복식");
        hongik.addBook("수학의 정석2","윤복식");
        hongik.addBook("운영체제","타운버그");
        hongik.addBook("기디비","라마크리샨");
        hongik.addBook("원가회계","신홍철");

        hongik.booklist();

        Student lee = new Student("Lee");
        Student park = new Student("Park");
        Student kim = new Student("Kim");

        lee.getBook(101);
        lee.getBook(111);
        lee.getBook(108);
        lee.getBook(103);
        lee.getBook(110);

        park.getBook(102);
        park.getBook(103);
        park.getBook(104);
        park.getBook(117);

        kim.getBook(113);
        kim.getBook(114);
        kim.getBook(115);
        kim.getBook(106);
        kim.getBook(107);
        kim.getBook(108);
        kim.getBook(109);

        lee.showList();
        park.showList();
        kim.showList();


    }

}
