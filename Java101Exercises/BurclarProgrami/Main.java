import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month,day;
        String burc = "";
        boolean isError = false;


        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay : ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün : ");
        day = input.nextInt();


        switch (month){
            case 1:
                if (day >= 1 && day <= 31){
                    if (day <  22){
                        burc = "Oğlak";
                    }else {
                        burc = "Kova";
                    }
                } else {
                    System.out.println("Hatalı bir gün girdiniz!");
                }

                break;

            case 2:
                if (day >= 1 && day <= 28){
                    if (day <  20){
                        burc = "Kova";
                    }else {
                        burc = "Balık";
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if (day >= 1 && day <= 31 ){
                    if (day < 21){
                        burc = "Balık";
                    } else{
                        burc = "Kova";
                    }
                }
                break;
            default:
                isError = true;
        }

        if (isError){
            System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
        } else{
            System.out.println("Burcunuz " + burc);
        }
    }
}
