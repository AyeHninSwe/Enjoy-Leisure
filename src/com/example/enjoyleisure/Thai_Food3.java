package com.example.enjoyleisure;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Thai_Food3 extends Activity{
	Button previous,home,next;
	TextView thai_food3_txt,thai_food3_title;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thai_food3);
		
		previous=(Button) findViewById(R.id.thai_food3_previous_btn);
		home=(Button) findViewById(R.id.thai_food3_home_btn);
		next=(Button) findViewById(R.id.thai_food3_next_btn);
		

		thai_food3_title=(TextView) findViewById(R.id.thai_food3_title);
		thai_food3_txt=(TextView) findViewById(R.id.thai_food3_txt);
		
		thai_food3_title.setTypeface(Typeface.SERIF);
		thai_food3_txt.setTypeface(Typeface.SERIF);
		
		Typeface myTypeface=Typeface.createFromAsset(getAssets(), "fonts/ZAWGYIONE.TTF");
		
		thai_food3_title.setTypeface(myTypeface);
		thai_food3_txt.setTypeface(myTypeface);
		
		
		previous.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent previous=new Intent(Thai_Food3.this,Thai_Food2.class);
				startActivity(previous);
			}
		});
		
		home.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent home=new Intent(Thai_Food3.this,Cooking.class);
				startActivity(home);
			}
		});
		
		next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent next=new Intent(Thai_Food3.this,Thai_Food4.class);
				startActivity(next);
			}
		});
	}
}
