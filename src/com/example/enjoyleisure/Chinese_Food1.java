package com.example.enjoyleisure;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Chinese_Food1 extends Activity {
	Button home,next;
	TextView chinese_food1_title,chinese_food1_txt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chinese_food1);
		home=(Button)findViewById(R.id.chinese_food1_home_btn);
		next=(Button)findViewById(R.id.chinese_food1_next_btn);
		
		chinese_food1_title=(TextView) findViewById(R.id.chinese_food1_title);
		chinese_food1_txt=(TextView) findViewById(R.id.chinese_food1_txt);
		
		chinese_food1_title.setTypeface(Typeface.SERIF);
		chinese_food1_txt.setTypeface(Typeface.SERIF);
		
		Typeface myTypeface=Typeface.createFromAsset(getAssets(), "fonts/ZAWGYIONE.TTF");
		
		chinese_food1_title.setTypeface(myTypeface);
		chinese_food1_txt.setTypeface(myTypeface);
		
		
		home.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent home=new Intent(Chinese_Food1.this,Cooking.class);
				startActivity(home);
			}
		});
		
		next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent next=new Intent(Chinese_Food1.this,Chinese_Food2.class);
				startActivity(next);
			}
		});
	}
}
