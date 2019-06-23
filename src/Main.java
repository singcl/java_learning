import com.learning.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        String[] x = {"设么鬼"};
        String[] xx = new String[]{"设么鬼"};
        HelloWorld.main(xx);

        Dog gou = new Dog("喵喵");
        gou.barking();
        System.out.println(gou.age);

        new Puppy("AIMIAO");
    }
}