/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class EntityManagerTest {
    
   @Test
   public void PersistTest(){
       
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
       EntityManager em = emf.createEntityManager();
   }
    
}
