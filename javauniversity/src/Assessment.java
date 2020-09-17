import java.util.ArrayList;

/**
 * the assessment class which contain the weight
 */
public abstract class Assessment {

    protected int weight;
    private int grade;

    /**
     * get the weight of the assignment
     * @return return the weight of the assignment
     */
    public int getWeight(){return weight;}

    /**
     * the grade of students in assignment
     * @param grade the value of grade
     */
    public Assessment(int grade){
        this.grade=grade;

    }

    /**
     * set the weight of each assignment
     * @param weight the percentage of each assignment that contributes to the total mark
     */
    public void setwight(int weight){
        this.weight=weight;
    }

    /**
     * set the range of the weigh of assessment if it is reasonable
     * @param args the range of the weigh
     */
    public void main(String[] args) {


        ArrayList<Student> weigh=new ArrayList<>();
        try{
            //weigh.add(new Student(new int[]{20,100,200}));
        }
        catch (Exception e){
            System.out.println("“Exam weigh too high:\n\t"
                    +e.getMessage()
                    +"\nLet's not bother with this exam weigh for now.");

        }



    }




}
