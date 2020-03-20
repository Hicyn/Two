package com.example.two;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText num;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = (EditText) findViewById(R.id.input);
        res = (TextView) findViewById(R.id.result);

        Button btn = (Button)findViewById(R.id.butt);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Log.i("main","onClick msg....");
        String str = num.getText().toString();
        double  temper = Double.parseDouble(str);
        double tem = temper * 9 / 5 + 32;
        res.setText(temper+"℃对应的华氏温度为"+tem+"℉");

    }

}
