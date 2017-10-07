package com.exam.examactivity.activity.result;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.exam.examactivity.R;



public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void OnBackBtnClick(View v)
    {
        Toast.makeText(this,"돌아간다!!",Toast.LENGTH_SHORT).show();

        Intent intent = new Intent();
        intent.putExtra("name","홍길동");
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}
