import java.util.Scanner;

public class artikyilhesaplama {

   public static void main(String[] args) {
      
    
        int yıl;

Scanner inp = new Scanner(System.in);

        System.out.print("Yıl giriniz :");

        yıl = inp.nextInt();

        if(yıl%4==0&&yıl%400==0){System.out.println(yıl+"  Artık bir yıldır");}

        
        else {System.out.println(yıl+"  Artık bir yıl değildir");}
        
        


        

        

        

}       
}
