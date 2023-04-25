

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
                                      ///TODO practice for session1(outsource tasks)///
        /*1.Write a Java program to print the result of the following operations.
        Test Data:
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3
        Expected Output :
        43
        1
        19
        13*/
        /*Scanner scanner=new Scanner(System.in) ;
        System.out.println("Введите числа:");
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        int number3=scanner.nextInt();
        int number4=scanner.nextInt();
        int number5=scanner.nextInt();
        int number6=scanner.nextInt();
        int number7=scanner.nextInt();
        int number8=scanner.nextInt();
        int number9=scanner.nextInt();
        int number10=scanner.nextInt();
        int number11=scanner.nextInt();
        int number12=scanner.nextInt();
        int number13=scanner.nextInt();
        int number14=scanner.nextInt();
        int number15=scanner.nextInt();

        System.out.print("\n Результаты:\na.");
        System.out.println(number1+number2*number3);

        System.out.print("b.");
        System.out.println((number4+number5)%number6);

        System.out.print("c.");
        System.out.println(number7+number8*number9/number10);

        System.out.print("d.");
        System.out.println(number11+number12/number13*number14-number15%number13);*/

       /* 2.Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
                Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5*/

        /*Scanner scanner=new Scanner(System.in);
        System.out.print("Input first number:");
        int number1=scanner.nextInt();
        System.out.print("Input second number:");
        int number2=scanner.nextInt();
        System.out.println("Expected output");
        String res="number1+number2=";
        System.out.printf("%d + %d = ",125,24);
        System.out.println(number1+number2);
        System.out.printf("%d - %d = ",125,24);
        System.out.println(number1-number2);
        System.out.printf("%d * %d = ",125,24);
        System.out.println(number1*number2);
        System.out.printf("%d / %d = ",125,24);
        System.out.println(number1/number2);
        System.out.printf("%d mod %d = ",125,24);
        System.out.println(number1%number2);*/

        /*3.Write a Java program that takes a number as input and prints its multiplication table upto 10.
        Test Data:
        Input a number: 8
        Expected Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
...
        8 x 10 = 80*/
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Input a number: ");
        int number=scanner.nextInt();
        System.out.println("Expected output: ");
        System.out.printf("%d * %d = ",8,1);
        System.out.println(number*1);
        System.out.printf("%d * %d = ",8,2);
        System.out.println(number*2);
        System.out.printf("%d * %d = ",8,3);
        System.out.println(number*3);
        System.out.printf("%d * %d = ",8,4);
        System.out.println(number*4);
        System.out.printf("%d * %d = ",8,5);
        System.out.println(number*5);
        System.out.printf("%d * %d = ",8,6);
        System.out.println(number*6);
        System.out.printf("%d * %d = ",8,7);
        System.out.println(number*7);
        System.out.printf("%d * %d = ",8,8);
        System.out.println(number*8);
        System.out.printf("%d * %d = ",8,9);
        System.out.println(number*9);
        System.out.printf("%d * %d = ",8,10);
        System.out.println(number*10);*/

        /*4.Write a Java program to print the area and perimeter of a circle.
                Test Data:
        Radius = 7.5
        Expected Output
        Perimeter is = 47.12388980384689
        Area is = 176.71458676442586*/

        /*System.out.println("\t\t\t Test Data:");
        double radius=7.5;
        double perimetr=2*Math.PI*radius;
        double area=Math.PI*radius*radius;
        System.out.println("Expected output:");
        System.out.println("Perimetr is = "+perimetr);
        System.out.println("Area is = "+area);*/

        /*5.Write a Java program to print the area and perimeter of a rectangle.
                Test Data:
        Width = 5.5 Height = 8.5
        Expected Output
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20*/

       /* System.out.println("\t\t\t Test Data:");
        float width=5.6f;
        float height=8.5f;
        System.out.println("Expected output:");
        float area=width*height;
        float perimetr=2*(width+height);
        System.out.printf("Area is %f * %f = ",5.6,8.5);
        System.out.println(area);
        System.out.printf("Perimetr is 2 * (%f + %f) = ",5.6,8.5);
        System.out.println(perimetr);*/


                            ///TODO 30.1 practice tasks for Session2(math operators)///
/*1)1. Сиздер консольдон уч орундуу сан бересиздер, ошол санды
сиздер наобороттун чыгарып жана ортосунан болуп салышынздар керек
Мисалы:
Input: 457
Output: 7 5 4 */
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Введите трехзначное число: ");
//        int num=scanner.nextInt();
//        int a=num%10;
//        int b=(num%100)/10;
//        int c=num/100;
//        System.out.println("Требуемый результат: "+a+" "+b+" "+c);

/*2)  Сиздер консольдон 2 орундуу сан киргизишиниздер керек, ошол
санды сиздер математикалык турдоо консольго чыгарышыныздар
керек
Мисалы:
Input: 34
Output: 30 + 4*/
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Введите двухзначное число: ");
//        int num=scanner.nextInt();
//        int b=num%10;
//        int a=(num%100)-b;
//        System.out.println(a+" + "+b+" = "+((num%100)-b+num%10));

/*4). Сиздер консольдон 3 орундуу сан киргизишиниздер керек, ошол
санды сиздер математикалык турдоо консольго чыгарышыныздар
керек
Мисалы:
Input: 364
Output: 300 + 60 + 4*/
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Введите трехзначное число: ");
//        int number=scanner.nextInt();
//        int a,b,c;
//        c = number-(number%100);
//        b = number%10;
//        a = (number%100)-b;
//        System.out.println(c+"+"+a+"+"+b);

