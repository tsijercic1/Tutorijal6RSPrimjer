package ba.unsa.etf.rs.tutorijal6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User user = new FacebookUser("abcdef", "etf222", "Shadow OF ETF", LocalDate.now());
        ArrayList<FacebookUser> facebookUsers = new ArrayList<>();

        facebookUsers.stream().forEach(facebookUser -> System.out.println("User: "+facebookUser));
        facebookUsers = (ArrayList<FacebookUser>) new ArrayList<Integer>(
                Arrays.asList(1, 2, 3, 4, 5)
        )
                .stream()
                .map(integer -> {
                    return new FacebookUser(user.getUsername(), user.getPassword(), "AAA" + integer, LocalDate.of(2020, integer, integer));
                }).collect(Collectors.toList());
        System.out.println("---------------------------");
        System.out.println(facebookUsers);
        facebookUsers = (ArrayList<FacebookUser>) facebookUsers.stream().filter(facebookUser -> !facebookUser.getBirthday().isAfter(LocalDate.of(2020, 2, 1))
                || !facebookUser.getBirthday().isBefore(LocalDate.of(2020, 3, 4))).collect(Collectors.toList());
        Functional functional = facebookUsers.get(1);
        functional.doSomething("5555555555555555555");
        System.out.println(LocalDate.of(2020, 2, 4));
        Interface variable = new InstagramUser("a", "asdasd", "sdasd", 55);
        variable.two();

    }
}
