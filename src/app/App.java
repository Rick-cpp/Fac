package app;

import app.pages.Routes;
import app.util.core.MainLoop;

public class App {
    public static void main(String[] args) { MainLoop.init(new Routes().onReady()::render); }
}
