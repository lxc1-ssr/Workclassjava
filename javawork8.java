public class javawork8 {

    public void main(String[] args) {
        int score = 85; // Example score
        String grade;

        if (score >= 80) {
            grade = "A";
        } else if (score >= 75) {
            grade = "B+";
        } else if (score >= 70) {
            grade = "B";
        } else if (score >= 65) {
            grade = "C+";
        } else if (score >= 60) {
            grade = "C";
        } else if (score >= 55) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Score: " + score + ", Grade: " + grade);
    }
}
