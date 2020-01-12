package com.example.enjoyleisure;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.AdapterView.OnItemClickListener;

public class K_Drama extends Activity{
	GridView gridView;
	String movie_link[]={"https://m.facebook.com/groups/578740895646943?view=permalink&id=611246985729667",
			"https://m.facebook.com/groups/181393752265192?view=permalink&id=282318748839358",
			"https://m.facebook.com/story.php?story_fbid=1784763244871598&id=1412761142071812",
			"https://m.facebook.com/story.php?story_fbid=1798228070191782&id=1412761142071812",
			"https://m.facebook.com/story.php?story_fbid=1482397185108207&id=1412761142071812",
			"https://m.facebook.com/story.php?story_fbid=1823852374296018&id=1412761142071812",
			"https://m.facebook.com/story.php?story_fbid=1803284399686149&id=1412761142071812",
			"https://m.facebook.com/story.php?story_fbid=1806144362733486&id=1412761142071812",
			"https://m.facebook.com/story.php?story_fbid=1834837773197478&id=1412761142071812",
			"https://m.facebook.com/story.php?story_fbid=314674482323650&id=100013433016058"};


	String movie_name[]={"Hwarng","Tomorrow with you","Dream High 2","The K2","Good doctor",
			"Strong woman","Legend of the blue sea","Globin","Ruler Master of the mask","Let fight ghost "
			};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.k_drama);
		
		gridView=(GridView) findViewById(R.id.k_drama_grid);
		
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
