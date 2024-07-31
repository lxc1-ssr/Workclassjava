public class javawork9 {
    public void main(String[] args) {
        int score = 85; // Example score
        String point;

        if (score >= 80) {
            point = "A";
        } else if (score >= 75) {
            point = "B+";
        } else if (score >= 70) {
            point = "B";
        } else if (score >= 65) {
            point = "C+";
        } else if (score >= 60) {
            point = "C";
        } else if (score >= 55) {
            point = "D";
        } else {
            point = "F";
        }

        System.out.println("Score: " + score + ", Grade: " + point);
    }
}
