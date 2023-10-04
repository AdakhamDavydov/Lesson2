public class Main {
    public static void main(String[] args)
    {
        System.out.println(information(28, 40));
        System.out.println(information(28, 40));
        System.out.println(information(28, 40));
        System.out.println(information(28, 40));
        System.out.println(information(28, 40));

    }
    public static String information (int temperature, int MyAge){
        if (MyAge >=20 && temperature >=-20 && temperature >=30){
            return "Можно идти гулять";
        }
        else if (MyAge < 20 && temperature >= 0 && temperature <= 28){
            return "Можно идти гулять";
        }
         else if (MyAge >= 45 && temperature >= -10 && temperature <= 25){
            return "Можно идти гулять";
        }
         else {
            return "Оставайтесь дома";
        }

    }
    }