package com.example.enjoyleisure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Puzzle extends Activity{
	Button penglish_btn,pmathematics_btn,pgeneral_btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.puzzle);
		penglish_btn=(Button)findViewById(R.id.penglish_btn);
		pmathematics_btn=(Button)findViewById(R.id.pmathematics_btn);
		pgeneral_btn=(Button) findViewById(R.id.pgeneral_btn);
		
		penglish_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent english=new Intent(Puzzle.this,English.class);
				startActivity(english);
				
				
			}
		});
		pmathematics_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent mathematics=new Intent(Puzzle.this,Mathematics.class);
				startActivity(mathematics);
				
				
			}
		});
		
			pgeneral_btn.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent general=new Intent(Puzzle.this,General.class);
					startActivity(general);
					
					
				}
			});
		
	}

}
