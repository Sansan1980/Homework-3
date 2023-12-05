public class Main {
    public static void main(String[] args) {
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
        String minutes20 = givenMinutes + "минут";
        System.out.println("За "+givenMinutes+" машина произвела "+performanceGivenMinutes+" штук бутылок.");


       int performanceGivenDay = performanceContainerMinutes *(givenDay*day);
       String day1 = givenDay+ " Сутки";
       System.out.println("За "+day1+" машина произвела "+ performanceGivenDay +" штук бутылок.");


       String day3 = given3Day +" дня";
       int performanceGiven3Day = performanceContainerMinutes * (given3Day*day);
       System.out.println("За "+day3+" машина произвела "+ performanceGiven3Day +" штук бутылок.");


       String month1M = givenMonth +" месяц";
       int performanceGivenMonth = performanceContainerMinutes * (givenMonth * month);
       System.out.println("За "+ month1M +" машина произвела "+ performanceGivenMonth +" штук бутылок.");



    }
}