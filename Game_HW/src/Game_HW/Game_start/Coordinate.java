package Game_HW.Game_start;

import Game_HW.Person.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Coordinate {
    int positionX;
    int positionY;

    public Coordinate(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    /**
     * Поиск расстояния между персонажами
     *
     * @param person - персонаж
     * @return расстояние до указанного в аргументе персогнажа
     */
    public double distance(Person person) {
        return Math.sqrt(
                (Math.pow((this.positionX - person.getPositionX()), 2))
                        + (Math.pow((this.positionY - person.getPositionY()), 2)));
    }

    /**
     * Разница координат между игроками
     *
     * @param person - ближайший игрок
     * @return разница координат (в списке)
     */
    private HashMap<String, Integer> difference(Person person) {
        HashMap<String, Integer> difference = new HashMap<>();
        difference.put("x", this.positionX - person.getPositionX());
        difference.put("y", this.positionY - person.getPositionY());
        return difference;
    }


    /**
     * Координата X или Y  для шага в сторону ближайшего противника
     *
     * @param coordinate     координата X или Y
     * @param diffCoordinate ближайшее расстояние до игрока
     *                       (пока оно не уменьшиться до 1 (расстояния атаки)
     *                       будем увеличивать или уменьшать координату
     *                       - в зависимости в какой стороне по оси, находится противник)
     * @return измененная координата
     */
    private Integer getPosition(Integer coordinate, Integer diffCoordinate) {
        for (int i = Math.abs(diffCoordinate); i > 1; i--) {
            if (diffCoordinate > 0) {
                coordinate--;
                break;
            } else if (diffCoordinate < 0) {
                coordinate++;
                break;
            }
        }
        return coordinate;
    }

    /**
     * @param diffCoordinate ближайшее расстояние до игрока
     * @return Список координат для шага в сторону ближайшего игрока
     */
    private LinkedHashMap<String, Integer> newCoordinate(HashMap<String, Integer> diffCoordinate) {
        LinkedHashMap<String, Integer> newCoord = new LinkedHashMap<>();
        int x = Math.abs(diffCoordinate.get("x"));
        int y = Math.abs(diffCoordinate.get("y"));
        if (x > y) {
            newCoord.put("x", getPosition(this.positionX, diffCoordinate.get("x")));
            newCoord.put("y", this.positionY);
        } else {
            newCoord.put("y", getPosition(this.positionY, diffCoordinate.get("y")));
            newCoord.put("x", this.positionX);
        }

        return newCoord;
    }
    /**
     * Проверяем не выйдет-ли игрок за границы поля
     * @param min        минимальная граница коорлинат по оси
     * @param max        максимальная граница коорлинат по осии
     * @param coordinate переданная координата
     * @return
     */
    private boolean checkingBorder(int min, int max, int coordinate) {
        return coordinate >= min && coordinate <= max;
    }

    /**
     * Проверка свободна-ли клетка для шага
     * @param gamer игрок рядом
     * @param newCoordinate мои координаты для хода
     * @return
     */
    private boolean checkWay(Person gamer, LinkedHashMap<String, Integer> newCoordinate) {
        return gamer.getPositionX() == newCoordinate.get("x")
                && gamer.getPositionY() == newCoordinate.get("y");
    }

    /**
     * Делаем шаг. Если на пути наш игрок - обходим его делая шаг в сторону
     *
     * @param opponent        противник
     * @param myTeamGamerNear ближайший игрок моей команды
     * @param gamer           я
     */
    public void stepUp(Person opponent, ArrayList<Person> myTeamGamerNear, Person gamer) {
        LinkedHashMap<String, Integer> newCoordinate = this.newCoordinate(this.difference(opponent));
        myTeamGamerNear.forEach(System.out::println);
        String key = newCoordinate.lastEntry().getKey();
        Integer value = newCoordinate.lastEntry().getValue();

        for (Person gamerMyTeam : myTeamGamerNear) {
            if (checkWay(gamerMyTeam, newCoordinate)) {
                System.out.println("Клетка занята -> "+gamerMyTeam);
                value = checkingBorder(0, 9, value++)
                        ? value++ : value--;
            }

            newCoordinate.re
                System.out.println(key + " значение -> " + value);

                System.out.println(key + " значение -> " + value);
            } else {
                gamer.setPositionX(newCoordinate.get("x"));
                gamer.setPositionY(newCoordinate.get("y"));
            }
        }
    }
