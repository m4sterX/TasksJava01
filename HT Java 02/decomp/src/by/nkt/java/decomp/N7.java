package by.nkt.java.decomp;
//7. На плоскости заданы своими координатами n точек. Написать метод(методы),
//определяющие, между какими из пар точек самое большое расстояние. Указание.
//Координаты точек занести в массив.

public class N7 {

    public static int longestDistance(double[] a, double[] b, double[] c) {

        double distanceAB = Math.sqrt(Math.pow(a[0] - b[0],2)) + (Math.pow(a[1] - b[1],2));
        double distanceBC = Math.sqrt(Math.pow(b[0] - c[0],2)) + (Math.pow(b[1] - c[1],2));
        double distanceAC = Math.sqrt(Math.pow(a[0] - c[0],2)) + (Math.pow(a[1] - c[1],2));

        int max = (int) Math.max(distanceAB,Math.max(distanceBC,distanceAC));

        return max;
    }


    public static double[] randomN(){

        double[] mas = new double[2];
          mas[0] = Math.random() * 10;
          mas[1] = Math.random() * 10;

          return mas;
    }


    public static void main(String[] args) {

        double[] n1 = randomN();
        double[] n2 = randomN();
        double[] n3 = randomN();

        int max = longestDistance(n1,n2,n3);
        System.out.println( max);
    }
}
