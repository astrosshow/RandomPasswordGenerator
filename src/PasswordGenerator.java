import java.util.Random;

public class PasswordGenerator {
    private final String[] newPassword;
    private final int length;
    private final int DEFAULT_CAPACITY = 8;

    public PasswordGenerator() {
    this.length = DEFAULT_CAPACITY;
    this.newPassword = new String[length];
    }

    public PasswordGenerator(int theLength) {
    this.length = theLength;
    this.newPassword = new String[length];
    }

    public String generatePassword() {
        return generatePasswordPrivate();
    }

    private String generatePasswordPrivate() {
        String charSet = "ABCDEIFJLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String symbolSet = "!@#$%^&*_-";
        Random rnd = new Random();
        char[] password = new char[length];
        for (int i = 0; i < length - 1; ++i) {
            int charIndex = rnd.nextInt(charSet.length());
            password[i] = charSet.charAt(charIndex);
        }
        int symbolIndex = rnd.nextInt(symbolSet.length());
        password[length - 1] = symbolSet.charAt(symbolIndex);
        return new String(password);
    }
}
