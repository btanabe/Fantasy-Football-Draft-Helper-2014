package com.tanabe.ffbdh.nfl.player.helpers;

/**
 * Created by Brian on 6/28/14.
 */
public class PlayerHeightHelper {

    public static int getPlayerHeightInInInchesFromFeetDashInches(String heightString) {
        String[] feetAndInches = heightString.split("-");
        int feet = Integer.parseInt(feetAndInches[0].trim());
        int inches = Integer.parseInt(feetAndInches[1].trim());

        return (feet * 12) + inches;
    }
}
