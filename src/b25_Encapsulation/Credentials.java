package b25_Encapsulation;

public class Credentials {

    private String userName;
    private String password;


    public Credentials(String userName, String password) {
        setPassword(password);
        setUserName(userName);
    }

    public boolean isStrongPassWord(String password) {
        if (password.length() < 8 || password.contains(" ")) return false;

        char[] arr = password.toCharArray();
        boolean hasLetter = false;
        boolean hasSpecial = false;
        boolean hasDigit = false;
        for (char c : arr) {
            //not sure if the isDigit, isLetter works
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isLetter(c)) {
                hasLetter = true;
            } else {
                hasSpecial = true;
            }

        }
        return hasLetter && hasSpecial && hasDigit;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isStrongPassWord(password)) {
            this.password = password;
        } else {
            System.err.println("password is not strong");
            System.exit(0);

        }

    }

    public String toString() {
        return "Credentials{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

/*
create a class named Credentials
Variables:
username, password
Methods:
isStrongPassWord(): takes an argument of string and verify
if the given string is strong password
Characteristics of strong passwords are:
1. Password MUST be at least have 8
characters long, and should not
contain space
2. PassWord should at least contain
one letter
3. Password should at least contain
one special characters
4. Password should at least contain a
digit
getPassword(): reads the password
getUsername(): reads the username
setUsername(): sets the username
setPassword(): sets a new password
the new password MUST be a strong
password
toString():
Add a constructor that allows user to set all the fields when
the object is created.
(If the arguments not valid it should not be set
to the instances
 */