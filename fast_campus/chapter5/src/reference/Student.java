package reference;

public class Student {
    int studentID;
    String studentName;

    Subject korean;
    Subject math;

    public Student(int id,String name){
        studentID = id;
        studentName = name;

        korean = new Subject();
        math = new Subject();
    }

    public void setKoreanSubject(int id,String name,int score){
        korean.score = score;
        korean.subjectname = name;
        korean.subjectID = id;
    }

    public void setMatgSubject(int id,String name,int score){
        math.score = score;
        math.subjectname = name;
        math.subjectID = id;
    }

    public void showScore(){
        int total = math.score + korean.score;
        System.out.println(studentName + "의 총점은 : " + total + " 입니다.");
    }

}
