/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.jekipes.app;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *   mvn -Dtest=ar.com.jekipes.app.MainTest test
 * @author juan kipes
 */
public class MainTest {

     @Test
     public void hello() {
     
         System.out.println("hello test");
         assertTrue(true);
     }
}
