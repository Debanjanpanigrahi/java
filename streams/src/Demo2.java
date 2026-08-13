import java.util.Optional;

public class Demo2 {
    public static void main(String[] args)
    {
        Optional<User> user = getUser();
        user.map(x->x.address)
                .map(y->y.city)
                .ifPresent(System.out::println);

    }

    private static Optional<User> getUser(){
        Address a = new Address();
        a.city="Delhi";

        User u = new User();
        u.address = a;

        return Optional.of(u);
    }
}

class User{
    public Address address;
}

class Address {
    public String city;
}
