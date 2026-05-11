import java.util.Scanner;

public class ZadatakPolja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] godine = new int[7];
        System.out.println("Unesite 7 godina");
        for (int i=0; i<godine.length; i++){
            godine[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("Unesene godine: ");
        for (int j : godine){
            System.out.println(j);
        }
        System.out.println();
        System.out.println();
        for (int z : godine){
            if(z%4==0 && z%100!=0 || z%400==0){
                System.out.println("Broj " + z + " je prijestupna godina!" + "\n");
            }
        }
        }
    }