/*5. Напишите программу, который принимает с клавиатуры целое
положительное двузначное число. Затем следует построить новое
значение, составленное из цифр числа, введенного с клавиатуры,
но в обратном порядке. После этого новое значение следует
увеличить на 8, и окончательный результат вывести на экран.
Мисалы:
Input: 37
Output: 81*/
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("Введите целое двухзначное число: ");
//        int num=scanner.nextInt();
//        System.out.println(("Получаем обратное значение,увеличенное на 8 => ")+(10*(num%10)+(num/10)+8));

/*6. Напишите программу, который принимает с клавиатуры целое
положительное трехзначное число. Затем следует построить новое
значение, составленное
из цифр числа, введенного с клавиатуры, но в обратном
порядке. После этого новое значение следует уменьшить на 20, и
окончательныйрезультат вывести на экран.
Мисалы:
Input: 327
Output: 703*/
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Введите целое трехзначное число: ");
//        int num=scanner.nextInt();
//        System.out.println(("Output: ")+(100*(num%10)+(num%100)-(num%10)+num/100-20));

/*7. Биз клавиатурадан 3 орундуу сан беребиз,6 ошол сандын ар бир
орундагы сандарынын суммасыны табышыбыз керек.
Мисалы:
Input: 359
Output: 3 + 5 + 9 = 17*/
//            Scanner scanner=new Scanner(System.in);
//            System.out.println("Введите трехзначное число: ");
//            int num=scanner.nextInt();
//            System.out.println("Вы ввели: "+num);
//            int a=num/100;
//            int b=num%100/10;
//            int c=num%10;
//            System.out.println(a + " + " + b + " + " + c + " = "+(a+b+c));


                          ///TODO 30.2 Practice tasks for session3(conditional statements)///
/*8. Напишите программу, который принимает с клавиатуры целое
число и, если оно положительное, увеличивает его вдвое. Класс
должен выводить на экран новое значение.
Input: 4
Output: 8
Input: -5
Output: -5*/
        /*Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println("Input: "+num);
        if (num>0){
            System.out.println("Output: "+(num*2));
        }else {
            System.out.println("Output: "+num);
        }*/


/*9. Напишите программу, который принимает с клавиатуры целое
число и выводит на экран одно из следующих сообщений:
“Положительное”, или “Отрицательное”, или “Ноль”, - в зависимости
от значения числа. */
        /*Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if (num>0){
            System.out.println("Положительное");
        }else if (num<0){
            System.out.println("Отрицательное");
        }else {
            System.out.println("Ноль");
        }*/

/*10. Напишите программу, который принимает с клавиатуры целое
положительное число и, если оно как минимум трехзначное и
положительное, уменьшает его на 1.
Input: 332
Output: 331*/

        /*Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if (num>=100 && num<=999){
            System.out.println("результат: "+(--num));
        }else {
            System.out.println("Вы кажется ввели нетрехзначное число");
        }*/

/*11. Напишите программу, который принимает с клавиатуры два
целых числа и, если первое больше второго, выводит на экран их
сумму, если же наоборот - выводит на экран их произведение. В
случае же, если числа одинаковы, программа выводит на экран
сообщение Числа равны*/
       /* Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        if (a>b){
            System.out.println("Сумма двух чисел: "+(a+b));
        }else if(a<b){
            System.out.println("Произведение двух чисел: "+(a*b));
        }else {
            System.out.println("Числа равны ");
        }*/

/*12. Трехзначное положительное число называется «четнокрасивым», если каждая из его цифр - четная. Напишите класс,
который принимает с клавиатуры трехзначное число и проверяет,
является ли оно «четнокрасивым». В соответствии с результатом
проверки надо вывести на экран соответствующее текстовое
сообщение. Обратите внимание: задание имеет решение с
использованием одного оператора if и без составного условия!*/
       /*Scanner scanner=new Scanner(System.in);
        System.out.print("Введите трехзначное число = > ");
        int num=scanner.nextInt();
        int a =num/100;
        int b=(num%100)/10;
        int c=num%10;
        double res1=a%2;
        double res2=b%2;
        double res3=c%2;
        if (res1==0 && res2==0 && res3==0){
            System.out.println("Четнокрасив");
        }else {
            System.out.println("Нечетнокрасив");
        }*/

/*13. Бир программа жазыныздар, ал программа консольдон 2
орундуу сан алыш керек, бир гана if менен текшериш керек сандын
1 оруну жана 2 орунунун кобойтуусу чонбу же сан озубу
Мисалы:
Input: 25
Output: 25>10*/
        /*System.out.print("Введите двузначное число: ");
         int num=scanner.nextInt();
         int a=num/10,b=num%10;
         int proizvedenie=(a*b);
         System.out.println("Произведение цифр числа равен = > "+proizvedenie);
         if (proizvedenie<num){
         System.out.printf("Output: %d > %d",num,proizvedenie);
         }else {
         System.out.printf("Output: %d > %d",proizvedenie,num);
         }
         //System.out.printf(proizvedenie<num? "%d > %d":"%d < %d",num,proizvedenie);*/

