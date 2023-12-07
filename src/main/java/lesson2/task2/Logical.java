package lesson2.task2;

import static lesson1.Simple.sqr;

public class Logical {
    /**
     * Пример
     * <p>
     * Лежит ли точка (x, y) внутри окружности с центром в (x0, y0) и радиусом r?
     */
    public static boolean pointInsideCircle(double x, double y, double x0, double y0, double r) {
        return sqr(x - x0) + sqr(y - y0) <= sqr(r);
    }

    /**
     * Простая
     * <p>
     * Четырехзначное число назовем счастливым, если сумма первых двух ее цифр равна сумме двух последних.
     * Определить, счастливое ли заданное число, вернуть true, если это так.
     */
    public static boolean isNumberHappy(int number) {
        int firstNum = number/1000;
        int secondNum = number%1000 /100;
        int thirdNum =number%100 /10;
        int fourthNum =number%10;

        return firstNum + secondNum == thirdNum + fourthNum;
    }

    /**
     * Простая
     * <p>
     * На шахматной доске стоят два ферзя (ферзь бьет по вертикали, горизонтали и диагоналям).
     * Определить, угрожают ли они друг другу. Вернуть true, если угрожают.
     * Считать, что ферзи не могут загораживать друг друга.
     */
    public static boolean queenThreatens(int x1, int y1, int x2, int y2) {


        if (x1 == x2 || y1 == y2) {
            return true;
        } else return Math.abs(x1 - x2) == Math.abs(y1 - y2);
    }

    /**
     * Простая
     * <p>
     * Дан номер месяца (от 1 до 12 включительно) и год (положительный).
     * Вернуть число дней в этом месяце этого года по григорианскому календарю.
     */
    public static int daysInMonth(int month, int year) {
        boolean isLeapYear = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
        int extractedDays;

       switch (month) {
            case 1,3,5,7,8,10,12:
                extractedDays = 31;
                break;
            case 4,6,9,11:
                extractedDays = 30;
                break;
            case 2:
                if (isLeapYear) {
                    extractedDays = 29;
                }
                else {
                    extractedDays = 28;
                }
                break;
            default:
                extractedDays = 0;
                System.out.println("неверно указан месяц " + month);
                break;
        }
        return extractedDays;

    }

    /**
     * Средняя
     * <p>
     * Проверить, лежит ли окружность с центром в (x1, y1) и радиусом r1 целиком внутри
     * окружности с центром в (x2, y2) и радиусом r2.
     * Вернуть true, если утверждение верно
     */
    public static boolean circleInside(double x1, double y1, double r1, double x2, double y2, double r2) {
        //TODO
        return false;
    }

    /**
     * Средняя
     * <p>
     * Определить, пройдет ли кирпич со сторонами а, b, c сквозь прямоугольное отверстие в стене со сторонами r и s.
     * Стороны отверстия должны быть параллельны граням кирпича.
     * Считать, что совпадения длин сторон достаточно для прохождения кирпича, т.е., например,
     * кирпич 4 х 4 х 4 пройдёт через отверстие 4 х 4.
     * Вернуть true, если кирпич пройдёт
     */
    public static boolean brickPasses(int a, int b, int c, int r, int s) {
        //TODO
        return false;
    }
}
