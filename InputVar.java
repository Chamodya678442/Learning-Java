import java.util.Scanner;

public class InputVar {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your favourite colour : ");
        String colour = scanner.nextLine();
        scanner.nextLine(); //without this, problem occur cuz after it get input after integer

        System.out.print("What is you GPA : ");
        double GPA = scanner.nextDouble();

        System.out.print("Are you student : ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println( "Hello " + name + "\n" + "You are "+ age + " years old.\n" + "Your GPA is " + GPA + "\n" + "Student status: " + isStudent);
        scanner.close();
    }
}
