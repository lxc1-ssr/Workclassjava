public class javawork11 {
    public void main(String[] args) {
        int score = 85; // Example score
        String point;

        if (score > 79) {
            point = "A";
        } else if (score > 74) {
            point = "B+";
        } else if (score > 69) {
            point = "B";
        } else if (score > 64) {
            point = "C+";
        } else if (score > 59) {
            point = "C";
        } else if (score > 54) {
            point = "D";
        } else {
            point = "F";
        }

        System.out.println("Score: " + score + ", Grade: " + point);
    }
}
