package laba1;

public class Primes {
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){  //создаем цикл от 2до 100
            if(isPrime(i)){            //вызываем метод isPrime с параметром i
                System.out.println(i);    //вывод
            }
        }

    }


    public static boolean isPrime(int n) {
        int m=0;
        for(int inter=1;inter<=n;inter++){
            if (n%inter==0) m+=1;       // если n делится с отстатком на inter прибавлям к m 1

        }
       if(m<=2)return true;
       else return false;
    }
}
