package homeanimal.app;

import homeanimal.enums.CommandConsole;
import homeanimal.enums.TypeAnimal;
import homeanimal.typeanimals.Animal;
import homeanimal.typeanimals.Cat;
import homeanimal.typeanimals.Dog;
import homeanimal.typeanimals.Duck;

import java.util.*;

public class Applications {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Animal> animals = new ArrayList();// список animal

        while (true) {

            System.out.println("Введите комманду: ADD, LIST или EXIT");
            String userCommand = sc.next().toUpperCase();
            boolean isCommandValid = false;
            for (CommandConsole commandConsole : CommandConsole.values()) {
                if (commandConsole.name().equals(userCommand)) {
                    isCommandValid = true;
                }
            }

            if (!isCommandValid) {
                System.out.println("Введена неверная комманда");
                continue;
            }
            CommandConsole userChoise = CommandConsole.valueOf(userCommand); // sc - наименование переменной, которая принимает значение из консоли

            switch (userChoise) {
                case ADD:
                    System.out.println("Какое животное вы хотите добавить? cat/dog/duck");// попробовать завернуть в цикл while для того, чтобы определять cat/dog/duck
                    String animalType = sc.next().toUpperCase();
                    String animales = identifyAnimal(animalType).toLowerCase();
                    Animal animalss = null;
                    if (animales.equals("cat")) {
                        animalss = new Cat(null, 0, 0, null);
                    } else if (animales.equals("dog")) {
                        animalss = new Dog(null, 0, 0, null);
                    } else if (animales.equals("duck")) {
                        animalss = new Duck(null, 0, 0, null);
                    }
                    fillAnimal(sc, animalss);
                    animalss.say();
                    animals.add(animalss);
                    break;
                case LIST:
                    for (Animal animal : animals) // пробегаемся по списку животных animals
                        System.out.println(animal); // выводим значение списка animals
                    break;

                case EXIT:
                    System.out.println("Вы вышли");
                    System.exit(0); // в любом месте кода означает завершение программы
                    //break не нужен, итак выходим
                default:
                    System.out.println("wrong command");
            }

        }
    }

    private static void fillAnimal(Scanner console, Animal animal) {
        System.out.println("Введите имя");//
        String name = console.next(); // считали имя
        System.out.println("Введите возраст");
        int age = getUserprint(console);
        //int age = console.nextInt(); // считали возраст
        System.out.println("Введите вес");
        int weight = getUserprint(console);
        //int weight = console.nextInt(); // считали вес
        System.out.println("Введите цвет");
        String color = console.next(); // считали цвет
        animal.setName(name);
        animal.setAge(age);
        animal.setWeight(weight);
        animal.setColor(color);
    }

    private static int getUserprint(Scanner console) {
        int number;
        while (!console.hasNextInt()) {
            System.out.println("Вы ввели не число, введите число");
            console.next();
        }
        number = console.nextInt();
        while (number < 1) {
            System.out.println("Значение не может быть меньше 1, введите снова ");
            number = console.nextInt();

        }
        return number;

    }

    private static String identifyAnimal(String typeAnimal) {
        List<String> animal = new ArrayList();
        for (TypeAnimal env : TypeAnimal.values()) {
            animal.add(env.name());
        }
        while (!animal.contains(typeAnimal)) {
            System.out.println("Такого животного нет. Какое животное вы хотите добавить? cat/dog/duck");
            Scanner sc = new Scanner(System.in);
            typeAnimal = sc.next().toUpperCase();

        }
        return typeAnimal;

    }

//    private static String identifyCommand(String userCommand) {
//        boolean isCommandValid = false;
//        while (!isCommandValid) {
//            for (CommandConsole commandConsole : CommandConsole.values()) {
//                if (commandConsole.name().equals(userCommand)) {
//                    isCommandValid = true;
//                }
//            }
//            while (!isCommandValid) {
//                System.out.println("Введена неверная комманда, введите комманду: ADD, LIST или EXIT");
//                Scanner sc = new Scanner(System.in);
//                userCommand = sc.next().toUpperCase();
//                for (CommandConsole commandConsole : CommandConsole.values()) {
//                    if (commandConsole.name().equals(userCommand)) {
//                        isCommandValid = true;
//                        return CommandConsole.valueOf(userCommand).name();
//
//                    }
//                }
//            }
//        }
//        //return CommandConsole.valueOf(userCommand).name();
//
//        return userCommand; // почему-то возвращает значение, которое получилос в самом начале
//    }

}



























