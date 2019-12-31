package array;
import java.util.ArrayList;

public class arr {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("1");
        arr.add("3");
        arr.add(1,"2");
        arr.add(0,"0");

        for(String s : arr){
            System.out.println(s);
        }
        arr.remove(1);
        System.out.println(arr.get(1));

        arr.set(2,"replace");
        for(int i=0;i<arr.size();++i){
            if(arr.get(i) == "replace"){
                arr.set(i,"complete");
            }
        }

        for(String s : arr){
            System.out.println(s);
        }

    }
}
