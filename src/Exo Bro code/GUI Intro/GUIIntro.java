import javax.swing.JOptionPane;

public class GUIIntro {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name"); //Prompts with a window asking the question What is your name?
        JOptionPane.showMessageDialog(null, "Hello " + name + "!"); //Displays Hello + name + !

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); //Returns string and converts it to integer
        JOptionPane.showMessageDialog(null, "You are " + age + " years old"); //Displays Your are + age + years old

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height")); //Returns string and converts it to double
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall"); //Displays Your are + height + cm tall

    }

}