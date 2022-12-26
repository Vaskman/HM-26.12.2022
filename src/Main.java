public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("ЗАДАЧА 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println("ЗАДАЧА 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        System.out.println("ЗАДАЧА 3");
        dog = dog -3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("ЗАДАЧА 4");
        var friend =19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        }
    public static void task3(){
        System.out.println("ЗАДАЧА 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog *10;
        System.out.println(frog);
        frog = frog /3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);


    }
    public static void task4(){
        System.out.println("ЗАДАЧА 6");
        var weight1=78.2;
        System.out.println("вес первого боксёра"+"=" +  weight1 + "кг");
        var weight2=82.7;
        System.out.println("вес второго боксёра"+"=" +weight2 + "кг");
        var finalWeight = weight1 + weight2;
        System.out.println("Итоговый вес боксёров"+"=" +finalWeight +"кг");
        var weightDifference= weight2 - weight1;
        System.out.println("Разница в весе боксёров"+"="+weightDifference+"кг");
        System.out.println("ЗАДАЧА 7");
        var weightDifference1 = weight2-weight1;
        System.out.println("Разница в весе боксёров первый вариант"+ "=" +weightDifference1 + "кг");
        var weightDifference2 = weight2 % weight1;
        System.out.println("Разница в весе боксёров второй вариант"+"=" + weightDifference2 +"кг");
    }
    public static void task5(){
        System.out.println("ЗАДАЧА 8");
        System.out.println("задание 1");
        var totalTime=640;
        System.out.println("Общее время"+"="+totalTime+"ч.");
        var forOneTime=8;
        System.out.println("На одного сотрудника"+"="+forOneTime+"ч.");
        var howManyPeopleWork=totalTime/forOneTime;
        System.out.println("Всего работников в компании — "+howManyPeopleWork+" человек");
        System.out.println("задание 2");
        var addPeople=94;
        System.out.println("Новые Люди "+addPeople+ " человека");
        var ofAllPeopleBecame=howManyPeopleWork+addPeople;
        System.out.println("Итого "+ofAllPeopleBecame+" человек");
        var output = (totalTime/ofAllPeopleBecame);
        System.out.println("Если в компании работает "+ ofAllPeopleBecame+ " человек, то всего "+ output + " часов работы может быть поделено между сотрудниками");



    }
}