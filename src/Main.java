import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 1- with StringBuilder
        StringBuilder sb = new StringBuilder("hello world");
        System.out.println("sb= "+sb);
        System.out.println("sb reverse= " + sb.reverse());

        //2- without StringBuilder
        String str = "hello";
        char[] charArr = str.toCharArray();
        char[] charArrReverse = new char[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            charArrReverse[charArr.length-1-i] = charArr[i];
        }
        String reversedString = new String(charArrReverse);
        System.out.println(reversedString);
    }
}
