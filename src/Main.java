import java.util.Scanner;
        public class Main {
            public static void main(String[] args)
            {
                Scanner in = new Scanner(System.in);
                int rur;
                double course;
                for(int i = 0; i < 2; i++) {
                    System.out.println( "Введите сумму в рублях");
                    rur = in.nextInt();
                    System.out.println( "Введите курс");
                    course = in.nextDouble();
                    System.out.println( toEURO(rur,course));
                }
            }

            static double toEURO (int rur, double course){
                return rur / course;
            }


        }
