package lesson6.homework6;
//это подкласс Cat, супер класса Animal с наследованием extends

public class Cat extends Animal {
    protected boolean sweem;
    int jump;

//konstruktor Cat

    public Cat(String name, int run, boolean sweem, int jump) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }

    //выводим информацию в консоль
    public void catInfo() {
        System.out.println("CatName: " + name + " /RunLimit: " + run+ " meters/" + " /Sweem:" + sweem + " /Jump: " +jump+ " meters/");
    }

}
