package assignment;

enum Q3Size {

    SMALL(1.0),
    MEDIUM(1.5),
    LARGE(2.0);

    double multiplier;

    Q3Size(double multiplier) {
        this.multiplier = multiplier;
    }
}
