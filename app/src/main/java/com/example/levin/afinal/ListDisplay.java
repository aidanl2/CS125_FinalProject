package com.example.levin.afinal;

import android.app.Activity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListDisplay extends Activity {
    // Array of strings...
    String[] teamArray = {"Select a team","Atlanta Hawks","Boston Celtics","Brooklyn Nets",
            "Charlotte Hornets","Chicago Bulls","Cleveland Cavaliers","Dallas Mavericks",
            "Denver Nuggets","Detroit Pistons","Golden State Warriors","Houston Rockets",
            "Indiana Pacers","Los Angeles Clippers","Los Angeles Lakers","Memphis Grizzlies",
            "Miami Heat","Milwaukee Bucks","Minnesota Timberwolves","New Orleans Pelicans",
            "New York Knicks","Oklahoma City Thunder","Orlando Magic","Philadelphia 76ers",
            "Phoenix Suns","Portland Trail Blazers","Sacramento Kings","San Antonio Spurs",
            "Toronto Raptors","Utah Jazz",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, teamArray);

        ListView listView = (ListView) findViewById(R.id.team_list);
        listView.setAdapter(adapter);
    }
}