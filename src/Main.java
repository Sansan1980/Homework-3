public class Main {
    public static void main(String[] args) {
/*


Задача 1
Объявите переменные типа int, byte, short, long, float, double.
Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».
*/

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



    }
}