package Assignment;

class Q5Exam {

    int examId;
    String name;
    String topic;
    String date;
    Q5Question[] questions;

    Q5Exam(int examId, String name, String topic, String date, Q5Question[] questions) {

        this.examId = examId;
        this.name = name;
        this.topic = topic;
        this.date = date;
        this.questions = questions;
    }

    int conductTest() {

        int score = 0;

        java.util.Scanner sc = new java.util.Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {

            questions[i].display();

            System.out.println("Enter your answer:");
            int answer = sc.nextInt();

            if (answer == questions[i].ans) {
                score = score + questions[i].marks;
            }

            System.out.println();
        }

        return score;
    }
}
