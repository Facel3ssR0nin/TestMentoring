package lesson2.task1;

import static java.lang.Math.sqrt;
import static lesson1.Simple.discriminant;

public class IfElse {

    /**
     * Пример
     * <p>
     * Найти число корней квадратного уравнения ax^2 + bx + c = 0
     */
    public static int quadraticRootNumber(double a, double b, double c) {
        double discriminant = discriminant(a, b, c);
        return discriminant > 0.0 ? 2 : (discriminant == 0.0 ? 1 : 0);
    }

    /**
     * Пример
     * <p>
     * Получить строковую нотацию для оценки по пятибалльной системе
     */
    public static String gradeNotation(int grade) {
        String notation;
        switch (grade) {
            case 2:
                notation = "неудовлетворительно";
                break;
            case 3:
                notation = "удовлетворительно";
                break;
            case 4:
                notation = "хорошо";
                break;
            case 5:
                notation = "отлично";
                break;
            default:
                notation = "несуществующая оценка " + grade;
        }
        return notation;
    }

    /**
     * Пример
     * <p>
     * Найти наименьший корень биквадратного уравнения ax^4 + bx^2 + c = 0
     */
    public static double minBiRoot(double a, double b, double c) {
        // 1: в главной ветке if выполняется НЕСКОЛЬКО операторов
        if (a == 0.0) {
            if (b == 0.0) return Double.NaN; // ... и ничего больше не делать
            double bc = -c / b;
            if (bc < 0) return Double.NaN;
            return -sqrt(bc);
            // Дальше функция при a == 0.0 не идёт
        }
        double d = discriminant(a, b, c);//2
        if (d < 0.0) return Double.NaN;//3
        //4:
        double y1 = (-b + sqrt(d)) / ((double) 2 * a);
        double y2 = (-b - sqrt(d)) / ((double) 2 * a);
        double y3 = Math.max(y1, y2); //5
        if (y3 < 0.0) return Double.NaN; //6
        return -sqrt(y3); //7
    }

    /**
     * Простая
     * <p>
     * Мой возраст. Для заданного 0 < n < 200, рассматриваемого как возраст человека,
     * вернуть строку вида: «21 год», «32 года», «12 лет».
     */
    public static String ageDescription(int age) {
        //TODO
        return "";
    }

    /**
     * Простая
     * <p>
     * Путник двигался t1 часов со скоростью v1 км/час, затем t2 часов — со скоростью v2 км/час
     * и t3 часов — со скоростью v3 км/час.
     * Определить, за какое время он одолел первую половину пути?
     */
    // 1 1  2 2  3 3
    // 1    4    9    14
    //
    public static double timeForHalfWay(double t1, double v1, double t2, double v2, double t3, double v3) {

        double firstDist = t1 * v1;
        double secondDist = t2 * v2;
        double thirdDist = t3 * v3;
        double totalDist = firstDist + secondDist + thirdDist;
        double halfDist = totalDist/2;
        int halfWayPeriodLocation = 0;
        double calculateTimeSpentForHalfWay = 0;

        if (firstDist < halfDist) {
            if (firstDist + secondDist < halfDist) {
                halfWayPeriodLocation = 3;
            }
            else {halfWayPeriodLocation = 2;}
        }
        else {halfWayPeriodLocation = 1;}

        if (halfWayPeriodLocation == 1) {
            calculateTimeSpentForHalfWay = halfDist/v1;
        } else if (halfWayPeriodLocation == 2) {
            calculateTimeSpentForHalfWay = t1 + halfDist/v2;
        } else {
            calculateTimeSpentForHalfWay = t1 + t2 + halfDist/v3;
        }

        return calculateTimeSpentForHalfWay;
    }

    /**
     * Простая
     * <p>
     * Нa шахматной доске стоят черный король и две белые ладьи (ладья бьет по горизонтали и вертикали).
     * Определить, не находится ли король под боем, а если есть угроза, то от кого именно.
     * Вернуть 0, если угрозы нет, 1, если угроза только от первой ладьи, 2, если только от второй ладьи,
     * и 3, если угроза от обеих ладей.
     * Считать, что ладьи не могут загораживать друг друга
     */
    public static int whichRookThreatens(int kingX, int kingY, int rookX1, int rookY1, int rookX2, int rookY2) {
        //TODO
        return 0;
    }

    /**
     * Простая
     * <p>
     * На шахматной доске стоят черный король и белые ладья и слон
     * (ладья бьет по горизонтали и вертикали, слон — по диагоналям).
     * Проверить, есть ли угроза королю и если есть, то от кого именно.
     * Вернуть 0, если угрозы нет, 1, если угроза только от ладьи, 2, если только от слона,
     * и 3, если угроза есть и от ладьи и от слона.
     * Считать, что ладья и слон не могут загораживать друг друга.
     */
    public static int rookOrBishopThreatens(int kingX, int kingY, int rookX, int rookY, int bishopX, int bishopY) {
        //TODO
        return 0;
    }

    /**
     * Простая
     * <p>
     * Треугольник задан длинами своих сторон a, b, c.
     * Проверить, является ли данный треугольник остроугольным (вернуть 0),
     * прямоугольным (вернуть 1) или тупоугольным (вернуть 2).
     * Если такой треугольник не существует, вернуть -1.
     */
    public static int triangleKind(double a, double b, double c) {
        //TODO
        return 0;
    }


    /**
     * Средняя
     * <p>
     * Даны четыре точки на одной прямой: A, B, C и D.
     * Координаты точек a, b, c, d соответственно, b >= a, d >= c.
     * Найти длину пересечения отрезков AB и CD.
     * Если пересечения нет, вернуть -1.
     * (Можно написать двумя способами - через switch statement или if statement
     * будет классно, если будут имплементированы оба и будет написан второй тест)
     */
    public static int segmentLength(int a, int b, int c, int d) {
        //TODO
        return 0;
    }
}
