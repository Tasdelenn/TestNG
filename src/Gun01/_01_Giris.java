package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {

//    public static void main(String[] args) {
//        webSitesiniAc();
//        LoginTestIsleminiYap();
//        driverıKapat();
//    }

    // Eğer test metodlarına sıralama verilmezse alfabetik sırasına göre çalışır.
    @Test( priority = 1) // annotation lar (bilgi ekleme parantezin içine anotasyon...)
    void webSitesiniAc(){
        System.out.println("Driver tanımlandı ve web sitesi açıldı.");
    }

    @Test( priority = 2) // priority: Öncelik sırası  Bu sırayı vermezsen isim aritmetiğine göre çalışır. istediğimizi vermeyebilir...
    void loginTestIsleminiYap(){
        System.out.println("login test işlemleri yapıldı");
        // yeşil tik hatalı assertion yok demektir. Tabii şimdilik burda zaten assertion yok. çalışma amantığını anlamak için.
    }

    @Test( priority = 3) // Bu metodla ilgili kararları parantez içinde (annotation) belirtiyoruz.
    void driveriKapat(){
        System.out.println("driver kapatıldı ve çıkıldı.");
    }

    /** Tüm testlerin hepsine suit diyoruz. Biz main modelde ayrı ayrı
     * classları çalıştıramıyoduk, çağırıyoduk. Bu TestNG modelinde ise,
     * 2- üç tane class ı birden çalıştırabileceğiz. Hatta istediğimiz classların
     * istediğimiz metodlarını çalıştırabileceğiz, istediğimiz giriş çıkışları yapabileceğiz.
     */


}
