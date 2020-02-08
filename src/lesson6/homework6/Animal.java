package lesson6.homework6;

public class Animal {
    // сдесь задаем одинаковые типы данных для всех животных,
    // индивидуальные навыки(типы данных) задаются в классе для конкретного животного
    public String name;
    public int run;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println();

    }
}
