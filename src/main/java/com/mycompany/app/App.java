package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "This for GitHubActions";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        System.out.println("messagedelivered");
    }

    private final String getMessage() {
        return message;
    }

}
