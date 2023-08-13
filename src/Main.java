import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hesap Makinesi");
        int n1,n2,select;

        Scanner inp =new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz : ");
        n1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        n2=inp.nextInt();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nBir işlem seçiniz :");
        select=inp.nextInt();

        switch (select){
                    case 1:
                        System.out.println("Toplama işleminiz :"+(n1+n2));
                        break;
                    case 2:
                        System.out.println("Çıkarma işleminiz : "+(n1-n2));
                        break;
                    case 3:
                        System.out.println("Çarpma işleminiz : "+(n1*n2));
                        break;
                    case 4 :
                        switch (n2) {
                            case 0 :
                                System.out.println("Bir sayı sıfıra bölünemez.");
                                break;
                            default:
                            System.out.println("Bölme işleminiz : " +(n1/n2));
                        }
                        break;
                    default:
                        System.out.println("Yanlış seçim yaptınız.Lütfen tekrar deneyin");
        }

    }
}