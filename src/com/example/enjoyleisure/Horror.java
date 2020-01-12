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

public class Horror extends Activity{
	GridView gridView;
	String movie_link[]={"https://m.facebook.com/story.php?story_fbid=1804110833204319&id=100008162584043",
						"https://m.facebook.com/groups/181393752265192?view=permalink&id=226924621045438",
						"https://m.facebook.com/groups/239878226425099?view=permalink&id=337901093289478",
						"https://m.facebook.com/story.php?story_fbid=344553085883915&id=100009876789956",
						"https://m.facebook.com/story.php?story_fbid=1740757542841641&id=1632595616991168",
						"https://m.facebook.com/groups/181393752265192?view=permalink&id=285014958569737",
						"https://m.facebook.com/groups/181393752265192?view=permalink&id=283812348689998"};


	String movie_name[]={"1920 Landon","The Vatican Tapes","Killer Toon ","Friend request ",
					"Train to Busan","Tales of hollowness","The ghost"};
			
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.horror_film);
		
		gridView=(GridView) findViewById(R.id.horror_film_grid);
		
		ArrayAdapter <String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,
				movie_name);
		
		gridView.setAdapter(adapter);
		
		gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				// TODO Auto-generated method stub

				Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(movie_link[position]));
				
				startActivity(intent);
			}

		});
	}
}
