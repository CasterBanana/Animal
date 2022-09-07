package homeanimal;

public class Cat extends Animal { // если у родительского класса есть конструктор, то мы должны в него что-то передать, что делается ниже
    public Cat(String name, int age, int weight, String color) {
        super(name, age, weight, color); // super означает, что мы передаём что-то в конструктор родительского класса Animal
    }

    public Cat(){

    }

    @Override //ctrl + 0 и там можно вытянуть метод из класса Animal
    public void say() { // а тут мы старый кот стёрли и ввели свой, переопределили типа
        System.out.println("Мяу");
    }
}
