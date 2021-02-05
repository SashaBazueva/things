public class FirstApplication {
    public static void main(String[] args){   //ENTER POINT
        //zadanie2
        byte a = 127;
        short b = 128;
        int c = 568;
        long d = 1234567890;
        float e = 15.7821f;
        double f = 3.1415;
        char g = 'G';
        boolean uslovie = true;
        String flower = "Ромашка";

        System.out.println(zadanie3(13.5f,6.77f, 1.16f, 2.0f));
        System.out.println(zadanie4(5,6));
        zadanie5(7);
        System.out.println(zadanie6(0));
        zadanie7("Sasha");
        zadanie8(0);
    }


    public static float zadanie3(float a, float b, float c, float d){
        float result;
        result =a*(b+(c/d));
        return result;
    }


    public static boolean zadanie4(int a, int b){
        int sum = a + b;
        return sum<=20&&sum>=10;
    }


    public static void zadanie5(int a){
        if (a>=0){
            System.out.println("Число а положительное");
        }
        else {
            System.out.println("Число а отрицательное");
        }
    }


    public static boolean zadanie6(int a){
        boolean condition = a>=0;
        if (condition){
            return condition;
        }
        else {
            return condition;
        }
    }


    public static void zadanie7(String name){
        System.out.println("Привет, " + name);
    }


    public static void zadanie8(int year){
        if (year<400){
            if ((year%4==0&&year%100!=0)||year==0){
                System.out.println(year + " - високосный год");
            }
            else {
                System.out.println(year + " - не високосный год");
            }
        }
        else{
            if(year%400==0){
                System.out.println(year + " - високосный год");
            }
            else if (year%4==0&&year%100!=0){
                System.out.println(year + " - високосный год");
            }
            else System.out.println(year + " - не високосный год");
        }

    }

}
