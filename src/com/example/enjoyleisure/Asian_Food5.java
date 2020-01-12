package com.example.enjoyleisure;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Asian_Food5 extends Activity{
	Button previous,home;
	TextView asian_food5_title,asian_food5_txt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.asian_food5);
		
		previous=(Button) findViewById(R.id.asian_food5_previous_btn);
		home=(Button) findViewById(R.id.asian_food5_home_btn);
		

		asian_food5_title=(TextView) findViewById(R.id.asian_food5_title);
		asian_food5_txt=(TextView) findViewById(R.id.asian_food5_txt);
		
		asian_food5_title.setTypeface(Typeface.SERIF);
		asian_food5_txt.setTypeface(Typeface.SERIF);
		
		Typeface myTypeface=Typeface.createFromAsset(getAssets(), "fonts/ZAWGYIONE.TTF");
		
		asian_food5_title.setTypeface(myTypeface);
		asian_food5_txt.setTypeface(myTypeface);
		
		
		
		
		previous.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent previous=new Intent(Asian_Food5.this,Asian_Food4.class);
				startActivity(previous);
			}
		});
		
		home.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent home=new Intent(Asian_Food5.this,Cooking.class);
				startActivity(home);
			}
		});
		
	
	}

}
