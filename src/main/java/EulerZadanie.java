import java.sql.SQLOutput;

public class EulerZadanie {

    public static void main(String[] args) {
        EulerZadanie ex = new EulerZadanie();
        for (int i = 0; i < 100; i++) {

            System.out.println(i + " = " + ex.fiboEvenSum(i));
        }

    }

    int fiboEvenSum(int n) {

        int sum = 0;
        int a = 0;
        int b = 1;
        int c = a + b;
        while (c < n){
            if (c % 2 == 0){
                sum = sum + c;
            }
            a = b;
            b = c;
            c = a + b;
        }
        return sum;
    }



    }

