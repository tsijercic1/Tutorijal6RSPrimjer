package ba.unsa.etf.rs.tutorijal6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
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


    }
}
