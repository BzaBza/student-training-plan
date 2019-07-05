package activity;

import activity.knowledgeSource.KnowledgeSource;
import activity.schedule.Schedule;

import java.time.LocalDate;

public class Activity {
    private Schedule schedule;
    private KnowledgeSource knowledgeSource;

    public void tryToApply(Student student, LocalDate localDate ){
        schedule.isActive(localDate);
        knowledgeSource.educate(student);
    }
}
