package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                result = i;
                break;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Desired key was not found");
        }
        return result;
    }

    public static void main(String[] args) {

        try {
            indexOf(new String[] {
                    "game", "soccer", "final", "ball"
            }, "penalty");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
