package com.example.enjoyleisure;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Thai_Food2 extends Activity{
	Button previous,home,next;
	TextView thai_food2_title,thai_food2_txt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thai_food2);
		
		previous=(Button) findViewById(R.id.thai_food2_previous_btn);
		home=(Button) findViewById(R.id.thai_food2_home_btn);
		next=(Button) findViewById(R.id.thai_food2_next_btn);
		

		thai_food2_title=(TextView) findViewById(R.id.thai_food2_title);
		thai_food2_txt=(TextView) findViewById(R.id.thai_food2_txt);
		
		thai_food2_title.setTypeface(Typeface.SERIF);
		thai_food2_txt.setTypeface(Typeface.SERIF);
		
		Typeface myTypeface=Typeface.createFromAsset(getAssets(), "fonts/ZAWGYIONE.TTF");
		
		thai_food2_title.setTypeface(myTypeface);
		thai_food2_txt.setTypeface(myTypeface);
		
		
		
		previous.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent previous=new Intent(Thai_Food2.this,Thai_Food1.class);
				startActivity(previous);
			}
		});
		
		home.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent home=new Intent(Thai_Food2.this,Cooking.class);
				startActivity(home);
				
			}
		});
		
		next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent next=new Intent(Thai_Food2.this,Thai_Food3.class);
				startActivity(next);
			}
		});
	}
}
