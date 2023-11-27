import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        do { //At least does the condition once before checking condition
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        } while(name.isBlank()) //Check if name is blank

        System.out.print("Hello: " + name);

    }

}