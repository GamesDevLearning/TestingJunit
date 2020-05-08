package com.junit5.testing;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

/** @author coding_java */
@ExtendWith(MockitoExtension.class)
public class ServiceTest {
        
    @Mock
    Repository repository;
    @InjectMocks
    Service service;
    public ServiceTest() {
    }
    
    @Test
    public void testGetStuffWithLengthLessThanTen() {
        System.out.println("getStuffWithLengthLessThanTen");
        Repository repo = new Repository();
        Service instance = new Service(repo);
        List<String> expResult = Arrays.asList("One", "Two", "Three");
        List<String> result = instance.getStuffWithLengthLessThanTen();
        assertEquals(expResult, result);
    }    
    @Test
    public void testSuccess() { // Setup mock scenario
        try {
            when(repository.getStuff("")).thenReturn(Arrays.asList("A", "B"));
        } catch (SQLException e) {
            e.printStackTrace();
        } // Execute the service that uses the mocked repository
        List<String> stuff = service.getStuffWithLengthLessThanTen();
        Assertions.assertNotNull(stuff);
        Assertions.assertEquals(2, stuff.size());
    }
}
