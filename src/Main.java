public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        System.out.println("Задача 3");
        dog = dog -3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 4");
        var friend =19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        }
    public static void task3(){
        System.out.println("Задача5");
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
        System.out.println("Задача 6");
        var weight1=78.2;
        System.out.println("вес первого боксёра"+"=" +  weight1 + "кг");
        var weight2=82.7;
        System.out.println("вес второго боксёра"+"=" +weight2 + "кг");
        var finalWeight = weight1 + weight2;
        System.out.println("Итоговый вес боксёров"+"=" +finalWeight +"кг");
        var weightDifference= weight2 - weight1;
        System.out.println("Разница в весе боксёров"+"="+weightDifference+"кг");
        System.out.println("Задача 7");
        var weightDifference1 = weight2-weight1;
        System.out.println("Разница в весе боксёров первый вариант"+ "=" +weightDifference1 + "кг");
        var weightDifference2 = weight2 % weight1;
        System.out.println("Разница в весе боксёров второй вариант"+"=" + weightDifference2 +"кг");
    }
}