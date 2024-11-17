public class UserData {
    private static String registeredUsername;
    private static String registeredPassword;

    public static void register(String username, String password) {
        registeredUsername = username;
        registeredPassword = password;
    }

    public static boolean isValidLogin(String username, String password) {
        return username.equals(registeredUsername) && password.equals(registeredPassword);
    }
}
