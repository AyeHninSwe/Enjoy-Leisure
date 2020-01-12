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

public class Health extends Activity{
	GridView gridView;
	String book_link[]={"http://www.mediafire.com/?i4m4hn74vwn2u1p","http://www.mediafire.com/?84rq5p71d0l8dpc",
			"http://www.mediafire.com/?lhb58hw7dad76th","http://www.mediafire.com/?6pkdvlkcv6khvhl",
			"http://www.mediafire.com/?x2wfr4x6lxwc6w6","http://www.mediafire.com/?48e3pzva5n70p87",
			"http://www.mediafire.com/?zo93ec8hlz1sq2y","http://www.mediafire.com/?o87j49och3qkucg",
			"http://www.mediafire.com/?wf4m4wfqclm9dvf","http://www.mediafire.com/?7fiici237qc94i8"};


	String book_name[]={"Wrong thoughts about children","Scares and Eczema","FAQ for mothers","Word presents for mothers",
			"Caring a baby","Scientic demesticity","Knowledge for sex","Care your hair",
			"Nutrition and Dietetics","Play with your children"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.health);
		
		gridView=(GridView) findViewById(R.id.health_book_grid);
		
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
