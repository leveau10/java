package Discipline;

public class Discipline {
    private String discName;
    private int testOne, testTwo, finalTest;

    public Discipline(){
        this.testOne = 0;
        this.testTwo = 0;
        this.finalTest = 0;
    }
    
    private int getMedia(){
        int media = (testOne *2 + testTwo * 3) / 5;
        return media;
    }

    private int getFinalMedia(){
        int finalMedia = (this.getMedia() + this.finalTest) / 2 ;
        return finalMedia;
    }

    public void setDiscName(String name){
        this.discName = name;
    }

    public void setTestOne(int value){
        this.testOne = value;
    }

    public void setTestTwo(int value){
        this.testTwo = value;
    }
    
    public void setFinalTest(int value){
        this.finalTest = value;
    }
    
    public String getDiscName(){
        return this.discName;
    }

    public boolean approved(){
        if(this.getMedia() >= 60){
            return true;
        }else{
            return false;
        }
    }

    public boolean finalApproved(){
        if (this.getFinalMedia() >= 60) {
            return true;
        }else{
            return false;
        }
    }
    
}
