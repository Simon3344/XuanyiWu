import java.util.ArrayList;

public class Exam {
    private int duration;
    private int weigh;

    //public Exam(int duration) {
        //this.duration = duration;


    public Exam(int weigh) {
        this.weigh = weigh;
    }

    //public String Description()
        //return duration + weigh;

    public void main(String[] args) {


        ArrayList<Student> duration=new ArrayList<>();
        try{
            //duration.add(new Student(new int[]{30,50,180} ));
        }
        catch (Exception e){
            System.out.println("“Exam duration too long:\n\t"
                    +e.getMessage()
                    +"\nLet's not bother with this Exam duration for now.");

        }



    }

    //System.out.println("###################");
    //for (duration duration: durations){
        //System.out.println("Testing Watch: " + duration.getClass().getSimpleName());
       // duration.testduration();
        //.out.println("#######################")
}
