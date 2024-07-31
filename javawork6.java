public class javawork6 {
    public static void main(String[] args) {

        int score = 80;
    
        if (score >=80 && score <= 100){
            System.out.println("YOU GOT A GRADE");
        }
        else if (score >=75 && score <= 80 ){
            System.out.println("YOU GOT B+ GRADE");
        }
        else if (score >=70 && score <=75 ){
            System.out.println("YOU GOT B GRADE");
        }
        else if (score >=65 && score <= 70 ){
            System.out.println("YOU GOT C+ GRADE");
        }
        else if (score >=60 && score <=65 ){
            System.out.println("YOU GOT C GRADE");
        }
        else if (score >=55 && score <=60 ){
            System.out.println("YOU GOT D+ GRADE");
        }
        else if (score >=50 && score <=55 ){
            System.out.println("YOU GOT D GRADE");
        }
        else if (score >=40 && score <=79 ){
            System.out.println("YOU GOT F GRADE");
        }
        else{
            System.out.println("YOU GOT E ");
        }
    }
}
