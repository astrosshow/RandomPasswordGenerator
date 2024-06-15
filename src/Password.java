public class Password {
    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator(20);
        String newPassword = passwordGenerator.generatePassword();
        System.out.println(newPassword);
    }
}
