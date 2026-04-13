package Task121;

public class DateTask {

    // 4. instance variables must be private
    private byte day;
    private byte month;
    private short year;

    // 5. No-args constructor calls this(1,1,1)
    public DateTask() {
        this(1, 1, 1);
    }

    // Constructor with arguments
    public DateTask(int m, int d, int y) {
        setDate(m, d, y);
    }

    // 6. toString() format: 12/12/2012
    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }

    public void setDate(int m, int d, int y) {
        if (valid(d, m, y)) {
            this.day = (byte) d;
            this.month = (byte) m;
            this.year = (short) y;
        } else {
            this.day = 0;
            this.month = 0;
            this.year = 0;
        }
    }

    public static void leapYears() {
        for (int i = 1980; i <= 2023; i += 4) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                System.out.println("The year " + i + " is a leap year");
            }
        }
    }

    // 7. getDay() returns day
    public int getDay() {
        return day;
    }

    // 8. setDay() sets day to 0 if condition is false
    public void setDay(int day) {
        if (valid(day, month, year)) {
            this.day = (byte) day;
        } else {
            this.day = 0;
        }
    }

    // 9. getMonth() returns month
    public int getMonth() {
        return month;
    }

    // 10. setMonth() sets month to 0 if condition is false
    public void setMonth(int month) {
        if (valid(day, month, year)) {
            this.month = (byte) month;
        } else {
            this.month = 0;
        }
    }

    // 11. getYear() returns year
    public int getYear() {
        return year;
    }

    // 12. setYear() sets year to 0 if condition is false
    public void setYear(int year) {
        if (valid(day, month, year)) {
            this.year = (short) year;
        } else {
            this.year = 0;
        }
    }

    private boolean valid(int day, int month, int year) {
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1) {
            System.out.println(
                "Attempting to create a non-valid date " +
                month + "/" + day + "/" + year
            );
            return false;
        }

        switch (month) {
            case 4: case 6: case 9: case 11:
                return day <= 30;
            case 2:
                return day <= 28 || (day == 29 && year % 4 == 0);
        }
        return true;
    }
}