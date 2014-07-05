/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tests;

import mo.Model;
import mo.MusicCollector;
import mo.MusicFile;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class musicCollectorTest {
    
    public musicCollectorTest() {
    }

    MusicCollector mc = new MusicCollector();
    String path = "C:\\Arioch\\ProgProj\\Java\\mo\\";
    Model mo = Model.getInstance();
    
    @Test
    public void searchCompTest() {
        MusicFile mf = new MusicFile("music\\seattle.mp3");
        mc.searchComp(path);
        Assert.assertEquals(mo.getList().contains(mf), true);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
