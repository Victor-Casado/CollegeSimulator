public class College{
    private int minimumGPA;
    private int minimumACT;
    private int minimumSAT;
    private int minimumEssayStrength;
    private int minimumExtraCurricularStrength;
    public College(int minimumGPA,int minimumACT,int minimumSAT,int minimumEssayStrength,int minimumExtraCurricularStrength){
        this.minimumGPA = minimumGPA;
        this.minimumACT = minimumACT;
        this.minimumSAT = minimumSAT;
        this.minimumEssayStrength = minimumEssayStrength;
        this.minimumExtraCurricularStrength = minimumExtraCurricularStrength;
    }
    public int getMinimumGPA(){
        return minimumGPA;
    }
    public int getMinimumACT(){
        return minimumACT;
    }
    public int getMinimumSAT(){
        return minimumSAT;
    }
    public int getMinimumEssayStrength(){
        return minimumEssayStrength;
    }
    public int getMinimumExtraCurricularStrength(){
        return minimumExtraCurricularStrength;
    }
}