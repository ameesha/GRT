package com.example.grt;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
/*import com.google.android.gms.maps;
import com.google.android.gms.maps.model;*/
import android.app.Activity;
import android.os.Bundle;
/*
public class MapPane extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);

        // Get a handle to the Map Fragment
        GoogleMap map = ((MapFragment) getFragmentManager()
                .findFragmentById(R.id.map)).getMap();

        LatLng sydney = new LatLng(-33.867, 151.206);

        map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 13));

        map.addMarker(new MarkerOptions()
                .title("Sydney")
                .snippet("The most populous city in Australia.")
                .position(sydney));
    }
}*/


public class MainActivity extends Activity {
	
	//global variables
	// for testing
	public final static String EXTRA_MESSAGE = "PS AMEESHA IS DA BOMB";
	
	AutoCompleteTextView route;
	String[] routeArray = {"200 to Conestoga Mall", "200 to Ainslie Terminal", "201 to Conestoga Mall", "201 to Forest Glen Plaza",
			"202 to Boardwalk", "202 to Conestoga Mall", "9 to Conestoga Mall", "9 to University of Waterloo (UW)", "9 Late Night Loop",
			"13 to University of Waterloo (UW)", "13 to Boardwalk", "31 to Sundew", "31 to University of Waterloo (UW)", 
			"7E to Fairview Mall", "7E to University of Waterloo (UW)", "7C to Fairview Mall (no UW)", "7C to Conestoga Mall (no UW)",
			"7D to University of Waterloo (UW)", "7D to Fairview Mall"};
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        route = (AutoCompleteTextView) findViewById(R.id.route_wanted);
        ArrayAdapter<String> routeAdapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, routeArray);
        route.setThreshold(1);
        route.setAdapter(routeAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    /*public void forBryan(View view){
    	Intent intent = new Intent(this, DisplayMessage.class);
    	
    	EditText text = (EditText) findViewById(R.id.test_text);
    	String name = text.getText().toString();
    	
    	String message = "You suck " + name + ". I said I don't care dumbass" ;
    	intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    }*/
    
    /*
    // Called when someone presses the button
    public void doSomething(View view){
    	Intent intent = new Intent(this, DisplayMessageActivity.class);
    	EditText text = (EditText) findViewById(R.id.test_text);
    	String message = text.getText().toString();
    	intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    }*/
    
}