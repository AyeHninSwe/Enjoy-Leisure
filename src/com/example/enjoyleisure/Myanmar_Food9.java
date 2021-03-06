package com.example.enjoyleisure;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Myanmar_Food9 extends Activity {

	Button previous,home,next;
	TextView myanmar_food9_txt,myanmar_food9_title;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myanmar_food9);
		
		
		previous=(Button) findViewById(R.id.myanmar_food9_previous_btn);
		home=(Button) findViewById(R.id.myanmar_food9_home_btn);
		next=(Button) findViewById(R.id.myanmar_food9_next_btn);
		
		myanmar_food9_title=(TextView) findViewById(R.id.myanmar_food9_title);
		myanmar_food9_txt=(TextView) findViewById(R.id.myanmar_food9_txt);
		
		myanmar_food9_title.setTypeface(Typeface.SERIF);
		myanmar_food9_txt.setTypeface(Typeface.SERIF);
		
		Typeface myTypeface=Typeface.createFromAsset(getAssets(), "fonts/ZAWGYIONE.TTF");
		
		myanmar_food9_title.setTypeface(myTypeface);
		myanmar_food9_txt.setTypeface(myTypeface);
		
		previous.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent previous=new Intent(Myanmar_Food9.this,Myanmar_Food8.class);
				startActivity(previous);
			}
		});
		
		home.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent home=new Intent(Myanmar_Food9.this,Cooking.class);
				startActivity(home);
			}
		});
		
		next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent next=new Intent(Myanmar_Food9.this,Myanmar_Food10.class);
				startActivity(next);
			}
		});
	}
	




}
