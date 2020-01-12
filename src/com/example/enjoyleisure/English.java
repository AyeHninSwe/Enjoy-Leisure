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

public class English extends Activity{
	RadioButton peng_rdo1True,peng_rdo1False1,peng_rdo1False2,
	peng_rdo2False1,peng_rdo2True,peng_rdo2False2,
	peng_rdo3True,peng_rdo3False1,peng_rdo3False2,
	peng_rdo4True,peng_rdo4False1,peng_rdo4False2,
	peng_rdo5True,peng_rdo5False1,peng_rdo5False2,
	peng_rdo6True,peng_rdo6False1,peng_rdo6False2,
	peng_rdo7True,peng_rdo7False1,peng_rdo7False2,
	peng_rdo8True,peng_rdo8False1,peng_rdo8False2,
	peng_rdo9True,peng_rdo9False1,peng_rdo9False2,
	peng_rdo10True,peng_rdo10False1,peng_rdo10False2;
	
	RadioGroup peng_rdo1,peng_rdo2,peng_rdo3,peng_rdo4,peng_rdo5,peng_rdo6,peng_rdo7,peng_rdo8,peng_rdo9,peng_rdo10;
	
	TextView eq1,eq2,eq3,eq4,eq5,eq6,eq7,eq8,eq9,eq10;
	Button btn_finish;

