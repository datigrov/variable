public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println("Собака " + dog);
        var cat = 3.6;
        System.out.println("Кот " + cat);
        var paper = 763789;
        System.out.println("Бумага " + paper);

        var Dog = dog + 2;
        System.out.println("Собака " + Dog);
        var Cat = cat + 2;
        System.out.println("Кот " + Cat);
        var Paper = paper + 2;
        System.out.println("Бумага " + Paper);

        var DOG = dog - 3.5;
        System.out.println("Собака " + DOG);
        var CAT = cat - 1.6;
        System.out.println("Кот " + CAT);
        var PAPER = paper - 7639;
        System.out.println("Бумага " + PAPER);

        var friend = 19;
        System.out.println("Друг " + friend);
        var Friend = friend + 2;
        System.out.println("Друг " + Friend);
        var FRIEND = Friend / 7;
        System.out.println("Друг " + FRIEND);

        var frog = 3.5;
        System.out.println("Лягушка " + frog);
        var Frog = frog * 10;
        System.out.println("Лягушка " + Frog);
        var FROG = Frog / 3.5;
        System.out.println("Лягушка " +FROG);
        var fRog = FROG + 4;
        System.out.println("Лягушка " + fRog);

        var firstBoxer = 78.2;
        System.out.println("Вес первого боксера " + firstBoxer + "кг!");
        var secondBoxer = 82.7;
        System.out.println("Вес второго боксера " + secondBoxer + "кг!");
        var weight = firstBoxer + secondBoxer;
        System.out.println("Общая масса боксеров " + weight + "кг!");
        var difference = secondBoxer - firstBoxer;
        System.out.println("Разница в массе боксеров " + difference + "кг!");
        var Difference = secondBoxer % firstBoxer;
        System.out.println("Разница в массе боксеров " + Difference + "кг!");

        var hours = 640;
        System.out.println("Общее количество " + hours + " часов!");
        var standard = 8;
        System.out.println("Норма на сотрудника в день " + standard + " часов!");
        var employees = hours / standard;
        System.out.println("Всего работников в компании " + employees + " человек!");
        var Employees = employees + 94;
        var Hours = Employees * 8;
        System.out.println("Если в компании работает " + Employees + " человек, то всего " + Hours + " часов работы может быть поделено между сотрудниками!");



     }
}