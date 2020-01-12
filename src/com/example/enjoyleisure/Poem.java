package com.example.enjoyleisure;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Poem extends Activity {
	
	String book_link[]={"https://yadi.sk/i/JkMxoSFqf3WY2","https://yadi.sk/i/JkMxoSFqf3WY2","https://yadi.sk/i/I1hq4DThf3WY8",
			"https://yadi.sk/i/KjlpBo6Nf3WYE","https://yadi.sk/i/pV2qlaoyiK8Tf","https://yadi.sk/i/F5Pb7yJlf3WYc",
			"https://yadi.sk/i/O0VYFENgf3WYi","https://yadi.sk/i/sXF9o-XJm2Uwr","https://yadi.sk/i/cbhiVh-Zm2Uwy",
			"https://yadi.sk/i/qJlH-IF9f3WZB","https://yadi.sk/i/Cr04EJjUf3WdF","https://yadi.sk/i/Si8yebp1f3Waa",
			"https://yadi.sk/i/BbsnO05lf3War","https://yadi.sk/i/yfAazV7JiK8Vj"};
	String book_name[]={"Ngwe Tar Yee","Kantkaw Myaing Sar Tan","Evening after raining","Poems of lovers",
			"Dhamma Poems","Memories of University life","The last poems of Tago","The guest and his poems",
			"The Life and Enviroment in Myanmar","Flower Bridge","Kyi Aye's Poems","The sky of three men",
			"Countryside Poems","The cowboy"};
	GridView gridView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.poem_book);
		
		gridView=(GridView) findViewById(R.id.poem_book_grid);
		
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
