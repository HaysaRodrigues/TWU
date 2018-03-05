import com.haysarodrigues.headfirstjava.chapter2.Dog;
import org.junit.Test;

public class DogTest {

    @Test
    public void testingADog() {
        Dog dog = new Dog();
        dog.setSize(40);
        dog.bark();
        System.out.println(dog + "SIZE: " + dog.getSize());

    }
}
