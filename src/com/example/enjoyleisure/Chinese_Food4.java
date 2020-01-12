package com.example.enjoyleisure;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Chinese_Food4 extends Activity{
	Button previous,home,next;
	TextView chinese_food4_title,chinese_food4_txt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chinese_food4);
		
		previous=(Button) findViewById(R.id.chinese_food4_previous_btn);
		home=(Button) findViewById(R.id.chinese_food4_home_btn);
		next=(Button) findViewById(R.id.chinese_food4_next_btn);
		

		chinese_food4_title=(TextView) findViewById(R.id.chinese_food4_title);
		chinese_food4_txt=(TextView) findViewById(R.id.chinese_food4_txt);
		
		chinese_food4_title.setTypeface(Typeface.SERIF);
		chinese_food4_txt.setTypeface(Typeface.SERIF);
		
		Typeface myTypeface=Typeface.createFromAsset(getAssets(), "fonts/ZAWGYIONE.TTF");
		
		chinese_food4_title.setTypeface(myTypeface);
		chinese_food4_txt.setTypeface(myTypeface);
		
		
		
		previous.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent previous=new Intent(Chinese_Food4.this,Chinese_Food3.class);
				startActivity(previous);
			}
		});
		
		home.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent home=new Intent(Chinese_Food4.this,Cooking.class);
				startActivity(home);
			}
		});
		
		next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent next=new Intent(Chinese_Food4.this,Chinese_Food5.class);
				startActivity(next);
			}
		});
	}
	
}
