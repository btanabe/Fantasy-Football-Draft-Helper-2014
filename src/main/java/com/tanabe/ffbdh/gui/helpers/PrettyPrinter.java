package com.tanabe.ffbdh.gui.helpers;

import com.tanabe.ffbdh.nfl.position.Position;

/**
 * Created by Brian on 6/28/14.
 */
public class PrettyPrinter {

    public static String prettyPrintHeightInInches(double heightInInches) {
        int feet = (int) heightInInches / 12;
        int inches = (int) heightInInches % 12;

        return String.format("%d'%d\"", feet, inches);
    }

    public static String prettyPrintAbbreviationPositionName(Position position) {
        String stringRepresentation = "UNKNOWN";
        switch (position) {
            case QUARTERBACK:
                stringRepresentation = "QB";
                break;
            case RUNNING_BACK:
                stringRepresentation = "RB";
                break;
            case WIDE_RECEIVER:
                stringRepresentation = "WR";
                break;
            case TIGHT_END:
                stringRepresentation = "TE";
                break;
            case KICKER:
                stringRepresentation = "K";
                break;
            case DEFENSE:
                stringRepresentation = "D/ST";
                break;
            default:
                stringRepresentation = "UNKNOWN";
                break;
        }

        return stringRepresentation;

    }

    public static String prettyPrintFullPositionName(Position position) {
        String stringRepresentation = "UNKNOWN";
        switch (position) {
            case QUARTERBACK:
                stringRepresentation = "Quarterback";
                break;
            case RUNNING_BACK:
                stringRepresentation = "Running Back";
                break;
            case WIDE_RECEIVER:
                stringRepresentation = "Wide Receiver";
                break;
            case TIGHT_END:
                stringRepresentation = "Tight End";
                break;
            case KICKER:
                stringRepresentation = "Kicker";
                break;
            case DEFENSE:
                stringRepresentation = "Defense";
                break;
            default:
                stringRepresentation = "UNKNOWN";
                break;
        }

        return stringRepresentation;

    }
}
