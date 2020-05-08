package com.junittest2.java;

/**
 *
 * @author 612591248
 */
public class RecordDatabase {
    Database1 database;
    
    public boolean save(String save)
    {   
        boolean ret = false;
        database = new Database1();
        ret = database.save2database(save);
        System.out.println("saved in db main");
        return ret;
    }
}
