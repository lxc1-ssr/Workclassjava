import java.util.Scanner;

public class javawork3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("กรอกผลการเรียนนักศึกษา");
            double score = scanner.nextDouble();

            String grade = classifyGrade(score);
            System.out.println("เกรดของคุณคือ: " + grade);
        }
    }

    public static String classifyGrade(double score) {
        if (score >= 80 && score <= 100) {
            return "A";
        } else if (score >= 75 && score < 80) {
            return "B+";
        } else if (score >= 70 && score < 75) {
            return "B";
        } else if (score >= 65 && score < 70) {
            return "C+";
        } else if (score >= 60 && score < 65) {
            return "C";
        } else if (score >= 55 && score < 60) {
            return "D+";
        } else if (score >= 50 && score < 55) {
            return "D";
        } else if (score >= 40 && score < 50) {
            return "F";
        } else {
            return "E";
        }
    }
}
