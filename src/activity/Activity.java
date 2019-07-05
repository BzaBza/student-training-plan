package activity;

import activity.knowledgeSource.KnowledgeSource;
import activity.schedule.Schedule;

import java.time.LocalDate;

public class Activity {
    private Schedule schedule;
    private KnowledgeSource knowledgeSource;

    public Activity(String knowledgeSource, LocalDate localDate, Student student){
         schedule.isActive(localDate);
         knowledgeSource.onTeach(knowledgeSource, student);
    }
}
