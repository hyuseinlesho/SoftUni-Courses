import java.util.Scanner;

public class P06ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int old = Integer.parseInt(scanner.nextLine());
        String city = scanner.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.",firstName,lastName,old,city);
    }
}
