import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int age;
        String name ;

        System.out.println("Please enter your name: ");
        name = scanner.nextLine();

        System.out.print("Please enter your age: ");
        age = scanner.nextInt();

        if(name.isEmpty()){
            System.out.println("You didn't enter you name...");
        }
        else{
            System.out.println("Hello " + name + "!");
        }



        if(age >= 65){
            System.out.println("You are  a senior");
        }
        else if(age >= 18){
            System.out.println("You are an adult");
        }
        else if(age<0){
            System.out.println("You haven't born yet");
        }
        else{
            System.out.println("You are a child ");

        }
    }
}
