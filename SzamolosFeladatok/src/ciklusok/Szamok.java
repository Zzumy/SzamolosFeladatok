package ciklusok;

import java.util.Scanner;

public class Szamok {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("Ismétléssel? (i/n): ");
        String v = sc.next();
        boolean ismetel = v.equals("i");
        
        int ismDb = 0;
        int ismNlkDb = 0;
        for (int k = 2; k <= 4; k++) {
            for (int j = 2; j <= 3; j++) {
                for (int i = 2; i <= 4; i++) {
                    if (ismetel) {
                        System.out.printf("%d%d%d\n", k, j, i);
                        ismDb++;
                    }else if (k != j && k != i && i != j) {
                        System.out.printf("%d%d%d\n", k, j, i);
                        ismNlkDb++;
                    }
                }
            }
        }
        
        if (ismetel) {
            System.out.println("ismétléssel: " + ismDb);
        }else{
            System.out.println("ismétlés nélkül" + ismNlkDb);
        }
        
    }
}
