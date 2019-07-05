package activity.schedule;

import activity.Activity;

public class ScheduleNegation implements Schedule {

    @Override
    public boolean isActive(Activity activity) {
        return false;
    }
}
