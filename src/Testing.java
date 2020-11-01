import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Testing {

    public static String HOUSES = "Количество домов: ";
    public static String TO_VISIT = "Дома, которые надо посетить (через пробел): ";

    public static void main(String[] args) {
        List<Integer> numbersToVisit = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println(HOUSES);
        while (!scanner.hasNextInt())           // Пока в консоли нет следующего инта,
            scanner.nextLine();                 // Считать всю строку, но никуда не присваивать. По сути, пропускает строку

        int numOfHouses = scanner.nextInt();    // Когда, наконец, есть инт, считать и присвоить

        System.out.println(TO_VISIT);
        while (numbersToVisit.isEmpty()) {      // Пока хоть сколько то номеров домов не получится извлечь
            String[] numStrings = scanner.nextLine().split(" "); // Считываем целую строку, бъём её на массив строк по пробелу
            for (String s : numStrings)
                try {                           //Каждую из строчек массива пытаемся привести к числу
                    int houseNum = Integer.parseInt(s);
                    if (houseNum >= 1 && houseNum <= numOfHouses)
                        numbersToVisit.add(houseNum);
                } catch (NumberFormatException e) {
                    // Если возникла ошибка при приведении, не делаем ничего, просто пропускаем
                }
        }

        numbersToVisit = makeLongestRoute(numbersToVisit);

        numbersToVisit.add(0, 1); // По условию задачи стоим у дома №1
        numbersToVisit.add(numOfHouses); // А заканчиваем у последнего дома на улице

        int summaryTimeSpent = 0;
        for (int i = 0; i < numbersToVisit.size() - 1 ; i++)
            summaryTimeSpent += move(numbersToVisit.get(i), numbersToVisit.get(i+1));

        System.out.println();
        System.out.println(summaryTimeSpent);
    }

    public static int move(int from, int to) {
        if (from % 2 == 1)
            from += 1;
        if (to % 2 == 1)
            to += 1;

        return Math.abs(from -to) / 2;
    }

    public static List<Integer> makeLongestRoute(List<Integer> route){
        Collections.sort(route);

        List<Integer> longRoute = new ArrayList<>();
        boolean movingToEnd = true;
        while (route.size() > 0){
            int index = movingToEnd ? route.size() - 1  : 0;
            longRoute.add(route.get(index));
            route.remove(index);
            movingToEnd = !movingToEnd;
        }
        return longRoute;
    }

}
