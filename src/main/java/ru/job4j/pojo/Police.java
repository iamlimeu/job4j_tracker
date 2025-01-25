package ru.job4j.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Lim Evgeny");
        license.setModel("BMW X5");
        license.setCode("oo777o");
        license.setCreated(new Date());

        System.out.println(license.getCreated() + license.getOwner() + " has a car - " + license.getModel() + " : " + license.getCode());
    }
}
