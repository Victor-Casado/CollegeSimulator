import java.util.Scanner;

public class Driver{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = getStringInput(name, input);
        double GPA = getDoubleInput("GPA", input, 0.0, 5.0);
        double ACT = getDoubleInput("ACT", input, 1.0, 36.0);
        int SAT = getIntegerInput("SAT", input, 400, 1600);
        int essayStrength = getIntegerInput("Essay Strength", input, 0, 100);
        int extracurricularStrength = getIntegerInput("ExtraCurricular Strength", input, 0, 100);

        Student user = new Student(name, GPA, ACT, SAT, essayStrength, extracurricularStrength);
        System.out.println("--------------------------");
        System.out.println(user);
    }
    public String getStringInput(String inputName, scanner input){
        System.out.println("Enter your " + inputName + ": ");
        return input.nextLine;
    }
    public double getDoubleInput(String inputName, scanner input, double min, double max){
        double output = min - 1;
        boolean goodInput = false;
        while(!goodInput){
            try{
                System.out.print("Enter your " + inputName + ": ");
                output = Double.parseDouble(input.nextLine());
                if (output >= min && output <= max){
                    goodInput = true;
                }
                else{
                    System.out.println("please enter a valid " + inputName + " (from " + min + " to " + max + " )");
                }
            }
            catch(Exception e){
                System.out.println("please enter a valid " + inputName + " (from " + min + " to " + max + " )");
            }
        }
        return output;
    }
    public double getIntegerInput(String inputName, scanner input, int min, int max){
        int output = min - 1;
        boolean goodInput = false;
        while(!goodInput){
            try{
                System.out.print("Enter your " + inputName + ": ");
                output = Integer.parseInt(input.nextLine());
                if (output >= min && output <= max){
                    goodInput = true;
                }
                else{
                    System.out.println("please enter a valid " + inputName + " (from " + min + " to " + max + " )");
                }
            }
            catch(Exception e){
                System.out.println("please enter a valid " + inputName + " (from " + min + " to " + max + " )");
            }
        }
        return output;
    }
}