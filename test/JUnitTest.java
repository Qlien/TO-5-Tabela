/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tabele.Tabele;

/**
 *
 * @author Michał
 */
public class JUnitTest {
    
    public JUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void test1() {
        Tabele t = new Tabele();
        assertTrue(4096 > t.numberOfCells(75, 75));
    }
    
    @Test
    public void test2() {
        Tabele t = new Tabele();
        assertTrue(3600 == t.numberOfCells(60.4444, 60.4444));
    }
    
    @Test
    public void test3() {
        Tabele t = new Tabele();
        assertTrue(0 < t.numberOfCells(-5, -5.3453453));
    }
    
    @Test
    public void test4() {
        Tabele t = new Tabele();
        assertTrue(4096 > t.numberOfCells(700, -5.3453453));
    }
    
    @Test
    public void test5() {
        Tabele t = new Tabele();
        assertTrue(4096 > t.numberOfCells(-700, 5.3453453));
    }
}
