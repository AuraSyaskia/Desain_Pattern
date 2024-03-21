//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);

            interface Quackable {
                void quack();
            }

            interface Flyable {
                void fly();
            }

            abstract class Duck {
                abstract void display();

                void swim() {
                    System.out.println("Berenang");
                }
            }

            class MallardDuck extends Duck implements Quackable, Flyable {
                @Override
                public void quack() {
                    System.out.println("Qwek Qwek");
                }

                public void fly() {
                    System.out.println("Terbang");
                }

                @Override
                void display() {
                    System.out.println("Tampilan MalladrDuck");
                }
            }

            class ReaheadDuck extends Duck implements Quackable, Flyable {
                @Override
                public void quack() {
                    System.out.println("Qwek Qwek");
                }

                public void fly() {
                    System.out.println("Terbang");
                }

                @Override
                void display() {
                    System.out.println("Tampilan RedHeadDuck");
                }
            }

            class RubberDuck extends Duck implements Quackable {
                @Override
                public void quack() {
                    System.out.println("Squeak");
                }

                @Override
                void display() {
                    System.out.println("Tampilan RubberDuck");
                }
            }

            class WoodenDuck extends Duck {
                @Override
                void display() {
                    System.out.println("Tampilan WoodenDuck");
                }
            }

            class ToyDuck extends Duck implements Flyable {
                public void fly() {
                    System.out.println("Terbang seperti mainan");
                }


                @Override
                void display() {

                }
            }
        }
    }
}
