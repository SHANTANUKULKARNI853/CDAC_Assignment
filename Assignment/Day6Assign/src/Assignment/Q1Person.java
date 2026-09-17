package Assignment;

class Q1Person {

    String name;
    int age;

    Q1Person() {
        name = "Unknown";
        age = 0;
    }

    Q1Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
}
