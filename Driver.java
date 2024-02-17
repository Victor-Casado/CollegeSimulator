import java.util.Scanner;

public class Driver{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        double GPA = -1;
        boolean goodInput = false;
        while(!goodInput){
            try{
                System.out.print("Enter your GPA: ");
                GPA = Double.parseDouble(input.nextLine());
                if (GPA >= 0 && GPA <= 5){
                    goodInput = true;
                }
                else{
                    System.out.println("please enter a valid GPA (from 0.0 to 5.0)");
                }
            }
            catch(Exception e){
                System.out.println("please enter a valid GPA (from 0.0 to 5.0)");
            }
        }

        double ACT = -1;
        goodInput = false;
        while(!goodInput){
            try{
                System.out.print("Enter your ACT: ");
                ACT = Double.parseDouble(input.nextLine());
                if (ACT >= 0 && ACT <= 36){
                    goodInput = true;
                }
                else{
                    System.out.println("please enter a valid ACT (from 1.0 to 36.0)");
                }
            }
            catch(Exception e){
                System.out.println("please enter a valid ACT (from 1.0 to 36.0)");
            }
        }

        int SAT = -1;
        goodInput = false;
        while(!goodInput){
            try{
                System.out.print("Enter your SAT: ");
                SAT = Integer.parseInt(input.nextLine());
                if (SAT >= 400 && SAT <= 1600){
                    goodInput = true;
                }
                else{
                    System.out.println("please enter a valid SAT (from 400 to 1600)");
                }
            }
            catch(Exception e){
                System.out.println("please enter a valid ACT (from 400 to 1600)");
            }
        }

        int essayStrength = -1;
        goodInput = false;
        while(!goodInput){
            try{
                System.out.print("Enter your Essay Strength (0-100): ");
                essayStrength = Integer.parseInt(input.nextLine());
                if (essayStrength >= 0 && essayStrength <= 100){
                    goodInput = true;
                }
                else{
                    System.out.println("please enter a valid Essay Strength (from 0 to 100)");
                }
            }
            catch(Exception e){
                System.out.println("please enter a valid Essay Strength (from 0 to 100)");
            }
        }

        int extracurricularStrength = -1;
        goodInput = false;
        while(!goodInput){
            try{
                System.out.print("Enter your ExtraCurricular Strength (0-100): ");
                extracurricularStrength = Integer.parseInt(input.nextLine());
                if (extracurricularStrength >= 0 && extracurricularStrength <= 100){
                    goodInput = true;
                }
                else{
                    System.out.println("please enter a valid ExtraCurricular Strength (from 0 to 100)");
                }
            }
            catch(Exception e){
                System.out.println("please enter a valid ExtraCurricular Strength (from 0 to 100)");
            }
        }

        Student user = new Student(name, GPA, ACT, SAT, essayStrength, extracurricularStrength);
        System.out.println("--------------------------");
        System.out.println(user);
    }
}