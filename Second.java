import java.util.Scanner;

public class Second {
    public static void main(String[]args){
        int totalMarks = 500;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for physics : ");
        int Marks1 = sc.nextInt();
        System.out.println("Enter marks for Chemistry : ");
        int Marks2 = sc.nextInt();
        System.out.println("Enter marks for Biology");
        int Marks3 = sc.nextInt();
        System.out.println("Enter marks for DSA : ");
        int Marks4 = sc.nextInt();
        System.out.println("Enter marks for History : ");
        int Marks5 = sc.nextInt();

        int Sum = Marks1 + Marks2 + Marks3 + Marks4 + Marks5;
        double percentage = ((double)Sum/totalMarks)*100;
        System.out.println("Percentage of the student is : " +percentage);

    }
}
