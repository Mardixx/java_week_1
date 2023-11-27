import java.util.Scanner; //Scanner class

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //New scanner for user input

        System.out.println("What is your name? ");
        //Prompt What is your name?
        String name = scanner.nextLine(); //reads next line of scanner
        System.out.println("How old are you? ");//Prompt How old are you?

        int age = scanner.nextInt(); //reads next int of scanner
        scanner.nextLine(); //Clears scanner

        System.out.println("What is your favorite food? ");

        String food = scanner.nextLine(); //reads next line of scanner but gets skipped because you reused (nextLine())

        System.out.println("Hello " + name); //Displays Hello + user input
        System.out.println("You are " + age + " years old"); //Displays You are + user input + years old
        System.out.println("Your favorite food is " + food); //Displays Your favorite food is + food
    }
}