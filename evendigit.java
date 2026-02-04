import java.util.*;

public class evendigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("no:");
        String n = sc.nextLine();
        int sum = 0;

        for (int i = 1; i < n.length(); i += 2) {
            sum += n.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}