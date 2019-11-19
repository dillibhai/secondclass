package com.secondclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etFirst,etSecond;
    private TextView tvResult;
    private Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirst = findViewById(R.id.etFirst);
        etSecond = findViewById(R.id.etSecond);
        tvResult=findViewById(R.id.tvResult);
        btnClick=findViewById(R.id.btnClick);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etFirst.getText())){
                    etFirst.setError(("Please enter first no"));
                    etFirst.requestFocus();
                    return;
                } else if(TextUtils.isEmpty((etSecond.getText()))){
                    etSecond.setError("please enter second no");
                    etSecond.requestFocus();
                    return;

                }
                int firstno=Integer.parseInt(etFirst.getText().toString());
                int secondno=Integer.parseInt(etSecond.getText().toString());
                arthematic arthematic = new arthematic (firstno,secondno);
                int result = arthematic.add();
                tvResult.setText(Integer.toString(result));
            }
        });
    }

}
