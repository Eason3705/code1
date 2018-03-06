import java.util.Arrays;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        String[] strings = new String[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个字符串:");
            strings[i] = scanner.nextLine();
        }
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
    }
}


