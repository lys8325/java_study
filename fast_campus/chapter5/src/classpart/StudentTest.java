package classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "이혁수";
        studentLee.address = "인천";

        studentLee.showStudentInfo();

        Student studentPark = new Student();
        studentPark.studentName = "박희원";
        studentPark.address = "서울";

        Student studentKim = new Student(10,"김","부평");
        studentKim.showStudentInfo();

        studentPark.showStudentInfo();

        System.out.println(studentLee);
        System.out.println(studentPark);

    }
}
