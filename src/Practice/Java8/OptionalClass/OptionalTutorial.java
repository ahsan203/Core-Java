package Practice.Java8.OptionalClass;

import java.util.Optional;

public class OptionalTutorial
{
    public static void main(String[] args) {

        Optional<Cat> felix = findByCatName("Felix");
        System.out.println(felix.orElse(new Cat("Default-Cat",5)));
    }

    private static Optional<Cat> findByCatName(String name)
    {
        Cat felix = null;

        return Optional.ofNullable(felix);
    }
}
