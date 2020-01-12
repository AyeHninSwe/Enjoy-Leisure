package com.example.enjoyleisure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Start_page extends Activity{
	Button start_btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start_page);
		
		start_btn=(Button) findViewById(R.id.start_btn);
		
		start_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
				/*Intent main=new Intent(Start_page.this,MainActivity.class);
				startActivity(main);*/
			}
		});
		
	}

}
