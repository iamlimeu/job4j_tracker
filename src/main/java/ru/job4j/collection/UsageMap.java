package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("eulim0204@gmail.com", "Evgeny Lim");
        map.put("qwerty@yandex.ru", "Alina Belova");
        map.put("eulim0204@gmail.com", "Zhenya Lim");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
