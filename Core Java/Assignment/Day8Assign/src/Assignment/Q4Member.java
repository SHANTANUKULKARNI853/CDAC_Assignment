package Assignment;

class Q4Member {

    static int counter = 500;

    int id;
    String name;
    String mobile;
    String email;
    String membershipType;
    double amountPaid;

    Q4Member(String name, String mobile, String email,
           String membershipType, double amountPaid) {

        id = ++counter;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.membershipType = membershipType;
        this.amountPaid = amountPaid;
    }

    void display() {

        System.out.println("Member ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Mobile = " + mobile);
        System.out.println("Email = " + email);
        System.out.println("Membership Type = " + membershipType);
        System.out.println("Amount Paid = " + amountPaid);
    }
}
