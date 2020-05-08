/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.junittest2.java;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Assertions;



/**
 *
 * @author 612591248
 */

@ExtendWith(MockitoExtension.class)
public class RecordDatabaseTest {
    @Mock
    Database1 database1;
    
    @InjectMocks
    RecordDatabase recordDatabase;

    public RecordDatabaseTest() {
    }
   

    /**
     * Test of save method, of class RecordDatabase.
     */
    @Test
    public void testSave() {
        when(database1.save2database("")).thenReturn(true);
       
       //RecordDatabase recordDatabase = mock(RecordDatabase.class);
      recordDatabase = new RecordDatabase();
       boolean saved = recordDatabase.save("temp.txt");
       Assertions.assertTrue(saved);
   
       
        
      
      
    }
    
}
