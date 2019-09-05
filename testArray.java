import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class TestArray {
    File file = new File("myText.txt");
    private static List<Student> students = new ArrayList<>();

    public void saveStudent(){
        try {
        Scanner sc = new Scanner(file);
        int i =0;
        while (sc.hasNextLine()) {
            String a = sc.next() ;
            int b = sc.nextInt() ;
            String c = sc.next() ;
            Student s = new Student();
            s.setName(a);s.setAge(b);s.setDistric(c);
            students.add(s);
            i++;
        }
        sc.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) { 
        TestArray a = new TestArray();
        a.saveStudent();
        for(Student s : students){
            System.out.println(s.getName() + " "+ s.getAge() +" "+ s.getDistric());
        }
    }
}
