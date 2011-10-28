package controllers;

import play.mvc.Controller;

public class Home extends Controller 
{
    public static void index() {
        System.out.println("test");
        render();
    }
}
