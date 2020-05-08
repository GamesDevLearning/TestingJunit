package com.junit5.testing;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/** @author coding_java */
public class Service {
    private final Repository repository;
    public Service(Repository repository) {
        this.repository = repository;
    }
    public List<String> getStuffWithLengthLessThanTen() {
        try {
            
            List<String> someStuff = repository.getStuff("");
            
            System.out.println("YourStuff:"+someStuff.toString());
            
            return someStuff.stream()
                    .filter(stuff -> stuff.length() < 10)
                    .collect(Collectors.toList());
        } catch (SQLException e) {
            return Arrays.asList();
        }
    }

}




