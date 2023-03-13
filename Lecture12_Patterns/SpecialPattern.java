package Lecture12_Patterns;

public class SpecialPattern {
    public static void main(String[] args) {
        int n = 6;

        int hash = 0;

        for(int i=1; i<=n ;i++) {
            for (int j = 0; j < hash; j++) {
                System.out.print("#");
            }

            for (int j = 1; j <= (i - hash); j++) {
                System.out.print("o");
            }

            hash = i % 3 == 0 ? hash + 3 : hash;

            System.out.println();
        }
    }
}
