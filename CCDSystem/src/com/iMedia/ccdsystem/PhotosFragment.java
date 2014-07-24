package com.iMedia.ccdsystem;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PhotosFragment extends Fragment {
	Button logoutButton;
	public PhotosFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_photos, container, false);
        logoutButton=(Button)rootView.findViewById(R.id.button1);
        logoutButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent in=new Intent(getActivity(),LoginPage.class);
				startActivity(in);
			}
		});
        return rootView;
    }
}
