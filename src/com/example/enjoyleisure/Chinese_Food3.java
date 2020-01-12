package com.example.enjoyleisure;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Chinese_Food3 extends Activity{
	Button previous,home,next;
	TextView chinese_food3_title,chinese_food3_txt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chinese_food3);
		
		previous=(Button) findViewById(R.id.chinese_food3_previous_btn);
		home=(Button) findViewById(R.id.chinese_food3_home_btn);
		next=(Button) findViewById(R.id.chinese_food3_next_btn);
		
		chinese_food3_title=(TextView) findViewById(R.id.chinese_food3_title);
		chinese_food3_txt=(TextView) findViewById(R.id.chinese_food3_txt);
		
		chinese_food3_title.setTypeface(Typeface.SERIF);
		chinese_food3_txt.setTypeface(Typeface.SERIF);
		
		Typeface myTypeface=Typeface.createFromAsset(getAssets(), "fonts/ZAWGYIONE.TTF");
		
		chinese_food3_title.setTypeface(myTypeface);
		chinese_food3_txt.setTypeface(myTypeface);
		
		
		
		previous.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent previous=new Intent(Chinese_Food3.this,Chinese_Food2.class);
				startActivity(previous);
			}
		});
		
		home.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent home=new Intent(Chinese_Food3.this,Cooking.class);
				startActivity(home);
			}
		});
		
		next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent next=new Intent(Chinese_Food3.this,Chinese_Food4.class);
				startActivity(next);
			}
		});
	}
	
}
