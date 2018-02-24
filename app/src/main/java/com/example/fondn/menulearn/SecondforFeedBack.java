package com.example.fondn.menulearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondforFeedBack extends AppCompatActivity {
    EditText editText;
    Button button, clearbutton;
    String m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondfor_feed_back);

        editText = (EditText) findViewById(R.id.subjectTextID);
         m = editText.getText().toString();
        clearbutton = (Button) findViewById(R.id.ClearbuttonID);
        button = (Button) findViewById(R.id.buttonID);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/email");
                    i.putExtra(Intent.EXTRA_TEXT, "Name " + m);
                    i.putExtra(Intent.EXTRA_EMAIL, new String[]{"msksagor@gmail.com"});
                    startActivity(Intent.createChooser(i, "Feedbackwith"));

                } catch (Exception e) {

                }
            }
        });

        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
    }
}
