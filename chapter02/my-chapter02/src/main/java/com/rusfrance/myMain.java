package com.rusfrance;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class myMain {
    public static void main(String[] args) {

        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        myBookService bookService = container.instance().select(myBookService.class).get();

        myBook book = bookService.createBook("H2G2","Geeky scifi Book", 12.5f);

        System.out.println(book);

        weld.shutdown();
    }
}
