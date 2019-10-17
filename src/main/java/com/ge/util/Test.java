package com.ge.util;

public class Test {

    public static void main(String[] args) {


        String gensalt = BCrypt.gensalt();
        String password = BCrypt.hashpw("123456", gensalt);
        System.out.println(gensalt);
        System.out.println(password);

        boolean checkpw = BCrypt.checkpw("123456", "$2a$10$ouWNd1JhZWsg5PVZiwExDlu8Ig20pf53U1mc/hyVSYutBflfA0ZWZm");
        System.out.println(checkpw);

    }

}
