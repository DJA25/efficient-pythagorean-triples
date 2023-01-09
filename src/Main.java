import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        The idea of this code is to generate as many pythagorean triples as fast as possible.
//        It uses the fact that a pythagorean triple has m^2-n^2, 2mn, and m^2+n^2 for any m and n.
//        m and n shouldn't equal each other, and m>n.
//        ArrayList<int[]> triples = new ArrayList<>();
        int x = 1000000;
        for(long n = 1; n<x; n++) {
            for(long m = n+1; m<x; m++) {
//                if((m*m-n*n)*(m*m-n*n)+(4*m*n*m*n)==(m*m+n*n)*(m*m+n*n)) {
//                    triples.add(new int[]{m-n, 2*m*n, m+n});
                    System.out.println((m*m-n*n) + ", " + (2*m*n) + ", " + (m*m+n*n));
//                }
            }
        }

    }
}