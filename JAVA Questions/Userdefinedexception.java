class ShortPasswordException extends Exception {
    @Override
    public String getMessage() {
        return "Passwordd length should be more than 6";
    }
}

public class Userdefinedexception {
    public static void main(String[] args) throws ShortPasswordException {
        String pwd = "hello";
        if(pwd.length() < 6) {
            throw new ShortPasswordException();
        }
    }
}
