package com.example.enjoyleisure;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Mathematics extends Activity{
RadioButton pmath_rdo1False1,pmath_rdo1True,pmath_rdo1False2, 
			pmath_rdo2False1,pmath_rdo2True,pmath_rdo2False2,
			pmath_rdo3False1,pmath_rdo3True,pmath_rdo3False2,
			pmath_rdo4False1,pmath_rdo4True,pmath_rdo4False2,
			pmath_rdo5False1,pmath_rdo5True,pmath_rdo5False2,
			pmath_rdo6False1,pmath_rdo6True,pmath_rdo6False2,
			pmath_rdo7False1,pmath_rdo7True,pmath_rdo7False2;

RadioGroup pmath_rdo1,pmath_rdo2,pmath_rdo3,pmath_rdo4,pmath_rdo5,pmath_rdo6,pmath_rdo7;

TextView q1,q2,q3,q4,q5,q6,q7;
			
Button btn_finish;
static int result_mark=0;
AlertDialog dia;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pmath);
		
//		pmath_rdo1=(RadioGroup) findViewById(R.id.pmath_rdo1);
//		pmath_rdo2=(RadioGroup) findViewById(R.id.pmath_rdo2);
//		pmath_rdo3=(RadioGroup) findViewById(R.id.pmath_rdo3);
//		pmath_rdo4=(RadioGroup) findViewById(R.id.pmath_rdo4);
//		pmath_rdo5=(RadioGroup) findViewById(R.id.pmath_rdo5);
//		pmath_rdo6=(RadioGroup) findViewById(R.id.pmath_rdo6);
//		pmath_rdo7=(RadioGroup) findViewById(R.id.pmath_rdo7);
		
		pmath_rdo1False1=(RadioButton)findViewById(R.id.pmath_rdo1False1);
		pmath_rdo1True=(RadioButton)findViewById(R.id.pmath_rdo1True);
		pmath_rdo1False2=(RadioButton)findViewById(R.id.pmath_rdo1False2);
		
		pmath_rdo2False1=(RadioButton)findViewById(R.id.pmath_rdo2False1);
		pmath_rdo2False2=(RadioButton)findViewById(R.id.pmath_rdo2False2);
		pmath_rdo2True=(RadioButton)findViewById(R.id.pmath_rdo2True);
		
		pmath_rdo3True=(RadioButton)findViewById(R.id.pmath_rdo3True);
		pmath_rdo3False1=(RadioButton)findViewById(R.id.pmath_rdo3False1);
		pmath_rdo3False2=(RadioButton)findViewById(R.id.pmath_rdo3False2);
		
		pmath_rdo4False1=(RadioButton)findViewById(R.id.pmath_rdo4False1);
		pmath_rdo4False2=(RadioButton)findViewById(R.id.pmath_rdo4False2);
		pmath_rdo4True=(RadioButton)findViewById(R.id.pmath_rdo4True);
		
		pmath_rdo5False1=(RadioButton)findViewById(R.id.pmath_rdo5False1);
		pmath_rdo5True=(RadioButton)findViewById(R.id.pmath_rdo5True);
		pmath_rdo5False2=(RadioButton)findViewById(R.id.pmath_rdo5False2);
		
		pmath_rdo6True=(RadioButton)findViewById(R.id.pmath_rdo6True);
		pmath_rdo6False1=(RadioButton)findViewById(R.id.pmath_rdo6False1);
		pmath_rdo6False2=(RadioButton)findViewById(R.id.pmath_rdo6False2);
		
	
		pmath_rdo7False1=(RadioButton)findViewById(R.id.pmath_rdo7False1);
		pmath_rdo7True=(RadioButton)findViewById(R.id.pmath_rdo7True);
		pmath_rdo7False2=(RadioButton)findViewById(R.id.pmath_rdo7False2);
		
		q1=(TextView) findViewById(R.id.q1);
		q2=(TextView) findViewById(R.id.q2);
		q3=(TextView) findViewById(R.id.q3);
		q4=(TextView) findViewById(R.id.q4);
		q5=(TextView) findViewById(R.id.q5);
		q6=(TextView) findViewById(R.id.q6);
		q7=(TextView) findViewById(R.id.q7);
		
		btn_finish=(Button)findViewById(R.id.btn_math_finish);
		
	
		
		btn_finish.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//int radioId1=pmath_rdo1.getCheckedRadioButtonId();
				if(pmath_rdo1True.isChecked()){
					result_mark++;
				}
				else if(pmath_rdo1False1.isChecked()){
						q1.setTextColor(Color.RED);
				}
				else if(pmath_rdo1False2.isChecked()){
					q1.setTextColor(Color.RED);
				}
				
				
			//int radioId2=pmath_rdo2.getCheckedRadioButtonId();
				if(pmath_rdo2True.isChecked()){
					result_mark++;
				}
				else if(pmath_rdo2False1.isChecked()){
						q2.setTextColor(Color.RED);
				}
				else if(pmath_rdo2False2.isChecked()){
					q2.setTextColor(Color.RED);
				}
				
				
			//int radioId3=pmath_rdo3.getCheckedRadioButtonId();
				if(pmath_rdo3True.isChecked()){
					result_mark++;
				}
				else if(pmath_rdo3False1.isChecked()){
						q3.setTextColor(Color.RED);
				}
				else if(pmath_rdo3False2.isChecked()){
					q3.setTextColor(Color.RED);
				}
				
				
			//int radioId4=pmath_rdo4.getCheckedRadioButtonId();
				if(pmath_rdo4True.isChecked()){
					result_mark++;
				}
				else if(pmath_rdo4False1.isChecked()){
						q4.setTextColor(Color.RED);
				}
				else if(pmath_rdo4False2.isChecked()){
					q4.setTextColor(Color.RED);
				}
				
				
			//int radioId5=pmath_rdo5.getCheckedRadioButtonId();
				if(pmath_rdo5True.isChecked()){
					result_mark++;
				}
				else if(pmath_rdo5False1.isChecked()){
						q5.setTextColor(Color.RED);
				}
				else if(pmath_rdo5False2.isChecked()){
					q5.setTextColor(Color.RED);
				}
				
				
			//int radioId6=pmath_rdo6.getCheckedRadioButtonId();
				if(pmath_rdo6True.isChecked()){
					result_mark++;
				}
				else if(pmath_rdo6False1.isChecked()){
						q6.setTextColor(Color.RED);
				}
				else if(pmath_rdo6False2.isChecked()){
					q6.setTextColor(Color.RED);
				}
				
				
			//int radioId7=pmath_rdo7.getCheckedRadioButtonId();
				if(pmath_rdo7True.isChecked()){
					result_mark++;
				}
				else if(pmath_rdo7False1.isChecked()){
						q7.setTextColor(Color.RED);
				}
				else if(pmath_rdo7False2.isChecked()){
					q7.setTextColor(Color.RED);
				}
				
				// TODO Auto-generated method stub
				AlertDialog dialog=makeAndShowDialogBox();
				dialog.show();
				
			}

			private AlertDialog makeAndShowDialogBox() {
				// TODO Auto-generated method stub
				
				dia=new AlertDialog.Builder(Mathematics.this)
						.setTitle("Result")
						.setMessage("Congratulations,\nYou won "+result_mark+" out of 7.")
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
