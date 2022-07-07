package com.syntax.class25;

public interface WebDriver {
    /*
    Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(), findElement(). Create 2 classes that implements WebDriver
    interface: ChromeDriver and FirefoxDriver.
     */
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class chromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("open");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("expand");
    }

    @Override
    public void findElement() {
        System.out.println("find");
    }
}
class FireFoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("open1");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close1");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("expand1");
    }

    @Override
    public void findElement() {
        System.out.println("find1");
    }

    public static void main(String[] args) {
        WebDriver driver=new chromeDriver();
        driver.openBrowser();
        driver.closeBrowser();
        driver.maximizeWindow();
        driver.findElement();
        WebDriver drivers=new FireFoxDriver();
        drivers.openBrowser();
        drivers.closeBrowser();
        drivers.maximizeWindow();
        drivers.findElement();
    }
}
