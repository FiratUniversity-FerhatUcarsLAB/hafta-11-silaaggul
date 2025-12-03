public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
         // Cevap: Return edilen değer kullanılmadı, derleyici hata vermez.
        // Program normal çalışır, sadece return edilen değer kaybolur.


        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // Derleyici hata verir: "bad operand types for binary operator '+'"
        // Çünkü void bir değer değildir ve toplama işlemi yapılamaz

        // Cevaplarinizi yorum olarak ekleyin.
    }
}
