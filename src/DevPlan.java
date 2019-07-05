import activity.Activity;

import java.time.LocalDate;
import java.util.ArrayList;

public class DevPlan {
    private LocalDate date;
    private Activity activity = new Activity();
    private ArrayList<Student> students;

    public DevPlan(ArrayList<Student> students, LocalDate date) {
        this.students = students;
        this.date = date;
        perform();
    }

    private void perform(){
            for (Student student : students) {
                activity.tryToApply(student, date);
            }
        }
    }
}
