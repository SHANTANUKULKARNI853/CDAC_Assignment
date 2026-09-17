package assignment;

enum Q3Menu {

    COFFEE(50),
    TEA(30),
    MAGGI(60),
    PIZZA(150),
    SANDWICH(100);

    double price;

    Q3Menu(double price) {
        this.price = price;
    }
}
