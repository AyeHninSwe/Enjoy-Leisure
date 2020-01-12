package com.example.enjoyleisure;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Myanmar_Food10 extends Activity {

	Button previous,home;
	TextView myanmar_food10_txt,myanmar_food10_title;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myanmar_food10);
		
		previous=(Button) findViewById(R.id.myanmar_food10_previous_btn);
		home=(Button) findViewById(R.id.myanmar_food10_home_btn);
		
		myanmar_food10_title=(TextView) findViewById(R.id.myanmar_food10_title);
		myanmar_food10_txt=(TextView) findViewById(R.id.myanmar_food10_txt);
		
		myanmar_food10_title.setTypeface(Typeface.SERIF);
		myanmar_food10_txt.setTypeface(Typeface.SERIF);
		
		Typeface myTypeface=Typeface.createFromAsset(getAssets(), "fonts/ZAWGYIONE.TTF");
		
		myanmar_food10_title.setTypeface(myTypeface);
		myanmar_food10_txt.setTypeface(myTypeface);
		
		
		previous.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent previous=new Intent(Myanmar_Food10.this,Myanmar_Food9.class);
				startActivity(previous);
			}
		});
		
		home.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent home=new Intent(Myanmar_Food10.this,Cooking.class);
				startActivity(home);
			}
		});
		
	
	}
	




}
