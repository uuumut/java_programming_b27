package b25_SwitchStatement;

public class browser {
    public static void main(String[] args) {

        String browser = "firefox";
        String result  = " ";
        switch (browser){
            case "chrome":
                result="chrome is selected";
                break;
            case "firefox":
                result="firefox is selected";
                break;
            case "opera":
                result="opera is selected";
                break;
            case "safari":
                result="safari is selected";
                break;
            case "edge":
                result="edge is selected";
                break;
            default:
                result="invalid";
        }
        System.out.println(result);
    }
}
/*
  write a program that can display the selected browser
3.1  declare a String variable called browserName
3.2  Assume that the valid browsers are: chrome, firefox,
opera, safari, edge
3.3 if the browser name does not match with the valid
browsers' names, out put should be: Invalid Browser
Do Not use if statement or ternary
 */