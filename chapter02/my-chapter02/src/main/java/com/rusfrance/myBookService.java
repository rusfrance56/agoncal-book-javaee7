package com.rusfrance;

import javax.inject.Inject;

@myLoggable
public class myBookService {

    @Inject @myThirteen
    private myNumberGenerator myNumberGenerator;

    public myBook createBook(String name, String desc, Float price) {
        myBook myBook = new myBook(name, desc, price);
        myBook.setNumber(myNumberGenerator.generateNumber());
        return myBook;
    }
}
