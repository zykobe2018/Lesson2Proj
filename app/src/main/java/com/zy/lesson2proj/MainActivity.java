package com.zy.lesson2proj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv_input;
    private EditText et_input;
    private Button btn_showInput;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* Toast.makeText(MainActivity.this,"this is a test toast sample.",Toast.LENGTH_SHORT).show();*/  //会在界面下方显示"this is a test toast sample."
        tv_input=(TextView)findViewById(R.id.tv_input);// 和布局中的组件关联起来
        et_input=(EditText)findViewById(R.id.et_input);
        btn_showInput=(Button)findViewById(R.id.btn_showInput);
        btn_showInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_input.setText( et_input.getText() );
            }
        });

    }
}
