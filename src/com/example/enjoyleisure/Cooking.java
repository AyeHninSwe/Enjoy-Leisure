package com.example.enjoyleisure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Cooking extends Activity {
	Button myanmar_btn,korean_btn,chinese_btn,asian_btn,thai_btn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cooking);
		myanmar_btn=(Button) findViewById(R.id.myanmar_btn);
		korean_btn=(Button) findViewById(R.id.korean_btn);
		chinese_btn=(Button) findViewById(R.id.chinese_btn);
		asian_btn=(Button) findViewById(R.id.asian_btn);
		thai_btn=(Button)findViewById(R.id.thai_btn);
		
		myanmar_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myanmar=new Intent(Cooking.this,Myanmar_Food1.class);
				startActivity(myanmar);
				
			}
		});
		korean_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent korean=new Intent(Cooking.this,Korean_Food1.class);
				startActivity(korean);
				
			}
		});
		
		chinese_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent chinese=new Intent(Cooking.this,Chinese_Food1.class);
				startActivity(chinese);
				
			}
		});

		asian_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent asian=new Intent(Cooking.this,Asian_Food1.class);
				startActivity(asian);
				
			}
		});
		thai_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent thai=new Intent(Cooking.this,Thai_Food1.class);
				startActivity(thai);
				
			}
		});
		
		
	}
	

}
