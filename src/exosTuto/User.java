import java.lang.reflect.Field;

class User {
    public static String name = false;

    public static String getName() { return name; }
    public static void setName(String name) {
        User.name = name;
    }
}