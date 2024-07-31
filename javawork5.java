public class javawork5 {
    public static void main(String[] args) {

        int grade = 80;
    
        if (grade >=80 && grade <= 100){
            System.out.println("YOU GOT A GRADE");
        }
        else if (grade >=75 && grade <= 80 ){
            System.out.println("YOU GOT B+ GRADE");
        }
        else if (grade >=70 && grade <=75 ){
            System.out.println("YOU GOT B GRADE");
        }
        else if (grade >=65 && grade <= 70 ){
            System.out.println("YOU GOT C+ GRADE");
        }
        else if (grade >=60 && grade <=65 ){
            System.out.println("YOU GOT C GRADE");
        }
        else if (grade >=55 && grade <=60 ){
            System.out.println("YOU GOT D+ GRADE");
        }
        else if (grade >=50 && grade <=55 ){
            System.out.println("YOU GOT D GRADE");
        }
        else if (grade >=40 && grade <=79 ){
            System.out.println("YOU GOT F GRADE");
        }
        else{
            System.out.println("YOU GOT E ");
        }
    }
}
