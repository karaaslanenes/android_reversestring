package com.example.reversestringproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText inputStringEdit_Text;
    private TextView   reverseStringText_View;
    private Button reverseStringButton;
    private String inputString;
    private String reverseString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //get the view of the reverseStringButton
        reverseStringButton=(Button) findViewById(R.id.reverse_string_button);
        reverseStringButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // read  content of inputStringEdit_Text
                //do the reverse
                //Display the reverse content using reverseStringText_View
                //get the view of inputStringEdit_Text
                inputStringEdit_Text=(EditText) findViewById(R.id.input_string_edit_text);
                inputString=inputStringEdit_Text.getText().toString();
                reverseString="";
                for(int i=inputString.length()-1;i>=0;i--){
                    reverseString=reverseString+inputString.charAt(i);
                }
                // get the view of reverseString_View
                reverseStringText_View=(TextView) findViewById(R.id.reverse_string_text_view);
                reverseStringText_View.setText(reverseString);
            }
        });
    }
}