import java.util.Scanner;

public class Practice{
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Name: ");
        String entry = keyboardInput.nextLine();
        System.out.println(entry);

        keyboardInput.close();

    }
}