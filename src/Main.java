public class Main {
    public static void main(String[] args) {

        // Question: Bir sayının asal olup olmadığını bulmaya yarayan programı yazın?
        //% mod almaya yarar.

       /* int number=2;
       System.out.println(number); sayının number değişkenine atanıp atanmadığını kontrol ettim.
        boolean isPrime=true; // isPrime (Asal sayı) sayının asal sayı olduğu kabul edilir.

        for (int i=2;i<number;i++){

            if (number % i == 0){
                isPrime=false;
            }
        }

        if (isPrime=true){
            System.out.println("Sayı asal sayıdır.");
        }else {
            System.out.println("Sayı asal sayı değildir. ");
        }*/

// Bu hali ile programı kontrol ettiğimde 1 ve negatif sayılarda açık olduğunu gördüm.Bunları ortadan kaldırabilmek için programı
// Aşağıdaki gibi tekrar yazdım.

        int number =5;
        //System.out.println(number); sayının number değişkenine atanıp atanmadığını kontrol ettim.
        boolean isPrime = true; // isPrime (Asal sayı) sayının asal sayı olduğu kabul edilir.

        if (number==1) {

            System.out.println("Asal sayı değildir.");
            return; // programa burdan son vermek için yazdıom.Eğer bunu yazmazsak altta satırlar çalışır.
        }

        if (number<1) {

            System.out.println("Geçersiz sayı yazdınız.Lütfen 1 den büyük tam sayı yazınız.");
            return; // programa burdan son vermek için yazdıom.Eğer bunu yazmazsak altta satırlar çalışır.
        }

        for (int i=2;i<number;i++) {

            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("Sayı asal sayıdır.");
        } else {
            System.out.println("Sayı asal sayı değildir. ");
        }

    }
}
