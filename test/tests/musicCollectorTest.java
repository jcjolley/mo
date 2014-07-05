/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tests;

import javafx.collections.ObservableList;
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
    String path = "music\\";
    Model model = Model.getInstance();
    
    @Test
    public void searchCompTest() {
        MusicFile mf = new MusicFile("music\\seattle.mp3");
        mc.searchComp(path);
        ObservableList<MusicFile> ol = model.getList();
        int numFiles = 0;
        for (MusicFile file : ol) {
            System.out.println("File number: " + ++numFiles);
            System.out.println("Music File path: " + mf.getPath());
            System.out.println("Music File title: " + mf.getTitle() + "\n");
            
        }
        Assert.assertEquals(ol.contains(mf), true);
    }
}
