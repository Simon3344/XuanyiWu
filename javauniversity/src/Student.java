import java.util.ArrayList;

public class Student {
    private int newStudentId;
    private String newGivenName;
    private String newFamilyName;



    public Student(int newStudentId){
        this.newStudentId=newStudentId;

    }
    public Student(int newStudentId, String newGivenName, String newFamilyName){
        this.newStudentId=newStudentId;
        this.newFamilyName=newFamilyName;
        this.newGivenName=newGivenName;
    }
    //public String getStudentID(){
        //this.newStudentId;
    //}
    public void setGivenName(String newGivenName){

    }
    public void setFamilyName(String newFamilyName){

    }
    public String studentDescription(){
        return newStudentId+newGivenName+newFamilyName;
    }

}
