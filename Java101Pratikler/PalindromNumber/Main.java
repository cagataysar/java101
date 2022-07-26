public class Main {

    static boolean isPalidrom(int number){
        int temp = number, reverseNum=0, lastNum;
        while (temp != 0) {
            lastNum = temp % 10;
            reverseNum =(reverseNum * 10 ) + lastNum;
            System.out.println("Yeni Sayı -> " + reverseNum);
            temp /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        isPalidrom(2476);
    }
}
