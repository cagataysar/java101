import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dersleri değişken olarak tanımlayalım
        int mat,fizik,turkce,kimya,muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        double ort = (mat + turkce + fizik + kimya + muzik) / 5;
        System.out.println("Ortalamanız : " +ort);
        if (ort >= 55){
            System.out.println("Geçtiniz");
        } else{
            System.out.println("Sınıfta kaldınız ");
        }
    }
}
