public class Main {

    public static void main(String[] args) {

        //1

        byte a = 10;
        short b = 800;
        int c = 15000;
        long d = 10000000L;
        float e = 1.150046f;
        double f = 1.26584648465;
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
        System.out.println();

        //2

        float weightFirstBoxer = 78.2f;
        float weightSecondBoxer = 82.7f;
        System.out.println("Общий вес двух боксеров " + (weightSecondBoxer + weightFirstBoxer) + " кг");
        System.out.println("Разница между весами боксеров составляет " + (weightSecondBoxer - weightFirstBoxer) + " кг");
        System.out.println();

        //3

        int bananas = 5 * 80;
        int milk = 200 / 100 * 105;
        int icecream = 2 * 100;
        int eggs = 4 * 70;
        System.out.println("Вес спорт-завтрака " + (bananas + milk + icecream + eggs) + " граммов");
        float grammes = bananas + milk + icecream + eggs;
        float kilo = grammes / 1000;
        System.out.println("Вес спорт-завтрака " + kilo + " кг");
        System.out.println();

        //4

        int weight = 7 * 1000;
        int minimum = weight / 500;
        int maximum = weight / 250;
        double medium = (double) weight / ((250 + 500) / 2);
        int result = (int) Math.ceil(medium);
        System.out.println("При похудении на 250 граммов в день понадобится " + maximum + " дней");
        System.out.println("При похудении на 500 граммов в день понадобится " + minimum + " дней");
        System.out.println("В среднем понадобится дней " + result);
        System.out.println();

        //5

        int masha = 67760;
        int denis = 83690;
        int christina = 76230;
        int masha1 = masha + masha / 10;
        int denis1 = denis + denis / 10;
        int christina1 = christina + christina / 10;
        System.out.println("Маша теперь получает " + masha1 + " рублей. Годовой доход вырос на " + (masha1 - masha) + " рублей.");
        System.out.println("Денис теперь получает " + denis1 + " рублей. Годовой доход вырос на " + (denis1 - denis) + " рублей.");
        System.out.println("Кристина теперь получает " + christina1 + " рублей. Годовой доход вырос на " + (christina1 - christina) + " рублей.");
        System.out.println();

    }
}