	int result_mark=0;
AlertDialog dia;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.penglish);
	
	peng_rdo1=(RadioGroup) findViewById(R.id.peng_rdo1);
	peng_rdo2=(RadioGroup) findViewById(R.id.peng_rdo2);
	peng_rdo3=(RadioGroup) findViewById(R.id.peng_rdo3);
	peng_rdo4=(RadioGroup) findViewById(R.id.peng_rdo4);
	peng_rdo5=(RadioGroup) findViewById(R.id.peng_rdo5);
	peng_rdo6=(RadioGroup) findViewById(R.id.peng_rdo6);
	peng_rdo7=(RadioGroup) findViewById(R.id.peng_rdo7);
	peng_rdo8=(RadioGroup) findViewById(R.id.peng_rdo8);
	peng_rdo9=(RadioGroup) findViewById(R.id.peng_rdo9);
	peng_rdo10=(RadioGroup) findViewById(R.id.peng_rdo10);
	
	peng_rdo1True=(RadioButton)findViewById(R.id.peng_rdo1True);
	peng_rdo1False1=(RadioButton)findViewById(R.id.peng_rdo1False1);
	peng_rdo1False2=(RadioButton)findViewById(R.id.peng_rdo1False2);
	peng_rdo2False1=(RadioButton)findViewById(R.id.peng_rdo2False1);
	peng_rdo2True=(RadioButton)findViewById(R.id.peng_rdo2True);
	peng_rdo2False2=(RadioButton)findViewById(R.id.peng_rdo2False2);
	peng_rdo3False1=(RadioButton)findViewById(R.id.peng_rdo3False1);
	peng_rdo3True=(RadioButton)findViewById(R.id.peng_rdo3True);
	peng_rdo3False2=(RadioButton)findViewById(R.id.peng_rdo3False2);
	peng_rdo4False1=(RadioButton)findViewById(R.id.peng_rdo4False1);
	peng_rdo4False2=(RadioButton)findViewById(R.id.peng_rdo4False2);
	peng_rdo4True=(RadioButton)findViewById(R.id.peng_rdo4True);
	peng_rdo5True=(RadioButton)findViewById(R.id.peng_rdo5True);
	peng_rdo5False1=(RadioButton)findViewById(R.id.peng_rdo5False1);
	peng_rdo5False2=(RadioButton)findViewById(R.id.peng_rdo5False2);
	peng_rdo6False1=(RadioButton)findViewById(R.id.peng_rdo6False1);
	peng_rdo6False2=(RadioButton)findViewById(R.id.peng_rdo6False2);
	peng_rdo6True=(RadioButton)findViewById(R.id.peng_rdo6True);
	peng_rdo7False1=(RadioButton)findViewById(R.id.peng_rdo7False1);
	peng_rdo7True=(RadioButton)findViewById(R.id.peng_rdo7True);
	peng_rdo7False2=(RadioButton)findViewById(R.id.peng_rdo7False2);
	peng_rdo8False1=(RadioButton)findViewById(R.id.peng_rdo8False1);
	peng_rdo8True=(RadioButton)findViewById(R.id.peng_rdo8True);
	peng_rdo8False2=(RadioButton)findViewById(R.id.peng_rdo8False2);
	peng_rdo9False1=(RadioButton)findViewById(R.id.peng_rdo9False1);
	peng_rdo9False2=(RadioButton)findViewById(R.id.peng_rdo9False2);
	peng_rdo9True=(RadioButton)findViewById(R.id.peng_rdo9True);
	peng_rdo10True=(RadioButton)findViewById(R.id.peng_rdo10True);
	peng_rdo10False1=(RadioButton)findViewById(R.id.peng_rdo10False1);
	peng_rdo10False2=(RadioButton)findViewById(R.id.peng_rdo10False2);
	
	eq1=(TextView) findViewById(R.id.eq1);
	eq2=(TextView) findViewById(R.id.eq2);
	eq3=(TextView) findViewById(R.id.eq3);
	eq4=(TextView) findViewById(R.id.eq4);
	eq5=(TextView) findViewById(R.id.eq5);
	eq6=(TextView) findViewById(R.id.eq6);
	eq7=(TextView) findViewById(R.id.eq7);
	eq8=(TextView) findViewById(R.id.eq8);
	eq9=(TextView) findViewById(R.id.eq9);
	eq10=(TextView) findViewById(R.id.eq10);
	
	btn_finish=(Button)findViewById(R.id.btn_eng_finish);
	

	
	
	btn_finish.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			int radioId1=peng_rdo1.getCheckedRadioButtonId();
			if(peng_rdo1True.isChecked()){
				result_mark++;
			}
			if(peng_rdo1False1.isChecked()){
				eq1.setTextColor(Color.RED);
			}
			if(peng_rdo1False2.isChecked()){
				eq1.setTextColor(Color.RED);
			}
			
			
			//int radioId2=peng_rdo2.getCheckedRadioButtonId();
			if(peng_rdo2False1.isChecked()){
				eq2.setTextColor(Color.RED);
			}
			if(peng_rdo2True.isChecked()){
				result_mark++;
			}
			 
			else if(peng_rdo2False2.isChecked()){
				eq2.setTextColor(Color.RED);
			}
			
			//int radioId3=peng_rdo3.getCheckedRadioButtonId();
			
		   if(peng_rdo3False1.isChecked()){
				eq3.setTextColor(Color.RED);
			}
			
		   else if(peng_rdo3True.isChecked()){
				result_mark++;
			}
			else if(peng_rdo3False2.isChecked()){
				eq3.setTextColor(Color.RED);
			}
			
			//int radioId4=peng_rdo4.getCheckedRadioButtonId();
			
			if(peng_rdo4False1.isChecked()){
				eq4.setTextColor(Color.RED);
			}
			else if(peng_rdo4False2.isChecked()){
				eq4.setTextColor(Color.RED);
			}
			else if(peng_rdo4True.isChecked()){
				result_mark++;
			}
			
			//int radioId5=peng_rdo5.getCheckedRadioButtonId();
			if(peng_rdo5True.isChecked()){
				result_mark++;
			}
			else if(peng_rdo5False1.isChecked()){
				eq5.setTextColor(Color.RED);
			}
			else if(peng_rdo5False2.isChecked()){
				eq5.setTextColor(Color.RED);
			}
			
			//int radioId6=peng_rdo6.getCheckedRadioButtonId();
			
			if(peng_rdo6False1.isChecked()){
				eq6.setTextColor(Color.RED);
			}
			else if(peng_rdo6False2.isChecked()){
				eq6.setTextColor(Color.RED);
			}
			else if(peng_rdo6True.isChecked()){
				result_mark++;
			}
			
			if(peng_rdo7False1.isChecked()){
				eq7.setTextColor(Color.RED);
			}
			//int radioId7=peng_rdo7.getCheckedRadioButtonId();
			else if(peng_rdo7True.isChecked()){
				result_mark++;
			}
			
			else if(peng_rdo7False2.isChecked()){
				eq7.setTextColor(Color.RED);
			}
			
			//int radioId8=peng_rdo8.getCheckedRadioButtonId();
			
			if(peng_rdo8False1.isChecked()){
				eq8.setTextColor(Color.RED);
			}
			
			else if(peng_rdo8True.isChecked()){
				result_mark++;
			}
			else if(peng_rdo8False2.isChecked()){
				eq8.setTextColor(Color.RED);
			}
			
			//int radioId9=peng_rdo9.getCheckedRadioButtonId();
			
			if(peng_rdo9False1.isChecked()){
				eq9.setTextColor(Color.RED);
			}
			
			else if(peng_rdo9False2.isChecked()){
				eq9.setTextColor(Color.RED);
			}
			
			else if(peng_rdo9True.isChecked()){
				result_mark++;
			}
			
			//int radioId10=peng_rdo10.getCheckedRadioButtonId();
			if(peng_rdo10True.isChecked()){
				result_mark++;
			}
			else if(peng_rdo10False1.isChecked()){
				eq10.setTextColor(Color.RED);
			}
			else if(peng_rdo10False2.isChecked()){
				eq10.setTextColor(Color.RED);
			}
			AlertDialog dialog=makeAndShowDialogBox();
			dialog.show();
			
		}

		private AlertDialog makeAndShowDialogBox() {
			// TODO Auto-generated method stub
			
			dia=new AlertDialog.Builder(English.this)
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
