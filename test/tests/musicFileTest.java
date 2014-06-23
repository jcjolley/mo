/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tests;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mo.MusicFile;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.TagException;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Joshua
 */
public class musicFileTest {
    String filename;
    File f;
    AudioFile af;
    MusicFile mf;
    public musicFileTest() {
    
        filename = "C:\\Users\\Joshua\\Music\\seattle.mp3";
        f = new File(filename);
        try {
            af = AudioFileIO.read(f);
        } catch (CannotReadException | IOException | TagException | ReadOnlyFileException | InvalidAudioFrameException ex) {
            Logger.getLogger(musicFileTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        mf = new MusicFile(af);
    
    }
    
    @Test
    public void musicFileNameTest() {
        mf.setArtist("test");
        Assert.assertEquals(mf.getArtist(), "test");
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}