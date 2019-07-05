package activity.knowledgeSource;

import activity.Activity;

public class Teacher implements KnowledgeSource {
    public int toPractice(){
        return 0;
    }

    @Override
    public int onTeach(String knowledgeSource, Student student) {
        return 0;
    }
}
