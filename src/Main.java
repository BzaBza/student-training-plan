
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(false, "Grisha"));
        students.add(new Student(false, "Vasiliy"));
        students.add(new Student(false, "Oksana"));

        DevPlan consciousStudentnew = new DevPlan(students, LocalDate.now());
    }
}