/*14. Бир программа жазыныз, сиз клавиатурадан эки сан беришиниз
керек, биринчи сан окуучулардын саны, экинчи отургучтардын саны.
Сиздер текшеришиниздер керек окуучуларга орун жетеби же
жетпейби.
Мисалы
Input: 25 30
Output: “Отургучтардын саны окуучулардан коп экен”
жана “Отургучтар жетет экен” , “Отургучтар жетпей калат деген”
варианттар болот.*/
        /*Scanner scanner=new Scanner(System.in);
        System.out.print("Введите количество учящихся = ");
        int a=scanner.nextInt();
        System.out.print("Введите количество стульев = ");
        int b=scanner.nextInt();
        if (a>b){
            System.out.print("Стульев не хватает на всех учащихся");
        }else if (a==b){
            System.out.print("Стульев хватает на всех");
        }else {
            System.out.println("Стульев больше чем учащихся");
        }*/

/*15. Бир программа жазыныз, клавиатурадан уч сан ала турган, анан
аларды if, else if, else жардамдары менен ушул сандарды чоною
тартибинде чыгарасыздар консольго.
Мисалы:
Input: 2 243 1
Output: 1, 2, 243
Input: 1 -5 92
Output: -5, 1, 92*/
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Input: ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if (a<b && b<c){
            System.out.println(a+" "+b+" "+c);
        }else if (b<c && c<a){
            System.out.println(b+" "+c+" "+a);
        }else if (c<a && a<b){
            System.out.println(c+" "+a+" "+b);
        }else {
            System.out.println(b+" "+a +" "+c);}*/

/*16.Напишите программу, который принимает с клавиатуры целое
число и выводит на экран его квадрат, но только в случае, если
введенное число отрицательно. В противном случае - на экран
выводится сообщение Ошибка.*/
       /* Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if(num<0){
            System.out.printf("Введенное вами отрицательное число в квадрате = > %d ",(num*num));
        }else {
            System.out.println("Ошибка");
        }*/

/*17. Напишите программу, который принимает с клавиатуры два
числа: первое - количество учеников в классе, второе - количество
стульев в классной комнате. Программа проверит соответствие
между этими двумя значениями и выведет на экран
соответствующую информацию (например, для значений
35 и 39 на экран выводится 4 стула лишних).*/
        /*Scanner scanner=new Scanner(System.in);
        int students=scanner.nextInt();
        int chairs=scanner.nextInt();
        int res=students-chairs;
        if(students<chairs){
            System.out.printf("%d стула лишних",Math.abs(res));
        } else
        {
            System.out.printf("%d студентов лишних",Math.abs(res));
        }*/

/*18. Бир программа жазыныз, сиз торт орундуу оң сан бериниз, сиз
текшеришиниз керек кайсыл орундагы саны чон экен, консольго
чыгарышынз мисалы: биринчи сан 25 экинчи сан 35 тен чон, же экоо
барабар болсо 25 жана 25 бири бирине барабар деп чыгарасыз.*/
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Введите четырехзначное число");
        int num=scanner.nextInt();
        int res=num/100;
        int res2=num%100;
        if (num>0 && num>=1000 && num<=9999 && res>res2){
            System.out.printf("первое число %d больше чем второе число %d",res,res2);
        } else if (num>0 && num>=1000 && num<=9999 && res<res2){
            System.out.printf("первое число %d меньше чем второе число %d",res,res2);
        }else {
            System.out.printf("первое число %d равен второму числу %d",res,res2);
        }*/

/*19. Трехзначное число называется «дважды четным», если и оно
само, и сумма его цифр - четные.
Напишите класс, который принимает с клавиатуры трехзначное
положительное число и проверяет, является ли оно «дважды
четным». В соответствии с результатом проверки надо вывести на
экран соответствующее
текстовое сообщение*/
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int num=scanner.nextInt();
        int sum=((num/100)+(num%100)/10+num%10);
        System.out.println("Сумма цифр введенного числа: "+sum);
        int num1=num%2;
        int sum2=sum%2;
        if (num1==0 && sum2==0){
            System.out.println("Дважды четный ");
        }else {
            System.out.println("Ошибка");
        }*/
                                             ///TODO 30.3 practice tasks (loop)///
/*20. Напишите программу , которая принимает с клавиатуры
трехзначное положительное число и проверяет, содержится ли в
нем хотя бы один ноль. По результатам проверки надо вывести
количество нулей в числе.*/
       /* System.out.print("Введите трехзначное число : ");
        String x= scanner.nextLine();
        int counter=0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i)=='0'){
                counter++;
            }
        }
        System.out.printf(counter!=0 ? "Количество нулей,содержащихся в веденном числе: %d ":"Нулей нет ",counter);*/

/*21. Напишите класс, который принимает с клавиатуры
положительное целое число и выводит на экран ближайшее к нему
«крутлое число».
Например, для введенного значения 433 выводится на экран 430, а
для 56 выводится 60.*/
       /* Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int res=num%10;
        int res2=10-res;
        if (res>=0 && res<=5) {
            System.out.println(" Output: "+(num-res));
        } else if (res>=5 && res<=9) {
            System.out.println("Output: "+(num+res2));
        }*/

