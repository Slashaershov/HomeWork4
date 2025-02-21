public class Main
{
    public static void main(String[] args)
    {
        //ex 1
        byte age =29;
        System.out.print("Если возраст человека равен " + age + ", то он");
        if (age >= 18)
        {
            System.out.println(" совершеннолетний.");
        }
        else
        {
            System.out.println(" не достиг совершеннолетия, нужно немного подождать");
        }

        //ex2
        byte t = 52;
        if (t<5)
        {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        else
        {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        //ex3
    }
}