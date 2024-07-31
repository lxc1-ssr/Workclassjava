public class javawork7 {
    public static void main(String[] args) {

        int point = 80;
    
        if (point >=80 && point <= 100){
            System.out.println("YOU GOT A GRADE");
        }
        else if (point >=75 && point <= 80 ){
            System.out.println("YOU GOT B+ GRADE");
        }
        else if (point >=70 && point <=75 ){
            System.out.println("YOU GOT B GRADE");
        }
        else if (point >=65 && point <= 70 ){
            System.out.println("YOU GOT C+ GRADE");
        }
        else if (point >=60 && point <=65 ){
            System.out.println("YOU GOT C GRADE");
        }
        else if (point >=55 && point <=60 ){
            System.out.println("YOU GOT D+ GRADE");
        }
        else if (point >=50 && point <=55 ){
            System.out.println("YOU GOT D GRADE");
        }
        else if (point >=40 && point <=79 ){
            System.out.println("YOU GOT F GRADE");
        }
        else{
            System.out.println("YOU GOT E ");
        }
    }
}