/*22. Назовем билет с шестизначным номером «счастливым», если
сумма первых трех его цифр равна сумме последних трех его цифр
и обе эти суммы являются четными.
Напишите класс, который принимает с клавиатуры шестизначный
номер билета и проверяет, является ли он «счастливым» или не
является.*/
        /**System.out.println("Enter a ticket number");
         int num=scanner.nextInt();
         int a=num/100000;
         int b=(num%100000)/10000;
         int c=num%10000/1000;
         int d=num%1000/100;
         int e=(num%100)/10;
         int f=num%10;
         int sum1=(a+b+c);
         int sum2=(d+e+f);
         int sum11=sum1%2;
         int sum12=sum2%2;
         if (sum1==sum2 && sum11==0 && sum12==0){
         System.out.println("счастливый билет");
         }else {
         System.out.println("Не счастливый");
         }*/


/*23. Напишите класс, который принимает с клавиатуры целое число,
которое должно означать порядковый номер месяца. В случае если
полученное
значение действительно соответствует порядковому номеру
одного из месяцев, следует вывести сезон (лето, осень, зима,
весна), к которому относится месяц.
В случае если введенное значение не является порядковым
номером месяца, следует вывести на экран соответствующее
текстовое сообщение.*/
       /* System.out.println("Введите порядковый номер месяца: ");
        int num=scanner.nextInt();
        switch (num){
            case 12,1,2:
                System.out.println("Зима");
                break;
            case 3,4,5:
                System.out.println("Весна");
                break;
            case 6,7,8:
                System.out.println("Лето");
                break;
            case 9,10,11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }*/

/*24. Напишите класс, который принимает с клавиатуры
положительное трехзначное число и проверяет, сколько разных
цифр оно содержит.*/
               /** System.out.print("Введите трехзначное число: ");
                 String num=scanner.nextLine();
                 int count=0;
                 for(int i=0;i<num;i++)
                 if(num.charAt(i)=='')
                 while(a==b || b==c || a==c) {
                     num = num / 10;
                     count++;
                 }
                 System.out.println(count);*/

/*25. Напишите класс, который читает с клавиатуры символ и
проверяет, является ли введенный символ буквой латинского
алфавита. По результатам проверки следует вывести на экран
соответствующее сообщение.*/
        /*System.out.print("Введите символ ");
        String s=scanner.nextLine();
        char c=s.charAt(0);
        while (c>='A' && c<='Z'){
            System.out.println("Вы ввели символ латинского алфавита ");
            break;
        }while (c>='a' && c<='z'){
            System.out.println("Вы ввели символ латинского алфавита прописными буквами ");
            break;
        }
        System.out.println("ОШИБКА");*/


/*  26. Напишите класс, который принимает с клавиатуры два
строковых значения, каждое из которых содержит имя человека, и
проверяет, являются ли эти люди тезками. По результатам
проверки следует вывести на экран соответствующее сообщение.*/
       /* System.out.print("Введите имя первого человека > ");
        String name1=scanner.nextLine();
        System.out.print("Введите имя второго человека > ");
        String name2=scanner.nextLine();
        System.out.println(name1.equals(name2)? "Тезки":"Не тезки");*/

/*27. Напишите класс, который генерирует и выводит на экран
случайное целое чисел из диапазона положительных двузначных чисел.*/
        /*int number=random.nextInt(10,99);
        System.out.println("Случайное целое число > "+number);*/

/*28. Напишите класс, который генерирует случайное положительное
двузначное число, а затем генерирует три целых положительных числа, меньших первого.*/
       /* int number=random.nextInt(10,99);
        System.out.println("Первое рандомное число > "+number);
        System.out.println("Три рандомных числа меньших первого:  > ");
        System.out.println(random.nextInt(10,number));
        System.out.println(random.nextInt(10,number));
        System.out.println(random.nextInt(10,number));*/


/* 29. Напишите программу, сиз консольдон эки маани алышыныз
керек рандом учун, биринчи сан нижний диапазон, экинчи сан
верхний диапазон, рандом сан бир санды генерация кылат.
Сиз консольдон бир сан киргизишиниз керек, эгерде сиз жазган сан
менен рандом сан барабар болсо, окуучу тапты деген нерсени
чыгарышыныз керек, болбосо окуучу таппады деген жазуу.*/
       /* System.out.println("Введите нижний диапазон: ");
        int a=scanner.nextInt();
        System.out.println("Введите верхний диапазон: ");
        int b=scanner.nextInt();
        int r= random.nextInt(a,b);
        System.out.println("Рандомное число между диапазонами: "+r);
        int myNum=scanner.nextInt();
        while(r==myNum){
            System.out.println("Окуучу тапты");
            break;
        }while(r!=myNum){
        System.out.println("Окуучу таппады");
        break;
        }*/


/*30. Напишите программу, которая генерирует числа от 1 до 3, 1 -
камень, 2 - ножницы, 3 бумага. Сиз озунуз бир сан бересиз
консольдон анан текшересиз if, else if, else шарттык операторлор
менен, ким утту же тең чыгуу болду деп.*/
       /*int r=random.nextInt(1,3);
        System.out.print("Введите ваше число от 1 до 3 > ");
        int s=scanner.nextInt();
        if((r==1 && s==3) ||(r==2 && s==1) || (r==3 && s==2)){
            System.out.println("Выиграли вы ");
        }else if(r==s){
            System.out.println("Ничья");
        }else {
            System.out.println("Вы проиграли ");
            System.out.printf("Потому что число от компьютера был %d,а ваше число %d",r,s);
        }System.out.println("\nЧисло от компьютера > "+r);*/


                                    ///TODO 30 заданий на тему LOOP,ARRAY AND METHODS///
