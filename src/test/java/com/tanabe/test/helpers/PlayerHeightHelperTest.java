package com.tanabe.test.helpers;

import com.tanabe.ffbdh.nfl.player.helpers.PlayerHeightHelper;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Brian on 6/28/14.
 */
public class PlayerHeightHelperTest extends PlayerHeightHelper {

    @Test
    public void testHeightConversion() {
        int goldValue = 75;
        int heightInInchesFromFunction = getPlayerHeightInInInchesFromFeetDashInches("6-3");
        assertEquals(goldValue, heightInInchesFromFunction);
    }

    @Test
    public void testHeightConversionWithSpaces() {
        int goldValue = 75;
        int heightInInchesFromFunction = getPlayerHeightInInInchesFromFeetDashInches("6 - 3");
        assertEquals(goldValue, heightInInchesFromFunction);
    }
}
