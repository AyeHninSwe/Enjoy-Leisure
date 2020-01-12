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

public class Novel extends Activity {
	
	String book_link[]={"http://www.mediafire.com/file/ubl9vq772zz3f4b/","https://yadi.sk/i/ICjXBsBxoBaaX","https://yadi.sk/i/vrkketeEoBaad",
			"https://yadi.sk/i/_1ocNAnNoBaah","https://yadi.sk/i/Vn_ARQpSoBaaV","https://www.mediafire.com/?0tzfx5bon34fzls","https://www.mediafire.com/?1izj9646uc6d23e",
			"https://yadi.sk/i/Fe1q2OoJzmmxT","http://www32.zippyshare.com/v/hQPKcdaV/file.html","http://www32.zippyshare.com/v/s9c6mqRD/file.html","https://www.mediafire.com/?l6wyxblm14s5w99",
			"http://www.mediafire.com/?f2vo9ttkyjt2cjx"};
	String book_name[]={"The umbralla","Diee Khin Khin","The Queen Pan Htwar","Dar Tu Kalyar","The prince Ka Naung and Hling Htke Khung Tin",
			"Now,We are straingers","Fifth winter day","Sayar Zawgyi","Mahatama Gandni","Life is","Ten Great Story of Buddha",
			"Great Music of Myanmar "};
	GridView gridView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.novel_book);
		
		gridView=(GridView) findViewById(R.id.novel_book_grid);
		
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
