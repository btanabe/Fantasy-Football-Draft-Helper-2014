package com.tanabe.ffbdh.nfl.player;

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
    protected String playerFirstName;
    protected String playerLastName;
    protected NflTeam currentTeam;
    protected DateTime birthday;
    protected double heightInInches;
    protected int weightInPounds;
    protected String college;

    @Transient
    protected int experience;

    public NflPlayerBiography(String id, String playerFirstName, String playerLastName, NflTeam currentTeam, DateTime birthday, double heightInInches, int weightInPounds, String college, int experience){
        this.id = id;
        this.playerFirstName = playerFirstName;
        this.playerLastName = playerFirstName;
        this.currentTeam = currentTeam;
        this.birthday = birthday;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
        this.college = college;
        this.experience = experience;
    }
}
