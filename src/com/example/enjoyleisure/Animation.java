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

public class Animation extends Activity{
	GridView gridView;
	String animation_link[]={"https://m.facebook.com/story.php?story_fbid=804427049660993&id=692346694202363",
							"https://m.facebook.com/story.php?story_fbid=129656667611241&id=100017007250810",
							"https://m.facebook.com/story.php?story_fbid=202180443575300&id=100013500363267",
							"https://m.facebook.com/groups/159376297873343?view=permalink&id=231600777317561",
							"https://m.facebook.com/story.php?story_fbid=258470361225465&id=100011875099470",
							"https://m.facebook.com/story.php?story_fbid=679059475614352&id=662777097242590",
							"https://m.facebook.com/groups/438402216491132?view=permalink&id=527873894210630",
							"https://m.facebook.com/story.php?story_fbid=112827202663392&id=100018083370479",
							"https://m.facebook.com/story.php?story_fbid=434924873530075&id=100010376975101",
					"https://m.facebook.com/animemmsubteam/photos/a.663153077204992.1073741828.662777097242590/692079384312361/?type=3"};
	
	String animation_name[]={"Children who chases last voices","Your name",
							"My Neighbor Totoro","Wolf Children ",
							"Whisper of heart ","Hal",
							"Wall.E","Colorful",
							"Ice Age","Another"};
			
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.animation);
		gridView=(GridView) findViewById(R.id.animation_grid);
		
		ArrayAdapter <String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,
				animation_name);
		
		gridView.setAdapter(adapter);
		
		gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				// TODO Auto-generated method stub

				Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(animation_link[position]));
				
				startActivity(intent);
			}

		});
	}
}
