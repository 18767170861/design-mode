package org.wmc.create.builder.user;

public class UserBuilderMain {

    public static void main(String[] args) {
        User user = User.builder()
                .name("foo")
                .password("pAss12345")
                .age(25)
                .build();
        System.out.println("user:" + user);
    }
}
