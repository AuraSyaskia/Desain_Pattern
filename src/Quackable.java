interface Quackable {
    void quack();
}

interface Flyble{
    void fly();
}

abstract class Duck{
    abstract void display();

    void swim(){
        System.out.println("Berenang");
    }
}

class MallardDuck extends Duck implements Quackable,
        @Override
        public void quack(){
            System.out.println("Qwek Qwek");

        }

        @Override

