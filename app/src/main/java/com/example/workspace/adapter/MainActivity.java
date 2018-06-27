package com.example.workspace.adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.workspace.adapter.adapter.Translator;
import com.example.workspace.adapter.implementations.GaganSir;
import com.example.workspace.adapter.interfaces.Bengali;

public class MainActivity extends AppCompatActivity
{
    TextView translate;
    Button bth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        translate();
    }
    void initViews()
    {
        translate = findViewById (R.id.translate);
        bth = findViewById (R.id.bth);
    }
    void translate()
    {
        bth.setOnClickListener (new View.OnClickListener ()
        {
            @Override
            public void onClick (View view)
            {
                GaganSir obj = new GaganSir ();
                Bengali talkObj = new Translator (obj);
                String text = talkObj.speak();
                translate.setText (text);
            }
        });
    }
}
