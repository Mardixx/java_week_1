import java.lang.reflect.Field;

public class fields{
    public static void main(String[] args) throws Exception{
        //Create User object
        User user = new User();
        //Get all objects of User class
        Field[] fields = User.class.getFields();

        for (int i = 0; i < fields.length; i++) {
            //Get values of the fields
            Object value = fields[i].get(user);
            System.out.println("Value of field " + fields[i].getName() + " is " + value);
        }
    }
}