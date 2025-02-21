public class Main
{
    public static void main(String[] args)
    {
        //ex 1
        byte age = 29;
        System.out.print("Если возраст человека равен " + age + ", то он");
        if (age >= 18)
        {
            System.out.println(" совершеннолетний.");
        } else
        {
            System.out.println(" не достиг совершеннолетия, нужно немного подождать");
        }

        //ex2
        byte t = 52;
        if (t < 5)
        {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else
        {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        //ex3
        int speed = 52;
        System.out.print("Если скорость " + speed + ", то ");
        if (speed > 60)
        {
            System.out.println("придется заплатить штраф");
        } else
        {
            System.out.println("можно ездить спокойно");
        }

        //ex4
        age = 52;
        System.out.print("Если возраст человека равен " + age + ", то ему нужно ходить ");

        if (2 <= age && age <= 6)
        {
            System.out.println("в детский сад");
        } else if (7 <= age && age <= 17)
        {
            System.out.println("в школу");
        } else if (18 <= age && age <= 24)
        {
            System.out.println("в университет");
        } else if (age > 25)
        {
            System.out.println("на работу");
        }
    }
}