package com.example.progresshuddemo;

import com.example.progresshuddemo.progress.ProgressHUD;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	
	ProgressHUD progress;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initViews();
		
	
	}

	private void initViews() {
		// TODO Auto-generated method stub
	
		
		findViewById(R.id.btnStart).setOnClickListener(this);
		findViewById(R.id.btnStop).setOnClickListener(this);
		
	}

	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btnStart:
			
			  progress = ProgressHUD.show(MainActivity.this,"Loading...",false,true,null);
			  
			 break;

		case R.id.btnStop:
			if(progress!=null){
				
				if(progress.isShowing()){
				   progress.dismiss(); 
				}
			 }
			 break;
			
		default:
			break;
		}
	}
}
