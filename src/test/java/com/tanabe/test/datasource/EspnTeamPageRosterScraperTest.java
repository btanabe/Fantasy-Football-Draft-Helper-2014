package com.tanabe.test.datasource;

import com.tanabe.ffbdh.datasource.EspnTeamPageRosterScraper;
import com.tanabe.ffbdh.nfl.team.NflTeam;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.fail;

/**
 * Created by Brian on 6/28/14.
 */
public class EspnTeamPageRosterScraperTest extends EspnTeamPageRosterScraper {

    public EspnTeamPageRosterScraperTest() {
        super(NflTeam.BRONCOS, "http://espn.go.com/nfl/team/roster/_/name/den/denver-broncos");

        try {
            scrapeForRosterInfo();
        } catch(IOException ex){
            ex.printStackTrace();
            fail("EspnTeamPageRosterScraperTest failed to grab the page for the Broncos");
        }
    }

    @Test
    public void didEspnTeamPageRosterScraperGetEnoughPlayers(){

    }
}
