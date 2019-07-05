package activity.schedule;

import activity.Activity;

public class ScheduleWeekend implements Schedule {
    @Override
    public boolean isActive(Activity activity) {
        return false;
    }
}
