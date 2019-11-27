// Test with Class Day.java from ch03 folder
import java.lang.reflect.*;

public class question1 {
    public static void main(String[] args) {
        // Create an instance of Day class for testing
        Day tmp = new Day();

        dumpClass(tmp);
    }

    private static void dumpClass(Day tmp) {
        //Create a class object
        Class c = Day.class;

        System.out.println("Package name: " + tmp.getClass().getPackageName());
        System.out.println("Class name: " + tmp.getClass());
        System.out.println("Superclass: " + tmp.getClass().getSuperclass());

        //Print the Constructors
        System.out.println("\nConstructors: ");

        // Save all constructors to an array
        Constructor[] constructors = c.getConstructors();
        for (Constructor co : constructors) {
            System.out.println("Constructor name: " + co.getName());
        }

        System.out.println("\nMethods: ");
        //Save all methods to an array
        Method[] methods = c.getMethods();
        for (Method m : methods) {
            System.out.print("\nMethod name: " + m.getName());
            for(Parameter p : m.getParameters())
            {
                System.out.print(", Parameter: " + p.getName());
            }
        }

        System.out.println("\n\nFields: ");

        //Save all fields to an array
        Field[] fields = c.getDeclaredFields();
        for (Field f : fields) {
                System.out.println( "Field name: " + f.getName() +
                                    ", Modifier: " + Modifier.toString(f.getModifiers())+
                                    ", Field type : " + f.getType() +
                                    ", Parameter: " + f.getType().getTypeParameters());


            }
        }
    }


