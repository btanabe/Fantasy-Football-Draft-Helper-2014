package com.tanabe.test.datasource;

import com.tanabe.ffbdh.datasource.EspnTeamPageRosterScraper;
import com.tanabe.ffbdh.nfl.team.NflTeam;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

/**
 * Created by Brian on 6/28/14.
 */
public class EspnTeamPageRosterScraperTest extends EspnTeamPageRosterScraper {

    public EspnTeamPageRosterScraperTest() {
        super(NflTeam.BRONCOS, "http://espn.go.com/nfl/team/roster/_/name/den/denver-broncos");

        try {
            scrapeForRosterInfo();
        } catch (Exception ex) {
            ex.printStackTrace();
            fail("EspnTeamPageRosterScraperTest failed to grab the page for the Broncos");
        }
    }

    @Test
    public void didEspnTeamPageRosterScraperGetEnoughPlayers() {
        int playersParsed = players.size();
        assertEquals(true, playersParsed == 30);
    }
}
