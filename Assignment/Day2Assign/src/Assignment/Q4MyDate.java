package Assignment;

class Q4MyDate {

    int day;
    int month;
    int year;

    Q4MyDate() {
        day = 1;
        month = 1;
        year = 2000;
    }

    Q4MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    void printDate() {
        System.out.println(day + "/" + month + "/" + year);
    }

    void validateDate() {

        boolean valid = true;

        if (year <= 0) {
            valid = false;
        }
        else {
            if (month < 1 || month > 12) {
                valid = false;
            }
            else {

                int maxDays;

                if (month == 2) {

                    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                        maxDays = 29;
                    }
                    else {
                        maxDays = 28;
                    }
                }
                else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    maxDays = 30;
                }
                else {
                    maxDays = 31;
                }

                if (day < 1 || day > maxDays) {
                    valid = false;
                }
            }
        }

        if (valid) {
            System.out.println("ValidDate");
        }
        else {
            System.out.println("InvalidDate");
        }
    }
}
