package com.example.enjoyleisure;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Myanmar_Food5 extends Activity {

	Button previous,home,next;
	TextView myanmar_food5_txt,myanmar_food5_title;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myanmar_food5);
		
		previous=(Button) findViewById(R.id.myanmar_food5_previous_btn);
		home=(Button) findViewById(R.id.myanmar_food5_home_btn);
		next=(Button) findViewById(R.id.myanmar_food5_next_btn);
		
		myanmar_food5_title=(TextView) findViewById(R.id.myanmar_food5_title);
		myanmar_food5_txt=(TextView) findViewById(R.id.myanmar_food5_txt);
		
		myanmar_food5_title.setTypeface(Typeface.SERIF);
		myanmar_food5_txt.setTypeface(Typeface.SERIF);
		
		Typeface myTypeface=Typeface.createFromAsset(getAssets(), "fonts/ZAWGYIONE.TTF");
		
		myanmar_food5_title.setTypeface(myTypeface);
		myanmar_food5_txt.setTypeface(myTypeface);
		
		previous.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent previous=new Intent(Myanmar_Food5.this,Myanmar_Food4.class);
				startActivity(previous);
			}
		});
		
		home.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent home=new Intent(Myanmar_Food5.this,Cooking.class);
				startActivity(home);
			}
		});
		
		next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				Intent next=new Intent(Myanmar_Food5.this,Myanmar_Food6.class);
				startActivity(next);
			}
		});
	}
	




}
