package com.bibek.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class details extends AppCompatActivity {
    ImageView imagProfile;
TextView  tvName,tvphone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imagProfile=findViewById(R.id.vimag);
        tvName=findViewById(R.id.tvname);
        tvphone=findViewById(R.id.tvphone);

        Bundle bundle = getIntent().getExtras();

        if(bundle !=null){
            imagProfile.setImageResource(bundle.getInt("image"));
            tvName.setText(bundle.getString("name"));
            tvphone.setText(bundle.getString("phone"));
        }

    }
}
