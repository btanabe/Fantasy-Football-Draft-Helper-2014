package com.tanabe.ffbdh.datasource;

import com.tanabe.ffbdh.nfl.team.NflTeam;
import com.tanabe.ffbdh.nfl.team.NflTeamFactory;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.LinkedHashMap;

/**
 * Created by Brian on 6/28/14.
 */
public class EspnTeamPageUrlScraper extends WebScraper {
    protected static final String baseUrl = "http://espn.go.com/nfl/players";


    public static LinkedHashMap<NflTeam, String> scrapeForPageUrls() throws IOException {
        return scrapeForPageUrlsWorker();
    }

        protected static LinkedHashMap<NflTeam, String> scrapeForPageUrlsWorker() throws IOException {
            LinkedHashMap<NflTeam, String> teamRosterPageUrls = new LinkedHashMap<NflTeam, String>(32);

            Document page = getDocument(baseUrl);
            Elements teamElements = page.select("div#my-players-table").select("a[href^=/nfl/team/roster/_/name/]");
            for(Element teamElement : teamElements){
                NflTeam nflTeam = NflTeamFactory.whatTeam(teamElement.text());
                String teamUrl = "http://espn.go.com" + teamElement.attr("href");

                teamRosterPageUrls.put(nflTeam, teamUrl);
            }

            return teamRosterPageUrls;
        }
}
