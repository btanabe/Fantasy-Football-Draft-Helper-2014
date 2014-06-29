package com.tanabe.ffbdh.datasource;

import com.tanabe.ffbdh.nfl.player.NflPlayerBiography;
import com.tanabe.ffbdh.nfl.player.helpers.PlayerHeightHelper;
import com.tanabe.ffbdh.nfl.position.Position;
import com.tanabe.ffbdh.nfl.position.PositionFactory;
import com.tanabe.ffbdh.nfl.team.NflTeam;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

/**
 * Created by Brian on 6/28/14.
 */
public class EspnTeamPageRosterScraper extends WebScraper {
    protected NflTeam nflTeam;
    protected String url;

    protected ArrayList<NflPlayerBiography> players = new ArrayList<NflPlayerBiography>();

    public EspnTeamPageRosterScraper(NflTeam nflTeam, String url){
        this.nflTeam = nflTeam;
        this.url = url;
    }

    public void scrapeForRosterInfo() throws Exception {
        Document teamPageDocument = getDocument(url);
        Elements playerElements = teamPageDocument.select("tr:has(td:matches(QB)), tr:has(td:matches(RB)), tr:has(td:matches(WR)), tr:has(td:matches(TE)), tr:has(td:matches(PK))");
        for (Element playerToCreate : playerElements) {
            NflPlayerBiography playerToAdd = createPlayerFromRosterPage(playerToCreate);
            players.add(playerToAdd);
        }
    }

    private NflPlayerBiography createPlayerFromRosterPage(Element playerElement) throws Exception {
        String name = playerElement.select("a").text();
        Position position = PositionFactory.whatPosition(playerElement.select("td").get(2).text());
        int heightInInches = PlayerHeightHelper.getPlayerHeightInInInchesFromFeetDashInches(playerElement.select("td").get(4).text());
        int weightInPounds = Integer.parseInt(playerElement.select("td").get(5).text());
        int experience = playerElement.select("td").get(6).text().equalsIgnoreCase("r") ? 0 : Integer.parseInt(playerElement.select("td").get(6).text());
        String college = playerElement.select("td").get(7).text();
        DateTime birthday = getBirthdayFromPlayerProfilePage(playerElement.select("a[href]").attr("href"));

        return new NflPlayerBiography(NflPlayerBiography.generatePlayerId(name, birthday), name, nflTeam, position, birthday, heightInInches, weightInPounds, college, experience);
    }

    private DateTime getBirthdayFromPlayerProfilePage(String url) throws Exception {
        Document playerPage = getDocument(url);
        String birthdayString = playerPage.select("li:contains(born)").text().replace("Born", "").replace(",", "").replaceAll("\\(([^\\)]+)\\)", "").replaceAll("in.*", "").trim();

        return birthdayString.isEmpty() ? DateTime.now() : DateTimeFormat.forPattern("MMM dd yyyy").parseDateTime(birthdayString);
    }

    public ArrayList<NflPlayerBiography> getPlayers() {
        return players;
    }
}
