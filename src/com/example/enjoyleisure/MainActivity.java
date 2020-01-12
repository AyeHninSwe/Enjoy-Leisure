package com.example.enjoyleisure;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	Button movie_btn,read_btn,cook_btn,puzzle_btn,about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        movie_btn=(Button)(findViewById(R.id.movie_btn));
        read_btn=(Button)(findViewById(R.id.read_btn));
        cook_btn=(Button)(findViewById(R.id.cook_btn));
        puzzle_btn=(Button)(findViewById(R.id.puzzle_btn));
        about=(Button) findViewById(R.id.about_btn);
        
        
        movie_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent movie=new Intent(MainActivity.this,Moive.class);
				startActivity(movie);
				
				
			}
		});
        /*music_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent music=new Intent(MainActivity.this,Music.class);
				startActivity(music);
				
				
				
			}
		});*/
		
		
       read_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
				Intent read=new Intent(MainActivity.this,Read.class);
				startActivity(read);
				
			}
		});
		
        cook_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent cook=new Intent(MainActivity.this,Cooking.class);
				startActivity(cook);
				
				
			}
		});
		
       puzzle_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				Intent puzzle=new Intent(MainActivity.this,Puzzle.class);
				startActivity(puzzle);
				
			}
		});
       
       about.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent=new Intent(MainActivity.this,About.class);
			startActivity(intent);
		}
	});
       
        
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        
        Intent startpage=new Intent(MainActivity.this,Start_page.class);
    	startActivity(startpage);
    	return true;
    }
    
    /*@Override
    protected void onStart() {
    	// TODO Auto-generated method stub
    	super.onStart();
    	
    	
    	
    }*/
    
   
   /* protected void onStop() {
    	// TODO Auto-generated method stub
    	
    	Toast.makeText(getApplicationContext(), "Thanks for using our app!Enjoy leisure\\^O^/", 1).show();
    	super.onStop();
    }*/
    
}