/*1. Напишите класс, который создает 20 случайных чисел диапазона
1 - 99. Следует вывести в консоль только те числа которые делятся
на 1-ое рандомное число без остатка.*/
       /* int r1=random.nextInt(1,99);
        System.out.println("Первое рандомное число: "+r1);
        for (int i=2;i<=20;i++) {
            int r2=random.nextInt(1,99);
            System.out.println(i+") "+r2+" "+(r2%r1==0));
        }*/

/*2. Напишите класс, который генерирует 20 рандомных целых чисел
из диапазона -50 до +50, и определяет наименьшее число и
наибольшее число.*/
      /*  int max=0;
        int min=0;
        for(int i=1;i<=20;i++){
            int r= random.nextInt(-50,50);
            System.out.println(i+") "+r);
            if(r>max){
                max=r;
            } else if (r<min) {
                min=r;
            }
        }System.out.println("Максимум > "+max);
        System.out.println("Минимум > "+min);*/

/*3. Напишите класс, который принимает с консоли для переменной X
целое положительное число, а затем дополнительно будет
спрашивать ещё числа, эти числа будут должны вычитаться из
переменной x, вы будете вводить числа до тех пор пока X не будет
отрицательным или равен 0*/
        //3 варианта с разными циклами
        /*  System.out.println("Введите первое число: ");
        int num1=scanner.nextInt();
        while(num1>0 && num1!=0 ){
            System.out.println("Введите новое число > ");
            int num2=scanner.nextInt();
            num1-=num2;
            System.out.println("Результат: "+num1);
        }
        System.out.println("Программа приостановлена");*/

       /* System.out.println("Введите первое число: ");
        int num1=scanner.nextInt();
        do{
            System.out.println("Введите новое число > ");
            int num2=scanner.nextInt();
            num1=num1-num2;
            System.out.println("Результат: "+num1);
        }while(num1!=0 && num1>0);*/

       /* System.out.println("Введите первое число: ");
        for(int num1=scanner.nextInt();num1!=0 && num1>-1;num1++){
            System.out.println("Введите новое число > ");
            int num2=scanner.nextInt();
            num1-=num2;
            System.out.println("Результат: "+num1);
        }
        System.out.println("Программа приостановлена");*/

/*4. Напишите класс, который принимает с клавиатуры две
переменный это два числа, пока не будет введено две одинаковых
чисел.
Класс должен выводить на экран сумму всех первых чисел и сумму
всех вторых чисел (не считая чисел, введенных одинаковыми)*/
       /* int sum1=0;
        int sum2=0;
        System.out.print("введите первое число > ");
        int num1 = scanner.nextInt();
        sum1+=num1;
        System.out.print("\t\t\t\t\t\t\tвведите второе число > ");
        int num2 = scanner.nextInt();
        sum2+=num2;
    while(num1!=num2){
        System.out.print("введите первое число > ");
        num1 = scanner.nextInt();
        sum1+=num1;
        System.out.print("\t\t\t\t\t\t\tвведите второе число > ");
        num2 = scanner.nextInt();
        sum2+=num2;
    }
        System.out.println("сумма первых чисел > "+(sum1-num1));
        System.out.println("сумма вторых чисел > "+(sum2-num2));*/

/*5. Напишите класс, который принимает с клавиатуры целое число
любой длины и выводит на экран:
● в первой строке - все четные цифры этого числа, через пробел
● во второй строке - все нечетные цифры этого числа, через
пробел
Например, для числа 765873 в первой строке будет выведены числа
6 8, а во второй строке 7 5 7 3*/
       /* System.out.println("Введите число любой длины -> ");
        int number= scanner.nextInt();
        even(number);
        odd(number);
    }
        public static void even(int number){
            while (number!=0) {
               int  digit = number % 10;
                if (digit % 2 == 0) {
                    System.out.print(digit + " ");
                }
                number /= 10;
            }
        }
    public static void odd(int number){
        System.out.println();
        while (number!=0) {
            int  digit = number % 10;
            if (digit % 2 != 0) {
                System.out.print(digit + " ");
            }
            number /= 10;
        }
    }*/

/*6. Напишите класс, который принимает с клавиатуры целое
положительное число любой длины, а затем выводит его первую
цифру.
Например, для числа 7659 на экран будет выведено 7.*/

//        long n = scanner.nextLong();
//        while(n > 9)
//            n /= 10;
//        System.out.println(n);

/*7. Напишите класс, который принимает с клавиатуры целое число любой длины и
строит из него число с обратным порядком цифр. Новое значение следует вывести в
консоль*/
        /*String num= scanner.nextLine();
        String result="";
        num=num.trim();
        char[]ch=num.toCharArray();
       // System.out.println(num);
        for(int i=num.length()-1;i>=0;i--){
            result+=ch[i];
        } System.out.println(result.trim());*/
