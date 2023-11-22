
//Classes
public class challenge2 {
    String name;
    public challenge2(String name){ this.name = name; }
    public String getName() { return name; } //"Function"
    @Override public String toString(){ return ("Hi my name is " + this.getName()); }
    public static void main(String[] args)
    {
        challenge2 Kimi = new challenge2("Kimi");
        System.out.println(Kimi.toString());
    }
}
//Objects
class Student {

    int id;
    String name;

    public static void main(String args[])
    {
        Student s1 = new Student();

        s1.id = 5;
        s1.name = "Maxwell";

        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
interface Interface {
    final int a = 10;

    void display();
}

class testing implements Interface {
    public void display() {
        System.out.println("Kimi");
    }
    public static void main(String[] args) {
        testing t = new testing();
        t.display();
        System.out.println(a);
    }
}

class Array {
    public static void main(String args[]) {
        int[] arr;

        arr = new int[5]; //5 elements(ints in this case) in array

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for(int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
    }
}

//Very extra :
// Is there a way to loop over all of the variables automatically and only have 1 print statement? If so, why was this not possible the primitive datatypes? Yes it is possible, it is impossible to make arrays so no loop.
