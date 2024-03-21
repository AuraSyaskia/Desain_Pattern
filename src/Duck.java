abstract class Duck {
    void quack(){
        System.out.println("Qwek Qwek");

    }
    void swim(){
        System.out.println("Berenang");

    }
    abstract void display();

    void fly(){
        System.out.println("Terbang");
    }
}

class MallardDuck extends Duck{
    @Override
    void display(){
        System.out.println("Tampilan MallardDuck");
    }
}

class RubberdDuck extends Duck{
    @Override
    void display(){
        System.out.println("Tampilan RedHeadDuck");
    }
}

class RubberDuck extends Duck{
    @Override
    void display(){
        System.out.println("Bunyinya squeek, bukan qwak");
    }

    @Override
    void fly(){
        //Tidak ada implementasi, karena bebek mainan t
    }
}

class WoodenDuck extends Duck {
    @Override
    void display(){
        System.out.println("Tampilan WoodenDuck");
    }
    @Override
    void quack(){
        //Tidak ada implementasi, karena bebek mainan t

    }
    @Override
    void swim(){
        System.out.println("Mengambang");
    }

    @Override
    void fly(){
        //Tidak ada implementasi, karena bebek mainan t
    }
}
