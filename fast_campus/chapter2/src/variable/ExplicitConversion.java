package variable;

public class ExplicitConversion {
    public static void main(String[] args) {
        int i = 1000;
        byte bNum = (byte)i;
        System.out.println(bNum);

        double dNum = 1.2;
        float fNum = 0.9f;

        int iNum = (int)(dNum + fNum);
        System.out.println(iNum);

    }
}
