package com.plivo.dao;

import com.plivo.exception.ContactDaoException;
import com.plivo.model.GetResponse;

public interface ContactBookDao {

    boolean create(String email, String name, String info) throws ContactDaoException;

    GetResponse get(String email, String name, int pageNumber) throws ContactDaoException;

    boolean delete(String email) throws ContactDaoException;

    boolean update(String email, String name, String info) throws ContactDaoException;
}
