import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException{
        try {
            System.out.println("Before reading file");
            readFile(new String[]{"test.txt"});
            System.out.println("CLosing file");
        }
        catch(FileNotFoundException e){
            System.out.println("Wyjątek został wyrzucony");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Closing ");
        }

    }

    public static void readFile(String[] path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(String.valueOf(path));
    }
}
