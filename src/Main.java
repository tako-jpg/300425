public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age1 = 18;
        if (age1 >= 18) {
            System.out.println("Если твой возраст равен или больше " + age1 + ", то ты совершеннолетний.");
        } else {
            System.out.println("Эээ ты куда, как танк... в паспорт глянь салага ¯\\_(ツ)_/¯.");
        }
        System.out.println("Задание 2");
        int t = 5;
        if (t >= 5) {
            System.out.println("О! + " + t + " сегодня можно без шапки, на улице тепло!");
        } else {
            System.out.println("Можно без шапки, только уши оставь дома");
        }
        System.out.println("Задание 3");
        int speed = 65;
        if (speed >= 61 && speed <= 80) {
            System.out.println("Если Ваша скорость больше 60, но меньше 80 , и равна " + speed + " км/ч., то Вам скорее всего не выпишут штраф.");
        } else {
            System.out.println("Если у Вас другая скорость, узнайте о штрафах на сайте ГИБДД");
        }
        if (speed >= 81 && speed <= 100) {
            System.out.println("Если Ваша скорость больше 80, но меньше 100, и равна " + speed + " км/ч., то Вам выпишут штраф 500 руб.");
        } else {
            System.out.println("Если у Вас другая скорость, узнайте о штрафах на сайте ГИБДД");
        }
        System.out.println("Задача 4");
        int age = 75;
        if (age > 0 && age < 2) {
            System.out.println("Вы слишком маленький - лучше остаться дома.");
        }
        if (age > 2 && age <= 6) {
            System.out.println("Если возраст человека равен - " +age+ " то ему нужно ходить в детский сад.");
        }
        if (age > 7 && age <= 17) {
            System.out.println("Если возраст человека равен - " +age+ " то ему нужно ходить в школу.");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен - " +age+ " то ему нужно ходить в университет.");
        }
        if (age > 24 && age <= 99) {
            System.out.println("В возрасте " + age + " лет можно работать.");
        }
        if (age >= 100) {
            System.out.println("Вы слишком большой - лучше остаться дома.");
        }
        System.out.println("Задача 5");
        int ageForCarousels = 15;
        if (ageForCarousels < 5) {
            System.out.println("Если возраст ребенка равен - " +ageForCarousels+ " г., то ему нельзя кататься на куруселях");
        }
        if (ageForCarousels > 5 && ageForCarousels < 14) {
            System.out.println("Если возраст ребенка равен - " +ageForCarousels+ " лет, то ему можно кататься на каруселях в сопровождении взрослого");
        }
        if (ageForCarousels > 14) {
            System.out.println("Если возраст ребенка равен - " + ageForCarousels+ " лет, то ему можно кататься на каруселях без сопровождения взрослых ");
        }
        System.out.println("Задача 6");
        int passengerNumber = 102;
        int remainingSeats = (60 - passengerNumber) + 1;
        // int StandingSpace = 102 - 60; // 42 стоячих
        int remainingStandingSpace = (102 - passengerNumber) + 1;
        if (passengerNumber <= 60) {
            System.out.println("Вы " + passengerNumber + " по счету, пассажир, можете приобрести сидячий билет, их осталось - " + remainingSeats);
        } else if (passengerNumber >= 61 && passengerNumber <= 102) {
            System.out.println("Вы " + passengerNumber + " по счету, пассажир, можете приобрести стоячее место, их осталось - " +remainingStandingSpace);
        }
        System.out.println("Задача 7");
        int one = 55;
        int two = 25;
        int three = 11;
        if (one > two && one > three) {
            System.out.println("Число one больше остальных");
        } else if (two > one && two > three) {
            System.out.println("Число two больше остальных");
        } else {
            System.out.println("Число three больше остальных");
        }
    }
}