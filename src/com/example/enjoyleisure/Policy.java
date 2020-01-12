package com.example.enjoyleisure;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.AdapterView.OnItemClickListener;

public class Policy extends Activity {
	
	String book_link[]={"https://yadi.sk/i/-t52itKay9L3e","https://yadi.sk/i/3vZTr3Oqy9L45","https://yadi.sk/i/FvrrAqlxy9L3n",
			"https://yadi.sk/i/BYVkaBgWy9L3U","https://yadi.sk/i/jMUyc5say9L3x","https://yadi.sk/i/MBov7P-Ey9L3k"};
	String book_name[]={"News and Newspaper","Local cocil system of Myanmar","History of Myanmar Post Office",
			"King Thi Paw's Scripture from Landon","Landon Scripture team","100 years history of Myanmar Trainway"};
	GridView gridView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.policy_book);
		
		gridView=(GridView) findViewById(R.id.policy_book_grid);
		
		ArrayAdapter <String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,
				book_name);
		
		gridView.setAdapter(adapter);
		
		gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				// TODO Auto-generated method stub

				Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(book_link[position]));
				
				startActivity(intent);
			}

		});
		
		
		
		
	}
	
	


}
