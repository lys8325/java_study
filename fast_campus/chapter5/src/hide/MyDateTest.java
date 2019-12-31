package hide;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2019,12,29);
        MyDate date2 = new MyDate(1999,13,21);
        MyDate date3 = new MyDate(2020,2,29);

        date1.isValid();
        date2.isValid();
        date3.isValid();
    }
}
