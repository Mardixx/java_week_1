public class challenge1 {
    public static void main(String args[]) {
        int integerData = 100000000; //100 Million
        char characterData = 'c'; //Character
        byte byteDate = 100; //100
        short shortData = 30000; //30 Thousands
        long longData = 1000000000; //1 Billion
        float floatData = 1.4f; //1 Float
        double doubleData = 1.44548768435; //1 Double
        boolean booleanData = true; //1 Boolean
        int intMax = Integer.MAX_VALUE; //Integer.MAX_VALUE
        System.out.println(integerData);
        System.out.println(characterData);
        System.out.println(byteDate);
        System.out.println(shortData);
        System.out.println(longData);
        System.out.println(floatData);
        System.out.println(doubleData);
        System.out.println(booleanData);
        System.out.println(intMax);
    }
}

//Extras :
//
// How come you can just print all of these datatypes? Because they the primitives of Java
// Why are those called primitive data types? They are the data you to create everything else
// Why can't you assign a double to an integer? Integers only take whole numbers whereas double take both whole and floats
// But why can you assign an integer to a char? char only take 1 character wheras int take whole numbers
// Why can't you assign a long to a int? long datas are longer than int datas so it can't be assigned to integers