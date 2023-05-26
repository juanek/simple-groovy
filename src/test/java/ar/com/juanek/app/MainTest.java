/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.juanek.app;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *   mvn -Dtest=ar.com.juanek.app.MainTest test
 * @author juan kipes
 */
public class MainTest {

     @Test
     public void hello() {
     
         System.out.println("hello test");
         assertTrue(true);
     }
}
