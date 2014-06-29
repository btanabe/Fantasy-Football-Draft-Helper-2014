package com.tanabe.ffbdh.datasource;

import com.tanabe.ffbdh.nfl.player.NflPlayerBiography;
import com.tanabe.ffbdh.nfl.team.NflTeam;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Brian on 6/28/14.
 */
public class EspnTeamPageRosterScraper extends WebScraper {
    protected NflTeam nflTeam;
    protected String url;

    public EspnTeamPageRosterScraper(NflTeam nflTeam, String url){
        this.nflTeam = nflTeam;
        this.url = url;
    }

    public void scrapeForRosterInfo() throws IOException {
        Document teamPageDocument = getDocument(url);
        Elements playerElements = teamPageDocument.select("tr[class^=oddrow player], tr[class^=evenrow player]");

    }

    private NflPlayerBiography createPlayerFromRosterPage(Element playerElement){

        return null;
    }
}
