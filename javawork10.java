public class javawork10 {
    public void main(String[] args) {
        int score = 85; // Example score
        String grade;

        if (score > 79) {
            grade = "A";
        } else if (score > 74) {
            grade = "B+";
        } else if (score > 69) {
            grade = "B";
        } else if (score > 64) {
            grade = "C+";
        } else if (score > 59) {
            grade = "C";
        } else if (score > 54) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Score: " + score + ", Grade: " + grade);
    }
}