/*8. На спектакль в кассу театра было выделено определенное количество билетов, и
продажа осуществлялась до тех пор, пока не были проданы все билеты. Напишите
класс, который сначала принимает с клавиатуры количество билетов, переданных в
кассу. Затем класс принимает с клавиатуры серию чисел, каждое из которых
указывает на число билетов, которое желает приобрести покупатель. Если нет
возможности продать очередному покупателю требуемое им число билетов,
принимается заказ от следующего покупателя. Класс должен вывести в консоль: ●
Какое число покупателей приобрели билеты ● Какому числу покупателей было
отказано в продаже билетов*/

       /* System.out.println("Введите количество билетов переданных в кассу > ");
        int totalTickets=scanner.nextInt();
        int prodannye=1;
        int otkazannye=0;
        while(totalTickets!=0) {
            System.out.println("Сколько билетов желаете приобрести? ");
            int customer = scanner.nextInt();
            if (customer>totalTickets) {
                System.out.println("К сожалению вы не можете приобрести такое количество билетов");
                otkazannye++;
            } else if(totalTickets>customer){
                totalTickets=totalTickets-customer;
                prodannye++;
                System.out.println(totalTickets+" шт.билетов осталось ");
            }else{
                System.out.println("Билетов не осталось ");
                break;
            }
        }
        System.out.printf("%d покупателей приобрели билеты",prodannye);
        System.out.println();
        System.out.printf("%d покупателям было отказано",otkazannye);
    }
}*/

/*9. Напишите класс, который заполняет случайными четырехзначными числами
массив, размер которого вводится с клавиатуры. После заполнения класс должен
вывести на экран значения массива в одной строке, начиная с конца массива ( с
последнего индекса). */
       /* System.out.print("Введите размер массива ");
        int num= scanner.nextInt();
        int [] array=new int [num];
        System.out.print("Массив со случайными числами : ");
        for(int i=0;i< array.length;i++){
            array[i]= random.nextInt(1000,9999);
            System.out.print(array[i]+" ");
        }
        System.out.print("\nМассив с конца: ");
        for(int i=array.length-1;i>=0;i--) {
            System.out.print(array[i] + " ");
        }*/

/*10. Напишите класс, который заполняет случайными двузначными числами массив,
размер которого вводится с клавиатуры. После заполнения класс должен вывести на
экран значения массива следующим образом: ● в первой строке - первую половину
массива ● во второй строке - вторую половину массива*/
       /* System.out.print("Задайте размер массива ");
        int [] array=new int[scanner.nextInt()];
        System.out.println("Главный массив: ");
        for(int i=0;i<array.length;i++){
            array[i]= random.nextInt(10,99);
            System.out.print(array[i]+" ");
        }int num=0;
        num=array.length/2;
        System.out.println("\nПервая половина массива: ");
        for(int i=0;i<num;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\nВторая половина массива: ");
        for(int i=num;i<array.length;i++){
            System.out.print(array[i]+" ");
        }*/
/*11. Напишите класс, который заполняет случайными двузначными числами массив,
размер которого вводится с клавиатуры. После заполнения класс должен вывести на
экран значения массива следующим образом: ● в первой строке – четные значения,
содержащиеся в массиве ● во второй строке – нечетные значения, содержащиеся в
массиве*/
       /* System.out.println("Задайте размер массива: ");
        int []array=new int[scanner.nextInt()];
        for(int i=0;i< array.length;i++) {
            array[i] = random.nextInt(10, 99);
            System.out.print(array[i] + " ");
        }    System.out.println("\nЧетные значения,содержащиеся в массиве > ");
        for(int i=0;i< array.length;i++) {
            if (array[i]%2==0){
                System.out.print(array[i]+" ");
            }
              } System.out.println("\nНечетные значения,содержащиеся в массиве > ");
           for(int i=0;i< array.length;i++) {
             if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }*/

/*12. Создайте не возвращающий метод в параметры которого, вы даете массив из
целых чисел и еще целое число n. Метод должен проверить есть ли в массиве число
большее или равное n. Если есть такое число вывести в консоль true, в другом случае
false! */
       /* System.out.println("Задайте размер массива ");
       int [] array=new int [scanner.nextInt()];
       getInfo(array,8);
    }
        public static void getInfo (int []array,int num) {

            for (int i = 0; i < array.length; i++) {
                Random random1=new Random();
                array[i]=random1.nextInt(1,10);
                System.out.print(array[i] + " ");
                System.out.println(array[i]>=num? "true":"false");
            }
        }*/
/*13. Напишите не возвращающий метод, который берет в параметры массив из boolean
типа, и выводит в консоль количество true элементов массива.*/
       /* getTrueArray();
        }
     public static void getTrueArray(){
        int trueCounter=0;
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
         System.out.println("Задайте размер массива > ");
         boolean[]array=new boolean[scanner.nextInt()];
         for(int i=0;i< array.length;i++){
             array[i]=random.nextBoolean();
             System.out.println(array[i]);
             if(array[i]==true){
                 trueCounter++;
             }
         }System.out.println("Количество true элементов массива > "+trueCounter);
    }*/
/*14. Напишите не возвращающий метод который в параметры берет
массив из рандомных чисел от 1 до 50 и выводит в консоль только
те числа что больше 20.*/
        /*System.out.println("Задайте размер массива ");
        int [] array=new int [scanner.nextInt()];
        getNum(array);
    }
    public static void getNum(int [] array) {
        Random random1 = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random1.nextInt(1, 50);
            if (array[i] >= 20) {
                System.out.println(array[i]);
            }
        }
    }*/

