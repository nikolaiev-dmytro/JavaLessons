package lesson11;

import java.util.Random;

public class Lesson11 {
    int countOfString = 0;
    int countOfDouble = 0;
    int countOfLong = 0;
    int countOfBoolean = 0;
    int countOfBooleanInContainer = 0;
    int countOfStringInContainer = 0;
    int countOfDoubleInContainer = 0;
    int countOfLongInContainer = 0;

    public Lesson11() {
    }

    public void main() {
        Object[] objects = new Object[10_000_000];
        Random random = new Random();
        for (int i = 0; i < objects.length; i++) {
            addToObjectArray(objects, random, i);
        }


        long a = System.currentTimeMillis();
        getCountOfTypesInObjectArray(objects);
        long b = System.currentTimeMillis();
        System.out.println("Count of Boolean=" + countOfBoolean);
        System.out.println("Count of String=" + countOfString);
        System.out.println("Count of Long=" + countOfLong);
        System.out.println("Count of Double=" + countOfDouble);
        System.out.println("Time=" + (b - a) + " milliseconds");
        Container[] containers = new Container[10_000_000];
        for (int i = 0; i < containers.length; i++) {
            addToContainersArray(containers,random,i);
        }
         a = System.currentTimeMillis();
        getCountOfTypesInContainerArray(containers);
         b = System.currentTimeMillis();
        System.out.println("Count of Boolean(Container)=" + countOfBooleanInContainer);
        System.out.println("Count of String(Container)=" + countOfStringInContainer);
        System.out.println("Count of Long(Container)=" + countOfLongInContainer);
        System.out.println("Count of Double(Container)=" + countOfDoubleInContainer);
        System.out.println("Time=" + (b - a) + " milliseconds");

    }

    private void getCountOfTypesInObjectArray(Object[] objects) {
        for (int i = 0; i < objects.length; i++) {
            switch (objects[i].getClass().getSimpleName()) {
                case "String": {
                    countOfString++;
                    break;
                }
                case "Boolean": {
                    countOfBoolean++;
                    break;
                }
                case "Long": {
                    countOfLong++;
                    break;
                }
                case "Double": {
                    countOfDouble++;
                    break;
                }
            }
        }
    }

    private void addToObjectArray(Object[] objects, Random random, int i) {
        switch (random.nextInt(4)) {
            case 0: {
                String string = new String("Hello");
                objects[i] = string;
                break;
            }
            case 1: {
                Double doub = new Double(i);
                objects[i] = doub;
                break;
            }
            case 2: {
                Boolean bool = new Boolean(true);
                objects[i] = bool;
                break;
            }
            case 3: {
                Long lon = new Long(i);
                objects[i] = lon;
                break;
            }
        }
    }


    private void addToContainersArray(Container[] objects, Random random, int i) {
        switch (random.nextInt(4)) {
            case 0: {
                String string = "Hello";
                objects[i]=new Container();
                objects[i].setType(Type.String);
                objects[i].setValue(string);
                break;
            }
            case 1: {
                Double doub = (double) i;
                objects[i]=new Container();
                objects[i].setType(Type.Double);
                objects[i].setValue(doub);
                break;
            }
            case 2: {
                Boolean bool = Boolean.TRUE;
                objects[i]=new Container();
                objects[i].setType(Type.Boolean);
                objects[i].setValue(bool);
                break;
            }
            case 3: {
                Long lon = (long) i;
                objects[i]=new Container();
                objects[i].setType(Type.Long);
                objects[i].setValue(lon);
                break;
            }
        }
    }
    private void getCountOfTypesInContainerArray(Container[] objects) {
        for (int i = 0; i < objects.length; i++) {
            switch (objects[i].getType().name()) {
                case "String": {
                    countOfStringInContainer++;
                    break;
                }
                case "Boolean": {
                    countOfBooleanInContainer++;
                    break;
                }
                case "Long": {
                    countOfLongInContainer++;
                    break;
                }
                case "Double": {
                    countOfDoubleInContainer++;
                    break;
                }
            }
        }
    }
}
