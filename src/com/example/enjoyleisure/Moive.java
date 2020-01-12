package com.example.enjoyleisure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Moive extends Activity  {
	Button Mdrama_btn,Maction_btn,Manimation_btn,Mhorror_btn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.movie);
		Mdrama_btn=(Button)findViewById(R.id.Mdarama_btn);
		Maction_btn=(Button)findViewById(R.id.Maction_btn);
		Manimation_btn=(Button)findViewById(R.id.Manimation_btn);
		Mhorror_btn=(Button)findViewById(R.id.Mhorror_btn);
		
		
		Mdrama_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent Mdrama=new Intent(Moive.this,K_Drama.class);
				startActivity(Mdrama);
				
				
			}
		});
		Maction_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent Maction=new Intent(Moive.this,Action_Film.class);
				startActivity(Maction);
				
			}
		});
		Manimation_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent Manimation=new Intent(Moive.this,Animation.class);
				startActivity(Manimation);
				
			}
		});
		Mhorror_btn	.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent Mhorror=new Intent(Moive.this,Horror.class);
				startActivity(Mhorror);
				
			}
		});
		
	
		
	}

	
		
		
		
	}


