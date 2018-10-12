package com.test.snackbarleakdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LeakActivity extends AppCompatActivity {
    private Snackbar snackbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leak);
        View root = findViewById(R.id.root);
        snackbar = Snackbar.make(root, "This is a prompt.", Snackbar.LENGTH_SHORT);
    }

    private void showPrompt(){
        if(snackbar != null){
            snackbar.show();
        }
    }

    private void hidePrompt(){
        if(snackbar != null){
            snackbar.dismiss();
        }
    }

}
