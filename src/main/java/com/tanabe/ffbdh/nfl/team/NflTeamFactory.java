package com.tanabe.ffbdh.nfl.team;

/**
 * Created by Brian on 6/28/14.
 */
public class NflTeamFactory {

    public static NflTeam whatTeam(String teamName){
        if(teamName.contains("Buffalo") || teamName.contains("Bills") || teamName.contains("BUF"))
            return NflTeam.BILLS;
        else if(teamName.contains("Miami") || teamName.contains("Dolphins") || teamName.contains("MIA"))
            return NflTeam.DOLPHINS;
        else if(teamName.contains("New England") || teamName.contains("Patriots") || teamName.contains("NE"))
            return NflTeam.PATRIOTS;
        else if(teamName.contains("New York Jets") || teamName.contains("Jets") || teamName.contains("NYJ"))
            return NflTeam.JETS;
        else if(teamName.contains("Baltimore") || teamName.contains("Ravens") || teamName.contains("BAL"))
            return NflTeam.RAVENS;
        else if(teamName.contains("Cincinnatti") || teamName.contains("Bengals") || teamName.contains("CIN"))
            return NflTeam.BENGALS;
        else if(teamName.contains("Cleveland") || teamName.contains("Browns") || teamName.contains("CLE"))
            return NflTeam.BROWNS;
        else if(teamName.contains("Pittsburgh") || teamName.contains("Steelers") || teamName.contains("PIT"))
            return NflTeam.STEELERS;
        else if(teamName.contains("Houston") || teamName.contains("Texans") || teamName.contains("HOU"))
            return NflTeam.TEXANS;
        else if(teamName.contains("Indianapolis") || teamName.contains("Colts") || teamName.contains("IND"))
            return NflTeam.COLTS;
        else if(teamName.contains("Jacksonville") || teamName.contains("Jaguars") || teamName.contains("JAX") || teamName.contains("JAG"))
            return NflTeam.JAGUARS;
        else if(teamName.contains("Tennessee") || teamName.contains("Titans") || teamName.contains("TEN"))
            return NflTeam.TITANS;
        else if(teamName.contains("Denver") || teamName.contains("Broncos") || teamName.contains("DEN"))
            return NflTeam.BRONCOS;
        else if(teamName.contains("Kansas City") || teamName.contains("Chiefs") || teamName.contains("KC"))
            return NflTeam.CHIEFS;
        else if(teamName.contains("Oakland") || teamName.contains("Raiders") || teamName.contains("OAK"))
            return NflTeam.RAIDERS;
        else if(teamName.contains("San Diago") || teamName.contains("Chargers") || teamName.contains("SD"))
            return NflTeam.CHARGERS;
        else if(teamName.contains("Dallas") || teamName.contains("Cowboys") || teamName.contains("DAL"))
            return NflTeam.COWBOYS;
        else if(teamName.contains("New York Giants") || teamName.contains("Giants") || teamName.contains("NYG"))
            return NflTeam.GIANTS;
        else if(teamName.contains("Philadelphia") || teamName.contains("Eagles") || teamName.contains("PHI"))
            return NflTeam.EAGLES;
        else if(teamName.contains("Washington") || teamName.contains("Redskins") || teamName.contains("WAS"))
            return NflTeam.REDSKINS;
        else if(teamName.contains("Chicago") || teamName.contains("Bears") || teamName.contains("CHI"))
            return NflTeam.BEARS;
        else if(teamName.contains("Detroit") || teamName.contains("Lions") || teamName.contains("DET"))
            return NflTeam.LIONS;
        else if(teamName.contains("Green Bay") || teamName.contains("Packers") || teamName.contains("GB"))
            return NflTeam.PACKERS;
        else if(teamName.contains("Minnesota") || teamName.contains("Vikings") || teamName.contains("MIN"))
            return NflTeam.VIKINGS;
        else if(teamName.contains("Atlanta") || teamName.contains("Falcons") || teamName.contains("ATL"))
            return NflTeam.FALCONS;
        else if(teamName.contains("Carolina") || teamName.contains("Panthers") || teamName.contains("CAR"))
            return NflTeam.PANTHERS;
        else if(teamName.contains("New Orleans") || teamName.contains("Saints") || teamName.contains("NO"))
            return NflTeam.SAINTS;
        else if(teamName.contains("Tampa Bay") || teamName.contains("Buccaneers") || teamName.contains("TB"))
            return NflTeam.BUCCANEERS;
        else if(teamName.contains("Arizona") || teamName.contains("Cardinals") || teamName.contains("ARI"))
            return NflTeam.CARDINALS;
        else if(teamName.contains("St. Louis") || teamName.contains("St Louis") || teamName.contains("Rams") || teamName.contains("STL"))
            return NflTeam.RAMS;
        else if(teamName.contains("San Francisco") || teamName.contains("49ers") || teamName.contains("SF"))
            return NflTeam.FORTYNINERS;
        else if(teamName.contains("Seattle") || teamName.contains("Seahawks") || teamName.contains("SEA"))
            return NflTeam.SEAHAWKS;
        else
            return NflTeam.UNKNOWN;
    }
}