/*15. Напишите не возвращающий метод, который берет массив из
рандомных чисел от 1 до 50 и еще одно целое число n.
Нужно вывести в консоль сколько раз число n повторялось в
массиве*/
       /* System.out.print("Задайте размер массива ");
        int [] array=new int [scanner.nextInt()];
        getNum(array);
    }
    public static void getNum(int []array) {
        Random random1=new Random();
        int num=15;
        int counter=0;
        for(int i=0;i< array.length;i++){
            array[i]=random1.nextInt(1,50);
            System.out.print(array[i]+" ");
            if(array[i]==num){
                counter++;
            }
        }System.out.printf("\nЧисло n повторялось в массиве %d раз ",counter);
      }*/
/*16. Напишите метод возвращающий тип int, вы должны в параметры метода дать
целое положительное число n. А метод нам вернёт сумму всех цифр от 0 до n.*/
        /*System.out.print("Input n > ");
        System.out.println("Сумма всех цифр от 0 до n = "+getSum(scanner.nextInt()));
    }
    public static int getSum(int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+i;
        }return sum;
    }*/
/*17. Напишите метод, который принимает в качестве параметра массив целых чисел и
число К, число К это индекс в массиве. Нам нужно вывести сумму всех чисел до
индекса K массива. */
       /* int [] array=new int[]{1,2,3,4,5,6,7,8,9,10};
        getSum(array);
    }
        public static void getSum(int[]array){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите индекс массива: ");
           int k= scanner.nextInt();
           int counter=0;
            for(int i=0;i<array.length;i++) {
                System.out.print(array[i] + " ");}
                for(int i=0;i<array[k];i++){
               counter=counter+i;
            }System.out.print("\nCумма всех чисел до индекса K массива = "+counter);
        }*/

/*18. Напишите возвращающий метод типа массива int, который в параметры принимает
массив и возвращает новый массив состоящий только из четных элементов массива
А.*/
       /* int [] array=new int []{1,2,3,4,5,6,7,8,9,10};
        System.out.println(getInfo(array));
    }
    public static int []getInfo (int []array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                System.out.print(array[i]+" ");
            }
        }
        return array;
    }*/

      /*  System.out.println(getInfo());
    }
    public static int [] getInfo(){
        Random random=new Random();
        int razmerMassiva = 4;
        int [] mas1 = new int[razmerMassiva];
        int evenNums = 0;
        System.out.print("Массив А > ");
        for (int i = 0; i < razmerMassiva; i++) {
            mas1[i] = random.nextInt(1,20);
            System.out.print(mas1[i]+" ");
            if(mas1[i]%2 == 0){
                evenNums++;
            }
        }
        int [] mas2 = new int[evenNums];
        int index = 0;
        System.out.println("\nНовый массив из четных чисел массива А : ");
        for (int i = 0; i < razmerMassiva; i++) {
            if(mas1[i]%2 == 0){
                mas2[index] = mas1[i];
                index++;
            }
        }System.out.print(Arrays.toString(mas2));
         return (mas2);
    }*/

/*19. Напишите возвращающий метод типа String, который в качества параметра
принимает число, и возвращает день недели как слово String. (Можно использовать
switch or if else)*/
      /*  int num = scanner.nextInt();
        System.out.println(day(num));
    }
    public static String day(int num) {
        String day="";
        switch (num) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
        return day;
    }*/

/*20. Напишите не возвращающий метод который получает в качестве параметра не
заполненный массив с размером 15. Нужно массив заполнить положительными
случайными двузначными четными числами. И вывести элементы массива в консоль в
одну строку через пробел.*/
       /*getArray();
        }
        public static void getArray(){
        Random random=new Random();
        int [] arr=new int [15];
        for(int i=0;i< arr.length;i++){
            arr[i]=random.nextInt(10,99);
            System.out.print(arr[i]+" ");
        }
    }*/

/**21. Напишите возвращающий метод типа массива char [], который в качестве
параметра берет число n и boolean b. Число n означает количество букв для
заполнения, если boolean b будет true, то нужно вернуть char[] массив состоящий из n
заглавных букв, если же false то прописными буквами (маленькими).*/
       /* boolean b= random.nextBoolean();
        System.out.println(b);
        System.out.println(get(5,b));
   }
        public static  char [] get(int n,boolean b){
        Random random=new Random();
         char [] array=new char[]{'A','B','C','d','e','f'};
         String stringFromCharArray=new String(array);
            if(b){
            System.out.println("если TRUE, то заглавными буквами -->"+stringFromCharArray.toUpperCase());
        }else {
                System.out.println("если FALSE,то прописными буквами -->"+stringFromCharArray.toLowerCase());
            }
            System.out.print("начальный символьный массив был --> ");
      return array;
     }
    }*/

/*22. Напишите возвращающий метод типа boolean, который в качестве параметра
берет заполненный массив именами, и String name. Нам нужно в массиве найти 2-ой
параметр name, если мы его нашли и его индекс
 это четное число то вернуть true, в иных случаях вернуть false.*/
      /* String [] arrayNames={"azamat","bermet","aslan","emil","tamara","samara"};
       String name="azamat";
       System.out.println(b(arrayNames,name));
    }
        public static boolean b(String [] array,String name) {
            boolean found = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(name) && i % 2 == 0)
                {
                    found = true;
                }
            }
                return found;
            }*/

