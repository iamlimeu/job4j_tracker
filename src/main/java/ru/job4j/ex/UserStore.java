package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername().equals(login) && user.getUsername() != null) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUsername().length() > 3) {
            return true;
        }
        throw new UserInvalidException("User is not valid or username has less than 3 symbols");
    }

    public static void main(String[] args) {
        User[] users = {
            new User("Evgeny Lim", true)
        };
        try {
            User user = findUser(users, "Evgeny Lim");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            System.out.println("User is invalid");
        } catch (UserNotFoundException e) {
            System.out.println("User not found");
        }
    }
}
