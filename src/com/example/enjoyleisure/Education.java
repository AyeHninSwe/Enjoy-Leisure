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

public class Education extends Activity {
	
	String book_link[]={"https://yadi.sk/i/eeR6OuKJy7dw3","https://yadi.sk/i/eeR6OuKJy7dw3","http://www.mediafire.com/?r5ij1add5m4a37j",
			"http://www.mediafire.com/download/u68itr3n6eg16e9","http://www.mediafire.com/download/8hz34077zdkzb25",
			"http://www.mediafire.com/download/pj2l88720i0a4pv","http://pc.cd/hggctalK","http://pc.cd/z78ctalK",
			"http://pc.cd/YSgctalK","http://pc.cd/i18ctalK"};
	String book_name[]={"To be greatful","Playing Rock Guitar","Playing the piano","Build your own blog",
			"English for Computer Field","Linux for u","Photoshop","Professional web developers",
			"Microsoft Excel 2010","Hacking"};
	GridView gridView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.education);
		
		gridView=(GridView) findViewById(R.id.education_book_grid);
		
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
