/**
 * the Mark class contains the assessment and control the range of it
 */
public class Mark {
    private final Assessment assessment;
    private int mark;
    private  String comment;

    /**
     * restrict the range of the mark which must between 0 and 100 which will contribute to the total mark of students base on the assessment weight
     * @param assessment to give students mark base on the weight
     * @param mark the number of the students mark in the assessment
     */
    public Mark(Assessment assessment,int mark){
        assert assessment !=null:"Assessment can not be null";
        assert mark>=0:"Mark can not be less than 0";
        assert mark<=100:"Mark can not be larger than 100";
        this.assessment=assessment;
        this.mark=mark;
        this.comment="";
    }
    public Mark(Assessment assessment,int mark,String comment){
        assert mark>=0:"Mark can not be less than 0";
        assert mark<=100:"Mark can not be larger than100";
        this.assessment=assessment;
        this.mark=mark;
        this.comment="";
    }
    public double getTotalMark(){return this.assessment.getWeight()*mark/100;}
}
