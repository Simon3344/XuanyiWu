import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class University {

    private List<Unit> units = new ArrayList<>();
    private Map<String,Student> students = new HashMap<>();
    private int unitCount = 3;

    public void printStatus() {
        System.out.println("Welcome to Java University");
//        Unit unit=new Unit("FIT1234","Advanced Bogosorts");
//        System.out.println(unit.getUnitDescription());
        createUnits();
        displayUnits();
        System.out.println("Thank you for using Java University");
    }
    public void admitStudent(Student student ){
        //students.put(student.get,student);
    }
    

    private void createUnits() {
        for (int i = 1; i <= unitCount; i++) {
            Unit unit = new Unit("FIT" + (1000 + i), "Advanced Bogosorts" + i);
            units.add(unit);
            for(int j=0000;j<2;j++){
                Student student= new Student(j,readString("please enter the first name"),readString("please enter the family name"));
                unit.enrolStudent(student);
            }
        }
    }

    private void displayUnits() {
        for (int i = 0; i < units.size(); i++) {
            System.out.println(units.get(i).description());
            var temp=units.get(i).returnStudents();
            for(int j=0;j<temp.size();j++){
                System.out.println(temp.get(j).studentDescription());
            }
        }
    }

    private String readString(String prompt) {
        System.out.print(prompt);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)
        );
        String s = null;
        try {
            s = in.readLine();
            } catch (IOException e) {
            e.printStackTrace();
            }
        return s;
        }
}
