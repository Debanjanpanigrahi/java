import java.util.Optional;

/*This is code for optional*/

public class Main{
    public static  void main(String[] args)
    {
      /*  Optional<String> name = getName();
        if(name.isPresent()) {
            System.out.println(name.get());
        }

        name.ifPresent(System.out::println);*/
        getName().ifPresentOrElse(System.out::println,()->System.out.print("unknown"));
        System.out.println(getName().orElse("Unknown"));
        System.out.println(getName().orElseGet(()->"unknown"));
        System.out.println(getName().orElseThrow());


    }

    public static Optional<String> getName()
    {
        return Optional.ofNullable(null);
    }
}