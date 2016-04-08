package com.example.pbuskell.personalizedgreeter;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class BeGreeted extends AppCompatActivity {
    //I made this idea on a story board, but had modified it along the way, as the way I imagined it would be far to advanced for my level.
    //I implemented code structure from apps I have made in the past. (Never have coded before)

    String strFavFood = "";
    String strFavColor = "";
    String strFavMovie = "";

//Code fort the "Start Conversation" button.

    Button btnStartConvo;
    EditText edtxtNameField;
    EditText edtxtMdlNameField;
    EditText edtxtLstNameField;
    TextView txtvwGreetingSpace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_greeted);

        btnStartConvo = (Button) findViewById(R.id.btnStartConvo);
        edtxtNameField = (EditText) findViewById(R.id.edtxtNameField);
        edtxtMdlNameField = (EditText) findViewById(R.id.edtxtMdlNameField);
        edtxtLstNameField = (EditText) findViewById(R.id.edtxtLstNameField);
        txtvwGreetingSpace = (TextView) findViewById(R.id.txtvwGreetingSpace);
    }

    public void greetTheUser(View vw)
    {
        Resources res = getResources();

        strFavFood = edtxtNameField.getText().toString();
        strFavColor = edtxtMdlNameField.getText().toString();
        strFavMovie = edtxtLstNameField.getText().toString();

        //This is the code for displaying the text after pressing, "Start Conversation".

        txtvwGreetingSpace.setText(String.format(res.getString(R.string.strGreeting), strFavFood, strFavColor, strFavMovie));
    }
}
