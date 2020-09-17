import java.util.ArrayList;
import java.util.Map;

/**
 * the unit class which contain the student information and the enrolledStudents and returnStudents
 */
public class Unit {



  private String no;
  private String name;
  private String newStudentId;
  private String newGivenName;
  private String newFamilyName;
  //private ArrayList<Student> studentsList = new ArrayList<>();
  private ArrayList<Student> enrolledStudents=new ArrayList<>();

  /**
   *set the form of the unit and allow to enrol students
   * @param no the  id of the units that students will enroll
   * @param name the name of students that will be enrolled in
   */
  public Unit(String no, String name) {
    this.no = no;
    this.name = name;
  }

  /**
   * description is in order to return the student id, student name in a good form
   * @return return student id and name in order
   */
  public String description() {
    return no + " " + name;
  }

  /**
   * in order to add the new students in the list of enrolledStudents
   * @param newStudent the new students that need to be enrolled
   */
  public void enrolStudent(Student newStudent){
    enrolledStudents.add(newStudent);

  }

  /**
   * the oldstudents that have been enrolled in
   * @param oldStudent the students that have already in the school
   */
  public void enrolledStudent(Student oldStudent){
    enrolledStudents.add(oldStudent);
  }

  /**
   * the list of all students that have been enrolled
   * @return
   */
  public ArrayList<Student> returnStudents(){
      return enrolledStudents;
  }


}
