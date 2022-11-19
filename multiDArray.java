public class multiDArray {
    public static void main(String[] args) {
        int [][] a;
        a = new int[][]{{1, 2, 3},{4,5,6}};
        int b = a.length;
        int c = a[1].length;
        System.out.println(b);
        System.out.println(c);

        for (int i=0; i<a.length;i++) {
            for (int j=0; j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
            System.out.println();
        }
        System.out.println(a[0][0]);
        a[0][0]=0;
        System.out.println(a[0][0]);
    }
}
