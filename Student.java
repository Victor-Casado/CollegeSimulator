public class Student{
    private String name;
    private double GPA;
    private int ACT;
    private int SAT;
    private int essayStrength;
    private int extracurricularStrength;
    public Student(String name,double GPA,int ACT,int SAT, int essayStrength, int extracurricularStrength){
        this.name = name;
        this.GPA = GPA;
        this.ACT = ACT;
        this.SAT = SAT;
        this.essayStrength = essayStrength;
        this.extracurricularStrength = extracurricularStrength;
    }
    public String getName(){
        return name;
    }
    public double getGPA(){
        return GPA;
    }
    public int getACT(){
        return ACT;
    }
    public int getSAT(){
        return SAT;
    }
    public int essayStrength(){
        return essayStrength;
    }
    public int extracurricularStrength(){
        return extracurricularStrength;
    }
    public String toString(){
        return "Name: " + name + "\nGPA: " + GPA + "\nACT: " + ACT + "\nSAT: " + SAT + "\nEssay Strength: " + essayStrength + "\nExtraCurricular Strength: " + extracurricularStrength;
    }
}