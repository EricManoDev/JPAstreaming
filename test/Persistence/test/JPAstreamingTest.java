/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.test;

import javax.persistence.Persistence;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class JPAstreamingTest {
    
   @Test
   public void Test(){
      
       Persistence.createEntityManagerFactory("PU");
       
   }
         
    
}
