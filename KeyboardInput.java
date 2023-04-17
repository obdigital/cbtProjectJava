import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("What is your name?");
        String answer = keyboardInput.nextLine();
        System.out.println(answer);

        keyboardInput.close();
    }
}
