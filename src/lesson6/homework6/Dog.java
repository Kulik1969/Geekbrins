package lesson6.homework6;
//это подкласс Cat супер класса Animal с наследованием extends
public class Dog extends Animal {
    public double jump;
    public int sweem;

    //konstruktor

    public Dog(String name, int run, int sweem, double jump ) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }
    public void dogInfo() {
        System.out.println("DogName: " + name  + " /RunLimit: " + run+ " meters/" + " /Sweem:" + sweem + " /Jump: " +jump+ " meters/");
    }

}

