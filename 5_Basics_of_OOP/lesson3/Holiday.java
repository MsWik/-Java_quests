package by.peleng.java.lesson5.lesson3;

import java.util.Calendar;

public class Holiday {
    private Calendar calendar;
    private String description;

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Holiday(Calendar calendar, String description) {
        this.calendar = calendar;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Holiday holiday = (Holiday) o;

        if (calendar != null ? !calendar.equals(holiday.calendar) : holiday.calendar != null) return false;
        return description != null ? description.equals(holiday.description) : holiday.description == null;
    }

    @Override
    public int hashCode() {
        int result = calendar != null ? calendar.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
