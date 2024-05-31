// DaoFactory.java

package com.becoder.dao;

public class DaoFactory {

    private static final DaoFactory instance = new DaoFactory();

    private DaoFactory() {}

    public static DaoFactory getInstance() {
        return instance;
    }

    public UserDao getUserDao() {
        return new UserDaoImpl();
    }

    public WriterDao getWriterDao() {
        return new WriterDaoImpl();
    }
}
