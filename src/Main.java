public class Main {
    public static void main(String[] args) {
        System.out.println("");
/*


Задача 1
Объявите переменные типа int, byte, short, long, float, double.
Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».
*/
       System.out.println("Задача № 1");
   ;
        int integerInt = 4;
        byte integerByte = 1;
        short integerShort = 2;
        long integerLong = 8L;
        float fractionalFloat = 4f;
        double fractionalDouble = 8.88888;
        System.out.println(integerInt) ;
        System.out.println(integerByte );
        System.out.println(integerShort);
        System.out.println(integerLong );
        System.out.println(fractionalFloat);
        System.out.println(fractionalDouble);
        System.out.println("");

        /*Задача 2
        Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.
        Значения:
            27.12
            987 678 965 549
            2,786
            569
            -159
            27897
            67
        */
        float a = 27.12f;
               int b =-159;
               int g =27897;
                        double c = 2.786;
                                byte d = 67;
                                        short e = 569;
                                                long  f = 987678965549L;
        System.out.println("");


        /*Задача 3
        Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
                Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется
                 листов каждому ученику.
        Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
        Для объявления переменных не используйте тип var.*/

        System.out.println("Задача № 3");
       ;
           int groupLydmila = 23;
           int groupAnna = 27;
           int groupEkaterina =30;
           int generalPaper = 480;
           int totalStudents = (groupLydmila+groupAnna+groupEkaterina);
           float personalSheets = generalPaper/totalStudents;

           System.out.println(" На каждого ученика рассчитано "+personalSheets+" листов бумаги" );
           System.out.println("");




         /*      Критерии оценки
        Корректно использовали типы переменных.
        В решении не использовали тип переменной var.
                Назвали переменные согласно правилам Java.
        Соблюдаются правила пунктуации.
                Решение задания вывели в консоль.
        */



        /*
        Задача 4
        Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
        за 20 минут,
                в сутки,
                за 3 дня,
                за 1 месяц?
                Рассчитывайте производительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
                Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
        Для объявления переменных не используйте тип var.
         */
        System.out.println("Задача № 4");
       // приводим значения к единой еденице измерения (минуте)
       int minutes = 1;
       int hour = 60 * minutes;
       int day = 24 * hour;
       int month = 30 * day ;
       int quantityContainer = 16;
       int quantityMinutes = 2;
       int performanceContainerMinutes = quantityContainer / quantityMinutes;
       //задаваемые  условием задачи  значения переменных
       int givenMinutes = 20;
       int givenDay = 1;
       int given3Day = 3;
       int givenMonth = 1 ;

       int performanceGivenMinutes = performanceContainerMinutes * (givenMinutes * minutes);
        String minutes20 = givenMinutes + " минут";
        System.out.println("За "+minutes20+" машина произвела "+performanceGivenMinutes+" штук бутылок.");


       int performanceGivenDay = performanceContainerMinutes *(givenDay*day);
       String day1 = givenDay+ " Сутки";
       System.out.println("За "+day1+" машина произвела "+ performanceGivenDay +" штук бутылок.");


       int performanceGiven3Day = performanceContainerMinutes * (given3Day*day);
        String day3 = given3Day +" дня";
       System.out.println("За "+day3+" машина произвела "+ performanceGiven3Day +" штук бутылок.");


       int performanceGivenMonth = performanceContainerMinutes * (givenMonth * month);
        String month1M = givenMonth +" месяц";
       System.out.println("За "+ month1M +" машина произвела "+ performanceGivenMonth +" штук бутылок.");
       System.out.println("");


       /*
       Задача 5
       На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        На один класс уходит 2 банки белой и 4 банки коричневой краски.
         Сколько банок каждой краски было куплено?
       Выведите результат задачи в консоль в формате:
       «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
       Для объявления переменных не используйте тип var.*/

        System.out.println("Задача № 5");
        int generalDye = 120;
        int dueWhite = 2;
        int dueBrown = 4;
        int klass1 = dueWhite+dueBrown;
        int generalKlass = generalDye/klass1;
        int generalDueWhite = dueWhite * generalKlass;
        int generalDueBrown = dueBrown * generalKlass;

        System.out.println("В школе, где "+generalKlass+" классов, нужно "+generalDueWhite+" банок белой краски " +
                "и "+generalDueBrown+" банок коричневой краски");
        System.out.println("");

        /*
       Задача 6
Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.

Вот один из рецептов, по которому спортсмен готовит себе завтрак:

 Бананы — 5 штук (1 банан — 80 грамм).
 Молоко — 200 мл (100 мл = 105 грамм).
 Мороженое-пломбир — 2 брикета по 100 грамм.
 Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
Смешать всё в блендере — и готово.

Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.

Результат в граммах и килограммах напечатайте в консоль.

Важ

         */
        System.out.println("Задача № 6");

        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream =2 * 100;
        int egg = 4 * 70;
        double totalWeight = (bananas + milk + iceCream + egg);
        double kilogram = (totalWeight /1000);
        System.out.println(" Результат в граммах "+ totalWeight);
        System.out.println(" Результат в килограммах " + kilogram);





    }
}