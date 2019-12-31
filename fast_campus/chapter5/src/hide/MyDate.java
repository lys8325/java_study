package hide;

public class MyDate {
    private int year;
    private int month;
    private int day;
    private boolean valid = true;

    public MyDate(int year,int month, int day){
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public boolean getValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year <= 0){
            setValid(false);
        }
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month >= 13 || month <= 0){
            setValid(false);
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        switch (this.month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(day >= 32 || day <= 0){
                    setValid(false);
                }
                this.day = day;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if(day >= 31 || day <= 0){
                    setValid(false);
                }
                this.day = day;
                break;
            case 2:
                if(day >= 29 || day <= 0){
                    setValid(false);
                }
                this.day = day;
                break;
            default: // 이미 유효하지않음
                this.day = day;
        }
    }

    public String Date(){
        String result = getYear() + "년 " + getMonth() + "월 " + getDay() + "일";
        return result;
    }

    public void isValid(){
        boolean check = getValid();
        if(check){
            System.out.println(Date()+"은 유효한 날짜입니다." );
        }
        else{
            System.out.println(Date()+"은 유효하지 않은 날짜입니다.");
        }
    }
}
