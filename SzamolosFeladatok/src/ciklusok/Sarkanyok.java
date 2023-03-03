package ciklusok;

public class Sarkanyok {
    
    public static void main(String[] args) {
        
        for (int x = 1; x < 20; x++) {
            for (int y = 1; y < 13; y++) {
                if (7*x + 11*y == 145) {
                    System.out.println("7db fejű: " + x);
                    System.out.println("11db fejű: " + y);
                    System.out.println("------------");
                }
            }
        }
        
    }
    
}
