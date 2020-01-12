package com.example.enjoyleisure;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class General extends Activity{
	RadioButton pgen_rdo1True,pgen_rdo1False1,pgen_rdo1False2,
		pgen_rdo2False1,pgen_rdo2True,pgen_rdo2False2,
		pgen_rdo3True,pgen_rdo3False1,pgen_rdo3False2,
		pgen_rdo4True,pgen_rdo4False1,pgen_rdo4False2,
		pgen_rdo5True,pgen_rdo5False1,pgen_rdo5False2,
		pgen_rdo6True,pgen_rdo6False1,pgen_rdo6False2,
		pgen_rdo7True,pgen_rdo7False1,pgen_rdo7False2,
		pgen_rdo8True,pgen_rdo8False1,pgen_rdo8False2,
		pgen_rdo9True,pgen_rdo9False1,pgen_rdo9False2,
		pgen_rdo10True,pgen_rdo10False1,pgen_rdo10False2;
	
	RadioGroup pgen_rdo1,pgen_rdo2,pgen_rdo3,pgen_rdo4,pgen_rdo5,pgen_rdo6,pgen_rdo7,pgen_rdo8,pgen_rdo9,pgen_rdo10;
	TextView gq1,gq2,gq3,gq4,gq5,gq6,gq7,gq8,gq9,gq10;
	Button btn_finish;
	static int result_mark=0;
	AlertDialog dia;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		try {
			setContentView(R.layout.pgeneral);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Toast.makeText(getApplicationContext(), "Puzzle page fail", 1).show();
		}
		
		/*pgen_rdo1=(RadioGroup) findViewById(R.id.pgen_rdo1);
		pgen_rdo2=(RadioGroup) findViewById(R.id.pgen_rdo2);
		pgen_rdo3=(RadioGroup) findViewById(R.id.pgen_rdo3);
		pgen_rdo4=(RadioGroup) findViewById(R.id.pgen_rdo4);
		pgen_rdo5=(RadioGroup) findViewById(R.id.pgen_rdo5);
		pgen_rdo6=(RadioGroup) findViewById(R.id.pgen_rdo6);
		pgen_rdo7=(RadioGroup) findViewById(R.id.pgen_rdo7);
		pgen_rdo8=(RadioGroup) findViewById(R.id.pgen_rdo8);
		pgen_rdo9=(RadioGroup) findViewById(R.id.pgen_rdo9);
		pgen_rdo10=(RadioGroup) findViewById(R.id.pgen_rdo10);*/
		
		pgen_rdo1True=(RadioButton)findViewById(R.id.pgen_rdo1True);
		pgen_rdo1False1=(RadioButton)findViewById(R.id.pgen_rdo1False1);
		pgen_rdo1False2=(RadioButton)findViewById(R.id.pgen_rdo1False2);
		pgen_rdo2False1=(RadioButton)findViewById(R.id.pgen_rdo2False1);
		pgen_rdo2True=(RadioButton)findViewById(R.id.pgen_rdo2True);
		pgen_rdo2False2=(RadioButton)findViewById(R.id.pgen_rdo2False2);
		pgen_rdo3False1=(RadioButton)findViewById(R.id.pgen_rdo3False1);
		pgen_rdo3True=(RadioButton)findViewById(R.id.pgen_rdo3True);
		pgen_rdo3False2=(RadioButton)findViewById(R.id.pgen_rdo3False2);
		pgen_rdo4False1=(RadioButton)findViewById(R.id.pgen_rdo4False1);
		pgen_rdo4False2=(RadioButton)findViewById(R.id.pgen_rdo4False2);
		pgen_rdo4True=(RadioButton)findViewById(R.id.pgen_rdo4True);
		pgen_rdo5True=(RadioButton)findViewById(R.id.pgen_rdo5True);
		pgen_rdo5False1=(RadioButton)findViewById(R.id.pgen_rdo5False1);
		pgen_rdo5False2=(RadioButton)findViewById(R.id.pgen_rdo5False2);
		pgen_rdo6False1=(RadioButton)findViewById(R.id.pgen_rdo6False1);
		pgen_rdo6False2=(RadioButton)findViewById(R.id.pgen_rdo6False2);
		pgen_rdo6True=(RadioButton)findViewById(R.id.pgen_rdo6True);
		pgen_rdo7False1=(RadioButton)findViewById(R.id.pgen_rdo7False1);
		pgen_rdo7True=(RadioButton)findViewById(R.id.pgen_rdo7True);
		pgen_rdo7False2=(RadioButton)findViewById(R.id.pgen_rdo7False2);
		pgen_rdo8False1=(RadioButton)findViewById(R.id.pgen_rdo8False1);
		pgen_rdo8True=(RadioButton)findViewById(R.id.pgen_rdo8True);
		pgen_rdo8False2=(RadioButton)findViewById(R.id.pgen_rdo8False2);
		pgen_rdo9False1=(RadioButton)findViewById(R.id.pgen_rdo9False1);
		pgen_rdo9False2=(RadioButton)findViewById(R.id.pgen_rdo9False2);
		pgen_rdo9True=(RadioButton)findViewById(R.id.pgen_rdo9True);
		pgen_rdo10True=(RadioButton)findViewById(R.id.pgen_rdo10True);
		pgen_rdo10False1=(RadioButton)findViewById(R.id.pgen_rdo10False1);
		pgen_rdo10False2=(RadioButton)findViewById(R.id.pgen_rdo10False2);
		
		gq1=(TextView) findViewById(R.id.gq1);
		gq2=(TextView) findViewById(R.id.gq2);
		gq3=(TextView) findViewById(R.id.gq3);
		gq4=(TextView) findViewById(R.id.gq4);
		gq5=(TextView) findViewById(R.id.gq5);
		gq6=(TextView) findViewById(R.id.gq6);
		gq7=(TextView) findViewById(R.id.gq7);
		gq8=(TextView) findViewById(R.id.gq8);
		gq9=(TextView) findViewById(R.id.gq9);
		gq10=(TextView) findViewById(R.id.gq10);
		
		
		btn_finish=(Button)findViewById(R.id.btn_general_finish);
		
	
		
		btn_finish.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//int radioId1=pgen_rdo1.getCheckedRadioButtonId();
				if(pgen_rdo1True.isChecked()){
					result_mark++;
				}
				else if(pgen_rdo1False1.isChecked()){
					gq1.setTextColor(Color.RED);
				}
				else if(pgen_rdo1False2.isChecked()){
					gq1.setTextColor(Color.RED);
				}
				
				
				
			//int radioId2=pgen_rdo2.getCheckedRadioButtonId();
				if(pgen_rdo2True.isChecked()){
					result_mark++;
				}
				else if(pgen_rdo2False1.isChecked()){
						gq2.setTextColor(Color.RED);
				}
				else if(pgen_rdo2False2.isChecked()){
					gq2.setTextColor(Color.RED);
				}
				
			//int radioId3=pgen_rdo3.getCheckedRadioButtonId();
				if(pgen_rdo3True.isChecked()){
					result_mark++;
				}
				else if(pgen_rdo3False1.isChecked()){
					gq3.setTextColor(Color.RED);
				}
				else if(pgen_rdo3False2.isChecked()){
					gq3.setTextColor(Color.RED);
				}
				
			//int radioId4=pgen_rdo4.getCheckedRadioButtonId();
				if(pgen_rdo4True.isChecked()){
					result_mark++;
				}
				else if(pgen_rdo4False1.isChecked()){
						gq4.setTextColor(Color.RED);
				}
				else if(pgen_rdo4False2.isChecked()){
					gq4.setTextColor(Color.RED);
				}
				
			//int radioId5=pgen_rdo5.getCheckedRadioButtonId();
				if(pgen_rdo5True.isChecked()){
					result_mark++;
				}
				else if(pgen_rdo5False1.isChecked()){
					gq5.setTextColor(Color.RED);
				}
				else if(pgen_rdo5False2.isChecked()){
					gq5.setTextColor(Color.RED);
				}
				
			//int radioId6=pgen_rdo6.getCheckedRadioButtonId();
				if(pgen_rdo1True.isChecked()){
					result_mark++;
				}
				else if(pgen_rdo6False1.isChecked()){
						gq6.setTextColor(Color.RED);
				}
				else if(pgen_rdo6False2.isChecked()){
					gq6.setTextColor(Color.RED);
				}
				
			//int radioId7=pgen_rdo7.getCheckedRadioButtonId();
				if(pgen_rdo7True.isChecked()){
					result_mark++;
				}
				else if(pgen_rdo7False1.isChecked()){
						gq7.setTextColor(Color.RED);
				}
				else if(pgen_rdo7False2.isChecked()){
					gq7.setTextColor(Color.RED);
				}
				
			//int radioId8=pgen_rdo8.getCheckedRadioButtonId();
				if(pgen_rdo8True.isChecked()){
					result_mark++;
				}
				else if(pgen_rdo8False1.isChecked()){
						gq8.setTextColor(Color.RED);
				}
				else if(pgen_rdo8False2.isChecked()){
					gq8.setTextColor(Color.RED);
				}
				
			//int radioId9=pgen_rdo9.getCheckedRadioButtonId();
				if(pgen_rdo9True.isChecked()){
					result_mark++;
				}
				else if(pgen_rdo9False1.isChecked()){
						gq9.setTextColor(Color.RED);
				}
				else if(pgen_rdo9False2.isChecked()){
					gq9.setTextColor(Color.RED);
				}
				
			//int radioId10=pgen_rdo10.getCheckedRadioButtonId();
				if(pgen_rdo10True.isChecked()){
					result_mark++;
				}
				else if(pgen_rdo10False1.isChecked()){
						gq10.setTextColor(Color.RED);
				}
				else if(pgen_rdo10False2.isChecked()){
					gq10.setTextColor(Color.RED);
				}
				// TODO Auto-generated method stub
				AlertDialog dialog=makeAndShowDialogBox();
				dialog.show();
				
			}

			private AlertDialog makeAndShowDialogBox() {
				// TODO Auto-generated method stub
				
				dia=new AlertDialog.Builder(General.this)
						.setTitle("Result")
						.setMessage("Congratulations,\nYou won "+result_mark+" out of 10.")
						.setPositiveButton("OK", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// TODO Auto-generated method stub
								
							}
						})
						.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// TODO Auto-generated method stub
								finish();
							}
						})
						.create();
				result_mark=0;
				return dia;
			}
		});
		
		
	}

}
