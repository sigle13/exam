package com.exam.examactivity.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.exam.examactivity.R;
import com.exam.examactivity.activity.data.SimpleData;
import com.exam.examactivity.activity.result.MenuActivity2;

import java.util.ArrayList;

public class MyParcelble extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_parcelble);

        Button btn_click = (Button) findViewById(R.id.btn_click);
        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity2.class);

                ArrayList<String> names = new ArrayList();

                names.add("홍길동");
                names.add("김개똥");

                intent.putExtra("names",names);

                SimpleData simpleData = new SimpleData(100,"귀귀");
                intent.putExtra("data",simpleData);


                ArrayList<SimpleData> simpleDatas = new ArrayList();
                simpleDatas.add(new SimpleData(101,"김똘똘1"));
                simpleDatas.add(new SimpleData(102,"김똘똘2"));
                simpleDatas.add(new SimpleData(103,"김똘똘3"));
                intent.putExtra("datas",simpleDatas);

                startActivityForResult(intent, 102);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 102) {

        }
    }
}
