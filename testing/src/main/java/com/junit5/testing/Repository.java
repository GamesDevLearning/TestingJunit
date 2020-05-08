package com.junit5.testing;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

/**
 * @author coding_java
 */
public class Repository {

    public List<String> getStuff(String imput) throws SQLException {
 
        // Return results
        return Arrays.asList("One", "Two", "Three");
      
    }

}




