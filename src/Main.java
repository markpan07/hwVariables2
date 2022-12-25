public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
        System.out.println();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte a = (byte) 127;
        short b = 30700;
        int c = 500700;
        long d = 111222333444L;
        float e = 1.5f;
        double f = 1.35;

        System.out.println("Значение переменной с типом byte = " + a);
        System.out.println("Значение переменной с типом short = " + b);
        System.out.println("Значение переменной с типом int = " + c);
        System.out.println("Значение переменной с типом long = " + d);
        System.out.println("Значение переменной с типом float = " + e);
        System.out.println("Значение переменной с типом double = " + f);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float e = 27.12f;
        long d = 987678965549L;
        float q = 2.76f;
        short s = 569;
        int a = -159;
        int b = 27897;
        byte c = (byte) 67;



        System.out.println(e);
        System.out.println(d);
        System.out.println(q);
        System.out.println(s);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int studentsLP = 23;
        int studentsAS = 27;
        int studentsEA = 30;
        int generalPaperQuantity = 480;
        int studentsQuantity = studentsAS + studentsEA + studentsLP;
        int paperPerStudent = generalPaperQuantity / studentsQuantity;

        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги.");

    }

    public static void task4 () {
        System.out.println("Задача 4");

        byte productiveCapacityPerMinute = (byte) 8;
        int minutesInDay = 60 * 24;
        int minutesIn3Days = minutesInDay * 3;
        int minutesInMonth = minutesInDay * 30;

        System.out.println("За 20 минут машина произвела " + productiveCapacityPerMinute * 20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + productiveCapacityPerMinute * minutesInDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productiveCapacityPerMinute * minutesIn3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + productiveCapacityPerMinute * minutesInMonth + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        byte whitePaintForClass = (byte) 2;
        byte brownPaintForClass = (byte) 4;
        byte tinOfPaintForClass= (byte) 6;
        byte amountOfClasses = 120 / 6;

        int whitePaintForSchool = whitePaintForClass * amountOfClasses;
        int brownPaintForSchool = brownPaintForClass * amountOfClasses;

        System.out.println("В школе, где " + amountOfClasses + " классов, нужно " + whitePaintForSchool + " банок белой краски, и " + brownPaintForSchool + " банок коричневой краски.");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        byte bananaWeight = 80;
        float milkWeight1ml = 1.05f;
        byte icecreamWeight = 100;
        byte eggWeight = 70;

        //recipe
        byte bananas = 5;
        int milkMl = 200;
        byte icecream = 2;
        byte eggs = 4;

        float finalWeight = bananas * bananaWeight + milkMl * milkWeight1ml + icecream * icecreamWeight + eggs * eggWeight;
        System.out.println("Вес завтрака составляет " + finalWeight + " грамм (" + finalWeight / 1000 + " кг).");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        byte goalLoosingWeight = 7;
        float ration1LoosingWeight = 0.25f;
        float ration2LoosingWeight = 0.5f;
        float daysDemand1Ration = goalLoosingWeight / ration1LoosingWeight;
        float daysDemand2Ration = goalLoosingWeight / ration2LoosingWeight;
        System.out.println("В среднем понадобится " + (daysDemand1Ration + daysDemand2Ration) / 2 + " дней для похудения.");

    }

    public static void task8 () {
        System.out.println("Задача 8");
        int mashaSalaryMonth = 67760;
        int denisSalaryMonth = 83690;
        int kristinaSalaryMonth = 76230;

        int mashaSalaryYear = mashaSalaryMonth * 12;
        int denisSalaryYear = denisSalaryMonth * 12;
        int kristinaSalaryYear = kristinaSalaryMonth * 12;

        int mashaNewSalaryMonth = mashaSalaryMonth + (mashaSalaryMonth / 10);
        int denisNewSalaryMonth = denisSalaryMonth + (denisSalaryMonth / 10);
        int kristinaNewSalaryMonth = kristinaSalaryMonth + (kristinaSalaryMonth / 10);

        int mashaNewSalaryYear = mashaNewSalaryMonth * 12;
        int denisNewSalaryYear = denisNewSalaryMonth * 12;
        int kristinaNewSalaryYear = kristinaNewSalaryMonth * 12;
        System.out.println("Маша теперь получает " + mashaNewSalaryMonth + " рублей. Годовой доход вырос на " + (mashaNewSalaryYear - mashaSalaryYear) + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalaryMonth + " рублей. Годовой доход вырос на " + (denisNewSalaryYear - denisSalaryYear) + " рублей");
        System.out.println("Маша теперь получает " + kristinaNewSalaryMonth + " рублей. Годовой доход вырос на " + (kristinaNewSalaryYear - kristinaSalaryYear) + " рублей");
    }
}