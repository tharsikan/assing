import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Test {
public static void main(String[] args) {

    File file = new File("myText.txt");

    try {

        Scanner sc = new Scanner(file);
        
        while (sc.hasNextLine()) {
            String a = sc.next() ;
            String b = sc.next() ;
            String c = sc.next() ;
            System.out.printf("%s %s %s \n", a, b, c);
        }
        sc.close();
    } 
    catch (FileNotFoundException e) {
        e.printStackTrace();
    }
 }
}