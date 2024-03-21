// ---- QUESTION 1 ----
abstract class Pen
{
    abstract void write();
    abstract void refill();
}
class fountainPen extends Pen
{
    void write()
    {
        System.out.println("Write");
    }
    void refill()
    {
        System.out.println("Refill");
    }
    void changeNib()
    {
        System.out.println("Changing the Nib");
    }
}


// ---- QUESTION 2 ----
class Monkey
{
    void jump() { System.out.println("Jumping......"); }
    void bite() { System.out.println("Biting........"); }
}
interface BasicAnimal {
    void eat();

    void sleep();
}
class Human extends Monkey implements BasicAnimal
{
    void speak()
    {
        System.out.println("Namaste Sir !!!");
    }
    @Override
    public void eat() { System.out.println("Eating......"); }
    @Override
    public void sleep() { System.out.println("Sleeping"); }
}

// QUESTION NUMBER 4
abstract class TelePhone
{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
interface SmartPhone1
{
    void music();
    void video();
}
class SmartTelePhone extends TelePhone implements SmartPhone1
{
    void ring() { System.out.println("Ringing......."); }
    void lift() { System.out.println("lifiing......."); }
    void disconnect() { System.out.println("disconnecting......."); }

    @Override
    public void music() {
        System.out.println("Music playing");
    }
    @Override
    public void video() {
        System.out.println("Video Playing");
    }
}

// QUESTIONS NUMBER 6 and 7
interface TV_remote
{
    void channelUp();
    void channelDown();
}
interface Smart_TV_Remote
{
    void youtube();
    void netflix();
}
class TV implements TV_remote,Smart_TV_Remote
{
    public void channelUp() { System.out.println("Channel change up"); }
    public void channelDown() { System.out.println("Channel change down"); }
    public void youtube() { System.out.println("YOUTUBE"); }
    public void netflix() { System.out.println("NETFLIX"); }
}
public class java_67_Practise_Set
{
    public static void main(String[] args)
    {
        System.out.println("\nQuestion number 1");
        fountainPen pen = new fountainPen();
        System.out.println("FountainPen class");
        pen.changeNib();
        pen.write();
        pen.refill();

        System.out.println("\nQuestion number 2");
        Human Aman = new Human();
        Aman.speak();
        Aman.sleep();
        Aman.eat();
        Aman.bite();
        Aman.jump();

        Monkey mona = new Monkey();
        mona.bite();
        mona.jump();

        System.out.println("\nQuestion number 5");
        Monkey monalisa = new Human();
        //monalisa.speak(); -->> Cannot use speak method because the reference is monkey with does not have speak method
        monalisa.jump();
        monalisa.bite();

        System.out.println("\nQuestion number 4");
        SmartTelePhone phone = new SmartTelePhone();
        phone.ring();
        phone.lift();
        phone.disconnect();
        phone.music();
        phone.video();

        System.out.println("\nAnother part of Question number 4");
        TelePhone tele = new SmartTelePhone();
        tele.ring();
        tele.lift();
        tele.disconnect();
        //tele.music();         ERROR !!!

        System.out.println("\nQuestion number 6 AND 7");
        TV LG = new TV();
        LG.channelUp();
        LG.channelDown();
        LG.youtube();
        LG.netflix();
    }
}
