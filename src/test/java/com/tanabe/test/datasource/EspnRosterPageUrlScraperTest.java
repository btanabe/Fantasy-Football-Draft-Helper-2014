package com.tanabe.test.datasource;

import com.tanabe.ffbdh.datasource.EspnTeamPageUrlScraper;
import com.tanabe.ffbdh.nfl.team.NflTeam;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.LinkedHashMap;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

/**
 * Created by Brian on 6/28/14.
 */
public class EspnRosterPageUrlScraperTest extends EspnTeamPageUrlScraper {
    private static LinkedHashMap<NflTeam, String> teamRosterPageUrls;

    @BeforeClass
    public static void setUp(){
        try {
            teamRosterPageUrls = scrapeForPageUrls();
        } catch(IOException ex){
            ex.printStackTrace();
            fail(String.format("Failed to get Document for url=[%s]", baseUrl));
        }
    }

    // Test completeness:
    @Test
    public void testAllTeamsHaveRosterPageUrls(){
        assertEquals(32, teamRosterPageUrls.size());
    }

    // First team:
    @Test
    public void testFirstTeamRosterPageUrlScraping(){
        final String firstTeamGoldUrl = "http://espn.go.com/nfl/team/roster/_/name/buf/buffalo-bills";
        String firstTeamUrl = teamRosterPageUrls.get(NflTeam.BILLS);
        assertEquals(firstTeamGoldUrl, firstTeamUrl);
    }

    // Random team:
    @Test
    public void testBearsRosterPageUrlScraping(){
        final String bearsGoldUrl = "http://espn.go.com/nfl/team/roster/_/name/chi/chicago-bears";
        String bearsUrl = teamRosterPageUrls.get(NflTeam.BEARS);
        assertEquals(bearsGoldUrl, bearsUrl);
    }

    // Random team:
    @Test
    public void testBroncosRosterPageUrlScraping(){
        final String broncosGoldUrl = "http://espn.go.com/nfl/team/roster/_/name/den/denver-broncos";
        String broncosUrl = teamRosterPageUrls.get(NflTeam.BRONCOS);
        assertEquals(broncosGoldUrl, broncosUrl);
    }

    // Last team:
    @Test
    public void testLastTeamROsterPageUrlScraping(){
        final String lastTeamGoldUrl = "http://espn.go.com/nfl/team/roster/_/name/tb/tampa-bay-buccaneers";
        String lastTeamUrl = teamRosterPageUrls.get(NflTeam.BUCCANEERS);
        assertEquals(lastTeamGoldUrl, lastTeamUrl);
    }
}
