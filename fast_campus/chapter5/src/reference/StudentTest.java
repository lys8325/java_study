package reference;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100,"Lee");
        studentLee.setKoreanSubject(1,"국어",90);
        studentLee.setMatgSubject(2,"수학",100);

        Student studentKim = new Student(101,"Kim");
        studentKim.setKoreanSubject(1,"국어",100);
        studentKim.setMatgSubject(2,"수학",80);

        studentLee.showScore();
        studentKim.showScore();
    }
}
