package task.org;
import java.util.Scanner;

public class TaskCalculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
    
 

    public class UserInput {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.println("Welcome " + name);

            sc.close();
        }
    }
}

//    public static void main(String[] args) {
//        TaskCalculator obj = new TaskCalculator();
//
//        System.out.println(obj.add(10, 20));       // 30
//        System.out.println(obj.add(10, 20, 30));   // 60
//        System.out.println(obj.add(10.5, 20.5));   // 31.0
//    }
//}
