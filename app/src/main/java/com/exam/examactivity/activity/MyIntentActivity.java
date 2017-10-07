package com.exam.examactivity.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.exam.examactivity.R;


public class MyIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_intent);

        Button btn_gomenu = (Button) findViewById(R.id.btn_gomenu);
        btn_gomenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Intent intent = new Intent(getBaseContext(), MenuActivity.class);
             //   startActivityForResult(intent, 101);

                Intent intent = new Intent();
                ComponentName componentName = new ComponentName("com.exam.myexam.activity","com.exam.myexam.activity.MenuActivity");
                intent.setComponent(componentName);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 101) {
            String name = data.getStringExtra("name");
            Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        }

    }
}
