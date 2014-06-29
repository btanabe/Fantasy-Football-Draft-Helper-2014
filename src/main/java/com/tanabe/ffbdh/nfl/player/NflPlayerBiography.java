package com.tanabe.ffbdh.nfl.player;

import com.tanabe.ffbdh.gui.helpers.PrettyPrinter;
import com.tanabe.ffbdh.nfl.position.Position;
import com.tanabe.ffbdh.nfl.team.NflTeam;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Brian on 6/28/14.
 */
@Document
public class NflPlayerBiography {
    @Id
    protected String id;
    protected String playerName;
    protected NflTeam currentTeam;
    protected Position position;
    protected DateTime birthday;
    protected int heightInInches;
    protected int weightInPounds;
    protected String college;

    @Transient
    protected int experience;

    public NflPlayerBiography(String playerName, NflTeam currentTeam, Position position, DateTime birthday, int heightInInches, int weightInPounds, String college, int experience) {
        this.id = generatePlayerId(playerName, birthday);
        this.playerName = playerName;
        this.currentTeam = currentTeam;
        this.position = position;
        this.birthday = birthday;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
        this.college = college;
        this.experience = experience;
    }

    public NflPlayerBiography(String id, String playerName, NflTeam currentTeam, Position position, DateTime birthday, int heightInInches, int weightInPounds, String college, int experience) {
        this.id = id;
        this.playerName = playerName;
        this.currentTeam = currentTeam;
        this.position = position;
        this.birthday = birthday;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
        this.college = college;
        this.experience = experience;
    }

    public static String generatePlayerId(String playerName, DateTime birthday) {
        return String.format("%s%s", birthday.toString("yyyyMMdd"), playerName.toUpperCase().replace(" ", "").replace(".", ""));
    }

    public boolean isOffensivePlayer() {
        return !(position == Position.DEFENSE || position == Position.UNKNOWN);
    }

    @Override
    public String toString() {
        return String.format("id=[%s], playerName=[%s], currentTeam=[%s], position=[%s], birthday=[%s], height=[%s], weightInPounds=[%d], college=[%s], experience=[%d]", id, playerName, currentTeam.toString(), position.toString(), birthday.toString("MM/dd/yyyy"), PrettyPrinter.prettyPrintHeightInInches(heightInInches), weightInPounds, college, experience);
    }
}
