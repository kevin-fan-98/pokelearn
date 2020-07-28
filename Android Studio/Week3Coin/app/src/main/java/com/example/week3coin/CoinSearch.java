package com.example.week3coin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CoinSearch extends AppCompatActivity {
    private TextView type,symbol,value,change1, change24, change7, market, volume;
    private ImageButton google;

    String[] myArray = {"Apple", "Banana", "Orange", "Grapes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin_search);
        type = (TextView)findViewById(R.id.type);
        symbol = (TextView)findViewById(R.id.symbol);
        value = (TextView)findViewById(R.id.valueA);
        change1 = (TextView)findViewById(R.id.change1A);
        change24 = (TextView)findViewById(R.id.change24A);
        change7 = (TextView)findViewById(R.id.change7A);
        market = (TextView)findViewById(R.id.marketA);
        volume = (TextView)findViewById(R.id.volumeA);

        //Coin test = new Coin();

        //System.out.println(test.getName());
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        final String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String lowermsg = message.toLowerCase();

        Coin gay = new Coin();

        ArrayList<Coin> coins2 = new ArrayList<>();
        coins2 = gay.getCoins();

        //if(message.equals())
        int count = 0;
        int number = 0;

        //Coin pokemon = coins2.get(count);

        for(count = 0; count<9; count++){
            Coin pokemon = coins2.get(count);
            if(lowermsg.equals(pokemon.getName().toLowerCase())){
                break;
            }
            if(lowermsg.equals(pokemon.getSymbol().toLowerCase())){
                break;
            }
            number++;
        }

        Coin enter = coins2.get(number);

        type.setText(enter.getName());
        symbol.setText(enter.getSymbol());
        value.setText(String.format("%.2f", enter.getValue()));
        change1.setText(String.format("%.2f", enter.getChange1h()));
        change24.setText(String.format("%.2f", enter.getChange24h()));
        change7.setText(String.format("%.2f", enter.getChange7d()));
        market.setText(String.format("%.2f", enter.getMarketcap()));
        volume.setText(String.format("%.2f", enter.getVolume()));


        google = (ImageButton) findViewById(R.id.google);

        google.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/#q=" + message)));
            }

        });


    }
}
