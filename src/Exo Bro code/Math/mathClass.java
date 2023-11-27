public class mathClass {

    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;
        double w = 10;

        double z = Math.max(x, y); //Maximum of two values
        double u = Math.min(x, y); //Minimum of two values
        double abs = Math.abs(z); //Absolute of a value
        double sqrt = Math.sqrt(w); //Square root of a value
        double round = Math.round(x); //Round of a value
        double ceil = Math.ceil(x); //Ceiling of a value (round up)
        double floor = Math.floor(x); //Floor of a value (round down)

        System.out.println(z);
        System.out.println(u);
        System.out.println(abs);
        System.out.println(sqrt);
        System.out.println(round);
        System.out.println(ceil);
        System.out.println(floor);

    }

}