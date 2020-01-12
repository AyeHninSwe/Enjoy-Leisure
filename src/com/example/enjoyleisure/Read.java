package com.example.enjoyleisure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Read extends Activity {
	Button policy_btn,health_btn,education_btn,novel_btn,poem_btn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reading);
		poem_btn=(Button)findViewById(R.id.poem_btn);
		policy_btn=(Button)findViewById(R.id.policy_btn);
		health_btn=(Button)findViewById(R.id.health_btn);
		education_btn=(Button)findViewById(R.id.education_btn);
		novel_btn=(Button)findViewById(R.id.novel_btn);
		
		poem_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent poem=new Intent(Read.this,Poem.class);
				startActivity(poem);
				
			}
		});
		policy_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent policy=new Intent(Read.this,Policy.class);
				startActivity(policy);
				
			}
		});
		health_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent health=new Intent(Read.this,Health.class);
				startActivity(health);
				
			}
		});
		education_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent education=new Intent(Read.this,Education.class);
				startActivity(education);
				
			}
		});
		novel_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent novel=new Intent(Read.this,Novel.class);
				startActivity(novel);
				
			}
		});
	}

}
