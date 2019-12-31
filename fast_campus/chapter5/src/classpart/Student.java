package classpart;

public class Student {

    int studentID;
    String studentName;
    String address;

    public Student(){}

    public Student(int id, String name, String addr){
        studentName = name;
        studentID = id;
        address = addr;
    }

    public void showStudentInfo(){
        System.out.println(studentName + "," + address);
    }
}
