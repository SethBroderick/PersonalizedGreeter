package com.example.pbuskell.personalizedgreeter;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class BeGreeted extends AppCompatActivity {
    //This App was created by Seth Friedenberger.
    //I made this idea on a story board, but had modified it along the way due to the fact that
    //the way I imagined it would be far to advanced for my level.
    //I implemented code structure from apps I have made in the past. (Never have coded before)

    String strFavFood = "";
    String strFavColor = "";
    String strFavMovie = "";

    //Code for the "Start Conversation" button.

    Button btnStartConvo;
    EditText edtxtFdField;
    EditText edtxtClrField;
    EditText edtxtMvieField;
    TextView txtvwGreetingSpace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_greeted);

        btnStartConvo = (Button) findViewById(R.id.btnStartConvo);
        edtxtFdField = (EditText) findViewById(R.id.edtxtFdField);
        edtxtClrField = (EditText) findViewById(R.id.edtxtClrField);
        edtxtMvieField = (EditText) findViewById(R.id.edtxtMvieField);
        txtvwGreetingSpace = (TextView) findViewById(R.id.txtvwGreetingSpace);
    }

    public void greetTheUser(View vw)
    {
        Resources res = getResources();

        strFavFood = edtxtFdField.getText().toString();
        strFavColor = edtxtClrField.getText().toString();
        strFavMovie = edtxtMvieField.getText().toString();

        //This is the code for displaying the text after pressing, "Start Conversation".

        txtvwGreetingSpace.setText(String.format(res.getString(R.string.strGreeting), strFavFood, strFavColor, strFavMovie));
    }
}