/**23.Напишите возвращающий метод типа массива int[] который
берет в параметр число n, мы внутри метода создадим массив int[]
размером n.
Нам нужно сгенерировать рандомные числа массиву так чтобы
каждое следующее число было больше предыдущей*/
      /*  System.out.println(array(5));
    }
        public static int []array(int n) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int[] array = new int[n];
            for (int i = 1; i < array.length; i++) {
                if (array[i]<n) {
                    array[i] = random.nextInt(1, 100);
                    array[2]=array[1]+array[2];

                }
            }
            return array;
        }
}*/

/**24. Напишите метод возвращающий тип boolean , который
принимает в качестве параметра массив целых чисел и проверяет,
являются ли все элементы массива положительными числами.
Если все элементы положительные то вернуть true, в других случая
вернуть false*/
        /*int []array={-1,-2,3,-4,-5,-6,-7,-8,-9};
        System.out.println(getInfo(array));
        }
    public static boolean getInfo(int []array) {
        for (int i = 0; i < array.length; i++) {
              if(array[i]>0){
                  return true;
        }
        }
           return false;
    }
}*/
/*25.  Дан массив состоящий из целых положительных чисел, и целое
число n.
Массив можно вручную заполнить (не сканнер), целое число n тоже
можно дать вручную.
Нужно найти с помощью суммы каких двух чисел массива мы можем
получить число n, если есть такие числа нужно вернуть их индексы,
если таких нет то вывести на экран таких нету.
Пример: массив -> {2, 7, 11, 15, 45}, число n -> 9
Нужно получить {0, 1} -> это индексы чисел с помощью суммы
которых можно получить число n
Пример: массив -> {3, 2, 4}, число n -> 6
Нужно получить {1, 2} -> это индексы чисел с помощью суммы
которых можно получить число n
Пример: массив -> {3, 3}, число n -> 6
Нужно получить {0, 1} -> это индексы чисел с помощью суммы
которых можно получить число n
Пример: массив -> {2, 7, 11, 15, 45}, число n -> 14
Нужно получить -1*/

        /*int []numbers={2, 7, 11, 15, 45};
        int n=9;
        getSum(numbers,n);
    }
    public static void getSum(int [] numbers,int n){
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==n){
                    System.out.println(i+","+j+" -> индексы чисел с помощью суммы которых можно получить число n");
                }
            }
        }
    }*/

/*26. Напишите возвращающий метод типа boolean, который в
качестве параметра берет массив из положительных чисел.
Если в массиве всего 5 чисел равных 2, то вывести true, а в
остальных случая false*/
       /* System.out.println("Задайте размер массива ");
        int []array=new int[scanner.nextInt()];
        System.out.println( getNum(array));
    }
    public static boolean getNum(int [] array) {
        Random random = new Random();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 3);
            System.out.println(array[i]);
            if (array[i] == 2) {
                counter++;
            }
        }
        System.out.printf("\nЧисло 2 встречается в массиве %d раз ", counter);
        if (counter == 5) {
            return true;
        } else {
            return false;
        }
    }*/
/*27. Напишите возвращающий метод типа String, который в качестве
параметра берет String word и целое положительное число n.
Нужно создать такой String в котором word будет повторяться n раз,
и в конце надо этот String вернуть.
Пример: “Hi”, 4 -> “HiHiHiHi*/
      /*  System.out.println(info("Hi",4));
    }
    public static String info(String word,int n) {
        int counter=0;
        for(int i=0;i<n;i++){
            System.out.print(word+"");
        }
            return ("");
    }
    }*/

/*28. Напишите возвращающий метод типа boolean, который в
качестве параметров принимает массив целых чисел.
Верните значение true, если последовательность чисел 1, 2, 3 где-то
появляется в массиве*/
        /*int []array={5,8,7,1,3,1,4,3};
        System.out.println(getInfo(array));
    }
    public static boolean getInfo(int []array){
        boolean found=false;
        for(int i=0;i< array.length-2;i++){
            //if ((array[i + 2] == array[i + 1] + 1) && (array[i + 1] == array[i] + 1))
            if(array[i] == 1 && array[i + 1] == 2 && array[i + 2] == 3){
               found=true;
           }
        }
        return found;
    }*/

/*29. Напишите возвращающий метод типа boolean, который в
качестве параметра принимает наполненный положительными
числами массив.
Верните значение true, если один из первых 4 элементов в массиве
равен 9. Длина массива может быть меньше 4*/
      /*  int []array={1,9,0,3,5,6};
        System.out.println(getBoolean(array));
    }public static boolean getBoolean (int []array){
        for(int i=0;i<array[3];i++){
                if (array[i] == 9) {
                    return true;
                }

        } return false;
    }
}
*/

/*30. Напишите возвращающий метод типа boolean, который в
качестве параметра принимает наполненный положительными
числами массив.
Верните значение true, если в массиве встречаются 3 одинаковых
числа подряд, в ином случае false.*/
      /*  int []numbers={1,2,4,1,1,4,0,3,3,3,2};
        System.out.println(getInfo(numbers));
    }
    public static boolean getInfo(int [] numbers ){
        boolean found =false;
        for(int i=0;i< numbers.length-2;i++){
            if(numbers[i]==numbers[i+1]&&numbers[i+1]==numbers[i+2]){
                return true;
            }
        }
        return false;
    }
            }*/





    }
}


















