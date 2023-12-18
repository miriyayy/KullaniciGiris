import java.util.Scanner;

public class KullanıcıGiris {

    public static void main(String[] args) {
        String userName,password;
        int girisHakki= 5;
        Scanner input= new Scanner(System.in);

        while( girisHakki>0){
        System.out.println("Kullanıcı Adınız:");
        userName= input.nextLine();

        System.out.println("Şifreniz");
        password= input.nextLine();

        if (userName.equals("miray") && password.equals("147369")) {
            System.out.println("Giriş Yaptınız.");
            break;
        } else {
            girisHakki --;
            if(girisHakki >0) {
                System.out.println("Hatalı giriş yaptınız! Kalan giriş hakkınız:"+ girisHakki);
                System.out.println("Şifre sıfırlamak ister misiniz? (Evet/Hayır)");
                String sifreSıfırlaSecimi= input.nextLine();
                if(sifreSıfırlaSecimi.equalsIgnoreCase("Evet")){
                    System.out.println("Yeni Şİfrenizi Oluşturun.");
                    String yeniSifre= input.nextLine();
                    // yeni sifre olusturma
                    System.out.println("Yeni şifre oluşturuldu. Lütfen yeni şifreniz ile giriş yapınız.");
                    break;
                }
            } else {
                System.out.println("Giriş Hakkınız Bitti. Sisteme girişiniz engellendi.");
            }
        }

        }
    }
}