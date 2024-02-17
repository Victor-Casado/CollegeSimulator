import java.util.Scanner;

public class Driver{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your GPA: ");
        double GPA = Double.parseDouble(input.nextLine());
        System.out.print("Enter your ACT: ");
        int ACT = Integer.parseInt(input.nextLine());
        System.out.print("Enter your SAT: ");
        int SAT = Integer.parseInt(input.nextLine());
        System.out.print("Enter your Essay Strength (1-100): "); //essay strength and extracurricular strength will be replaced by functions w more questions in future possibly
        int essayStrength = Integer.parseInt(input.nextLine());
        System.out.print("Enter your ExtraCurricular Strength (1-100): ");
        int extracurricularStrength = Integer.parseInt(input.nextLine());
        Student user = new Student(name, GPA, ACT, SAT, essayStrength, extracurricularStrength);
        System.out.println("--------------------------");
        System.out.println(user);
    }
}