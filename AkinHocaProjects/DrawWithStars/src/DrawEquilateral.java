public class DrawEquilateral {

    public static void main(String[] args) {
        DrawEquilateral e = new DrawEquilateral();
        e.equilateralTriangle(7,11);
    }

    public void equilateralTriangle(int row, int column) {
        /*
            *    4 boşluk var height = 4    1 yıldız
           ***   2 boşluk var               3 yılddız
          *****  1 boşluk var               5 yıldız
         *******  0 boşluk                          7 yıldız
        */
        for(int i=1;i<row;i++) {

            for(int k=0;k<column-1/2;k++) {
                System.out.print(" ");
            }

            for(int j=0;j<2*i-1;j++) {
                System.out.print("*");
            }
            column--;
            System.out.println();

        }
    }
}
