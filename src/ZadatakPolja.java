import java.util.Scanner;

public class ZadatakPolja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] godine = new int[7];
        System.out.println("Unesite 7 godina");
        for(int i=0; i<=6; i++){
            godine[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("Unesene godine: ");
        for(int j=0; j<godine.length; j++){
            System.out.print(" " +godine[j]);
        }
        System.out.println();
        System.out.println();
        for(int z=0; z<godine.length; z++){
            if(godine[z]%4==0 && godine[z]%100!=0){
                System.out.println("Broj " + godine[z] + " je prijestupna godina!" + "\n");
            }
            else if(godine[z]%400==0){
                System.out.println("Broj " + godine[z] + " je prijestupna godina!" + "\n");
            }
        }
    }
}