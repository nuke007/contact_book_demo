package com.plivo.main;

import com.plivo.dao.ContactBookDao;
import com.plivo.dao.impl.ContactBookDaoImpl;
import com.plivo.exception.ContactDaoException;

public class MainClass {

    public static void main(String[] args) {
        ContactBookDao contactBookDao = new ContactBookDaoImpl("contact_book");
        try {
            contactBookDao.create("abc@gmail.com", "ABC_bigboy", "'no=8008008008");
        } catch (ContactDaoException e) {
            System.out.println("Got an exception while creating a record ");
            e.printStackTrace();
        }
    }
}
