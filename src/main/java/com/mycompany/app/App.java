package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "GitHubActions";

    public App() {}

    public static void main(String[] args) {
        System.out.println("\n"+"hi");
        App myApp = new App();
        myApp.displaySomething ();


    }

    private final String getMessage() {
        return message;
    }
    public void displaySomething(){
        System.out.println(getMessage().toString());
        System.out.println("something is wrong");
    }

}
