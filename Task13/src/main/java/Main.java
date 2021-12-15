/*
Create a function which adds spaces before every capital in a word. Uncapitalize
the whole string afterwards.
 capSpace("helloWorld") ➞ "hello world"
 capSpace("iLoveMyTeapot") ➞ "i love my teapot"
 capSpace("stayIndoors") ➞ "stay indoors"
Note: The first letter will stay uncapitalized.
 */

public class Main {
    public static void main(String[] args) {
        Spacer spacer = new Spacer();
        System.out.println("Result: " + spacer.capSpace("hello world"));
    }
}
