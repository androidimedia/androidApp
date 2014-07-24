package com.iMedia.ccdsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends Activity {
	EditText userId,password;
	Button loginButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		userId=(EditText)findViewById(R.id.editText1);
		password=(EditText)findViewById(R.id.editText2);
		loginButton=(Button)findViewById(R.id.button1);
		loginButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if(userId.getText().toString().trim().equalsIgnoreCase("123")&& password.getText().toString().trim().equalsIgnoreCase("123")){
					Toast.makeText(getApplicationContext(), "right info", 1000).show();
					Intent in=new Intent(LoginPage.this,MainActivity.class);
					startActivity(in);
					userId.setText("");
					password.setText("");
				}
				else{
					Toast.makeText(getApplicationContext(), "wrong info", 1000).show();
				}
			}
		});
	}

}
