package com.tanabe.test.helpers;

import com.tanabe.ffbdh.gui.helpers.PrettyPrinter;
import com.tanabe.ffbdh.nfl.player.NflPlayerBiography;
import org.joda.time.DateTime;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Brian on 6/28/14.
 */
public class PrettyPrinterTest extends PrettyPrinter {

    @Test
    public void testPrintHeightFiveFootFive() {
        String goldValue = "5'5\"";
        String valueFromFunction = prettyPrintHeightInInches(65.0);
        assertEquals(goldValue, valueFromFunction);
    }

    @Test
    public void testPrintHeightSixFootEleven() {
        String goldValue = "6'11\"";
        String valueFromFunction = prettyPrintHeightInInches(83.0);
        assertEquals(goldValue, valueFromFunction);
    }

    @Test
    public void testPrintHeightSixFoot() {
        String goldValue = "6'0\"";
        String valueFromFunction = prettyPrintHeightInInches(72);
        assertEquals(goldValue, valueFromFunction);
    }

    @Test
    public void testPlayerIdCreation() {
        String goldValue = "19890320BRIANTANABE";
        String valueFromFunction = NflPlayerBiography.generatePlayerId("Brian Tanabe", new DateTime(1989, 3, 20, 0, 0, 0));
        assertEquals(goldValue, valueFromFunction);
    }
}
