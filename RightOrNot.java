import java.util.Scanner;
public class RightOrNot {
    static Scanner k = new Scanner(System.in);
    public static void main(String[] args){
        //A program to find whether the special right triangle is acute or not
        int a = 0;
        int b = 0;
        double c = 0.0;
        boolean goAgain = false;
        System.out.println("This program was based on a thing from my geometry class.");
                System.out.println("Where we have to find out if a triangle is obtuse, acute or right based on its side lengths and the pythagorean theorem.");
        do{
            System.out.println("If you give me any negative numbers the program will make you type them in again.");
            System.out.print("Or if you give 'c' as a smaller number than 'a' or 'b' then it will also make you type them in again.\n");
            do{
                System.out.print("Give me 'a'\n>");
                a = k.nextInt();

                System.out.print("Give me 'b'\n>");
                b = k.nextInt();

                System.out.print("Give me 'c'\n>");
                c = k.nextDouble();
                if(a<0 || b<0 || c<0){
                    System.out.println("No negative numbers yet, sorry. ¯\\_(ツ)_/¯");
                }else if(c<a||c<b){
                    System.out.println("That  is a no no.\nPlease try again with c being the largest number.");
                }else{
                    //System.out.println("An error has occured.");
                }
                }while((a<0 || b<0 || c<0) || (c<a || c<b));
                //c = a*a+b*b;
                double remain = 0.0;
                c=c*c;
                remain = (c)%1;
                System.out.println("Remainder is: " + remain);
                if(remain!=0 || remain<0.9 && remain>0.00008){
                    remain+=0.0001;
                    remain = (int) remain;
                    remain = (double) remain;
                    remain=remain/1000;
                    c+=remain;
                    c = (int) c;
                  //d+=0.999999999999993
                    //999999999999993
                }
                if(a*a+b*b>c){
                    
                    System.out.println((a*a+b*b) + ">" + (c));
                    System.out.println("The triangle is acute.");
                }else if(a*a+b*b<c){
                    //System.out.println(a*a+b*b==c*c);
                    System.out.println((a*a+b*b) + "<" + (c));
                    System.out.println("The triangle is obtuse.");
                }else if(a*a+b*b==c){
                    //System.out.println(a*a+b*b==c*c);
                    System.out.println((a*a+b*b) + "=" + (c));
                    System.out.println("The triangle is a right triangle.");
                }else{
                    System.out.println("I don't know WHAT you typed in, but something got real messed up...");
                }
                System.out.print("Would you like to go again?('t' for yes or 'f' for no\n>");
                String input = k.next();
                char choice = input.charAt(0);
                if(choice == 't'){
                    goAgain=true;
                }else if(choice == 'f'){
                    goAgain=false;
                }else{
                    System.out.println("Sorry that is not an option so you will just have to go again anyways.");
                    goAgain=true;
                }
                
        }while(goAgain);
    }
}
