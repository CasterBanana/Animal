package homeanimal;

import java.util.*;

public class Applications {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Animal> animals = new ArrayList();// список animal

        while (true) {
            try {
            System.out.println("Введите комманду: ADD, LIST или EXIT");
            CommandConsole userChoise = CommandConsole.valueOf(sc.next().toUpperCase()); // sc - наименование переменной, которая принимает значение из консоли
            // valueOf - значение из чего-то, значение из sc.next
            // а вот ниже запилю метод для определения команды



            switch (userChoise) {
                case ADD:
                    System.out.println("Какое животное вы хотите добавить? cat/dog/duck");// попробовать завернуть в цикл while для того, чтобы определять cat/dog/duck
                    String animalType = sc.next().toUpperCase();
                    String animales = identifyAnimal(animalType).toLowerCase();
                    if (animales.equals("cat")) {
                        Cat cat = new Cat();// присвоили имя, возраст, вес и цвет от данных выше
                        fillAnimal(sc, cat);
                        cat.say();
                        animals.add(cat);
                    } else if (animales.equals("dog")) {
                        Dog dog = new Dog();// присвоили имя, возраст, вес и цвет от данных выше
                        fillAnimal(sc, dog);
                        // добавить в список animals собаку
                        dog.say();
                        animals.add(dog);
                    } else if (animales.equals("duck")) {
                        Duck duck = new Duck();// присвоили имя, возраст, вес и цвет от данных выше
                        fillAnimal(sc, duck);
                        // добавить в список animals утку
                        duck.say();
                        animals.add(duck);
                    }
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
             } catch (IllegalArgumentException ex){
             System.out.println("Введена неверная комманда");
            //System.exit(400);
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
            if (number < 1) {
                System.out.println("Значение не может быть меньше 1, введите снова ");
                number = console.nextInt();
            }
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

    private static String identifyCommand(String typeCommand){
        List<String> command = new ArrayList();
        for (CommandConsole env : CommandConsole.values()) {
            command.add(env.name());
            System.out.println(command);
        }
        while (!command.contains(typeCommand)) {
            System.out.println("Такого животного нет. Какое животное вы хотите добавить? cat/dog/duck");
            Scanner sc = new Scanner(System.in);
            typeCommand = sc.next().toUpperCase();

        }
        return typeCommand;
    }

}






//        while (TypeAnimal) {
//            System.out.println("Такого животного нет. Какое животное вы хотите добавить? cat/dog/duck");
//            Scanner sc = new Scanner(System.in);
//            typeAnimal = sc.next().toUpperCase();
//        }


//    private static String identifyAnimal(String typeAnimal){
//        for (TypeAnimal env : TypeAnimal.values()) {
//           if(env.equals(typeAnimal)){
//               typeAnimal.toLowerCase();
//               return typeAnimal;
//           } else{
//               System.out.println("Такого животного нет. Какое животное вы хотите добавить? cat/dog/duck");
//               Scanner sc = new Scanner(System.in);
//               typeAnimal = sc.next().toUpperCase();
//           }
//        }



        //System.out.println(typeAnimal);
        //String checkTypeAnimal = typeAnimal.toLowerCase();
//        while (!typeAnimal.equals((TypeAnimal.CAT).toString()) || !typeAnimal.equals(TypeAnimal.DOG) || !typeAnimal.equals(TypeAnimal.DUCK)){
//            System.out.println("Такого животного нет. Какое животное вы хотите добавить? cat/dog/duck");
//            Scanner sc = new Scanner(System.in);
//            TypeAnimal.valueOf(sc.next().toUpperCase());
//        }
        //return typeAnimal;



    // нужен метод по определению ввода животного
//    private static String identifyAnimal(String typeAnimal){
//        if(typeAnimal.equals("cat") || typeAnimal.equals("dog") || typeAnimal.equals("duck")){
//        } else {
//            System.out.println("Такого животного нет. Какое животное вы хотите добавить? cat/dog/duck");
//            String typeAnimals = null;
//            Scanner sc = new Scanner(System.in);
//            typeAnimals = sc.next().toLowerCase();
//            typeAnimal = typeAnimals;
//            return typeAnimal;
//        }
//        return typeAnimal;
//    }






//        private static int getUserprint(Scanner console){
//            int number;
//            do {
//                String next = console.next();// новое значение
//                try {
//                    number = Integer.parseInt(next);
//                    if(number < 1) {
//                        System.out.println("Значение не может быть меньше 1, введите снова ");
//                        continue;
//                    }
//                }
//                catch (NumberFormatException ex){
//                    System.out.println("Вы ввели не число, введите число");
//                    number = 0;
//                }
//
////                while (!console.hasNextInt()) {
////                    System.out.println("Вы ввели не число, введите число");
////                    console.next();
////                }
//            } while (number > 0);
//
//            return number;
//
//        }





