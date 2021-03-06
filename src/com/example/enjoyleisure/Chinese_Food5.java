package com.example.enjoyleisure;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Chinese_Food5 extends Activity {
	Button previous,home;
	TextView chinese_food5_title,chinese_food5_txt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chinese_food5);
		
		previous=(Button) findViewById(R.id.chinese_food5_previous_btn);
		home=(Button) findViewById(R.id.chinese_food5_home_btn);


		chinese_food5_title=(TextView) findViewById(R.id.chinese_food5_title);
		chinese_food5_txt=(TextView) findViewById(R.id.chinese_food5_txt);
		
		chinese_food5_title.setTypeface(Typeface.SERIF);
		chinese_food5_txt.setTypeface(Typeface.SERIF);
		
		Typeface myTypeface=Typeface.createFromAsset(getAssets(), "fonts/ZAWGYIONE.TTF");
		
		chinese_food5_title.setTypeface(myTypeface);
		chinese_food5_txt.setTypeface(myTypeface);
		
		
		
		
		
		previous.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent previous=new Intent(Chinese_Food5.this,Chinese_Food4.class);
				startActivity(previous);
			}
		});
		
		home.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent home=new Intent(Chinese_Food5.this,Cooking.class);
				startActivity(home);
			}
		});
		
	
	}
}
