package io.cucumber.skeleton;

import io.cucumber.java.en.Given;

public class StepDefinitions {
    @Given("I have cukes in my belly")
    public void I_have_cukes_in_my_belly() {
        try {
            System.out.println("Я выполняюсь потоком: "+Thread.currentThread().getId());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
    }


    @Given("browser is opened")
    public void openBrowser() {
        try {
            System.out.println("Я выполняюсь потоком: "+Thread.currentThread().getId());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
    }

    @Given("browser is closed")
    public void closeBrowser() {
        try {
            System.out.println("Я выполняюсь потоком: "+Thread.currentThread().getId());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
    }

    @Given("browser is opened for Tumba1")
    public void openBrowserForTumba1() {
        try {
            System.out.println("Я выполняюсь потоком: "+Thread.currentThread().getId());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
    }


    @Given("browser is closed for Tumba1")
    public void closeBrowserForTumba1() {
        try {
            System.out.println("Я выполняюсь потоком: "+Thread.currentThread().getId());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
    }


}
