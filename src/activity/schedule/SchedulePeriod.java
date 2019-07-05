package activity.schedule;

import activity.Activity;

public class SchedulePeriod implements Schedule {
    @Override
    public boolean isActive(Activity activity) {
        return false;
    }
}
