import java.util.Scanner;

class StudentGradeCalculator {
    public static char calculateGrade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        }

        else if (percentage >= 80) {
            return 'B';
        }

        else if (percentage >= 70) {
            return 'C';
        }

        else if (percentage >= 60) {
            return 'D';
        }

        else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the nuber of subjects :- ");
        int numSubjects = scanner.nextInt();

        if (numSubjects <= 0) {
            System.out.println(" Invalid numbers of subjects. Exiting");
            scanner.close();
            return;
        }

        double[] marks = new double[numSubjects];
        double totalmarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter the marks obtained in subject " + (i + 1) + "(out of 100)");
            double inputmarks = scanner.nextDouble();

            if (inputmarks < 0 || inputmarks > 100) {
                System.out.println(" Invalid marks. plz enter the value between 1 to 100");
                i--;
                continue;
            }

            marks[i] = inputmarks;
            totalmarks += marks[i];
        }
        double averagePercentage = totalmarks / numSubjects;
        char grade = calculateGrade(averagePercentage);

        System.out.println("******** result ******* ");
        System.out.println("Total marks :- " + totalmarks);
        System.out.println("Average percentage :- " + averagePercentage);
        System.out.println("Grade :- " + grade);

        scanner.close();

    }

}
