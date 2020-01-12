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

public class Action_Film extends Activity{
	GridView gridview;
	String action_link[]={"https://m.facebook.com/groups/181393752265192?view=permalink&id=276626232741943",
						"https://m.facebook.com/story.php?story_fbid=220577375017702&id=100011963233221",
						"https://m.facebook.com/groups/181393752265192?view=permalink&id=275551786182721",
						"https://m.facebook.com/story.php?story_fbid=311953272563229&id=100012456760921",
						"https://m.facebook.com/story.php?story_fbid=122175328399902&id=100018223063677",
						"https://m.facebook.com/story.php?story_fbid=1915186858803262&id=100009359003936",
						"https://m.facebook.com/story.php?story_fbid=183639725506758&id=100015821952310"};
						
	String action_name[]={"Solomon kane Action","Operation mekong 2016 Chinese Action",
			"Wolf Children ","Atlantis: The Lost Expire 2001 Animi",
			"The book of  life(2014)","Fall in love like a star","2:22"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.action_film);
		gridview=(GridView) findViewById(R.id.action_film_grid);
		
		ArrayAdapter <String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,
				action_name);
		
		gridview.setAdapter(adapter);
		
		gridview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				// TODO Auto-generated method stub

				Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(action_link[position]));
				
				startActivity(intent);
			}

		});
	}
	}
			
		



