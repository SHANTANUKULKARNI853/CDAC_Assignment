/*Write a program to create class Exam, for each exam store examid, name ,topic, date 
of exam and array of questions. 
For each question store qno, question, opt1,opt2,opt3,opt4,ans,marks 
Create 2 exam objects One for java test and one for Html test by storing 5 questions 
in each exam 
Ask user which exam user want to appear 
1. Java 
2. HTML 
Conduct the test, and display the marks, if marks are >=3 the display 
congratulations you completed the test. 
Otherwise display message, better luck next time. 
Then ask user do you want to continue. Do accordingly */


package Assignment;

import java.util.Scanner;

class Q5TestExam {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Q5Question[] javaQuestions = new Q5Question[5];

        javaQuestions[0] = new Q5Question(
                1, "Which keyword is used to inherit a class?",
                "extends", "implements", "inherit", "super", 1, 1);

        javaQuestions[1] = new Q5Question(
                2, "Which method is the starting point of Java program?",
                "start()", "main()", "run()", "execute()", 2, 1);

        javaQuestions[2] = new Q5Question(
                3, "Which concept allows multiple forms?",
                "Inheritance", "Encapsulation", "Polymorphism", "Abstraction", 3, 1);

        javaQuestions[3] = new Q5Question(
                4, "Which keyword creates an object?",
                "class", "new", "object", "create", 2, 1);

        javaQuestions[4] = new Q5Question(
                5, "Which data type stores whole numbers?",
                "double", "float", "int", "char", 3, 1);

        Q5Question[] htmlQuestions = new Q5Question[5];

        htmlQuestions[0] = new Q5Question(
                1, "What does HTML stand for?",
                "Hyper Text Markup Language",
                "High Text Machine Language",
                "Hyperlink Text Markup Language",
                "Home Tool Markup Language", 1, 1);

        htmlQuestions[1] = new Q5Question(
                2, "Which tag is used for heading?",
                "<p>", "<h1>", "<head>", "<title>", 2, 1);

        htmlQuestions[2] = new Q5Question(
                3, "Which tag is used to create a link?",
                "<link>", "<a>", "<href>", "<url>", 2, 1);

        htmlQuestions[3] = new Q5Question(
                4, "Which tag is used for an image?",
                "<img>", "<image>", "<pic>", "<src>", 1, 1);

        htmlQuestions[4] = new Q5Question(
                5, "Which tag is used for a paragraph?",
                "<para>", "<text>", "<p>", "<paragraph>", 3, 1);

        Q5Exam javaExam = new Q5Exam(
                101, "Java Test", "Java", "03-09-2026", javaQuestions);

        Q5Exam htmlExam = new Q5Exam(
                102, "HTML Test", "HTML", "03-09-2026", htmlQuestions);

        while (true) {

            System.out.println("1. Java");
            System.out.println("2. HTML");
            System.out.println("Enter your choice:");

            int choice = sc.nextInt();

            int marks = 0;

            if (choice == 1) {

                System.out.println("Java Test");
                marks = javaExam.conductTest();

            } else if (choice == 2) {

                System.out.println("HTML Test");
                marks = htmlExam.conductTest();

            } else {

                System.out.println("Invalid choice");
                continue;
            }

            System.out.println("Your Marks = " + marks);

            if (marks >= 3) {
                System.out.println("Congratulations! You completed the test.");
            } else {
                System.out.println("Better luck next time.");
            }

            System.out.println("Do you want to continue? (y/n)");

            char ch = sc.next().charAt(0);

            if (ch == 'n' || ch == 'N') {
                break;
            }
        }

        sc.close();
    }
}
