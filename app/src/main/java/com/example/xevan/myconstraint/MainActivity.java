package com.example.xevan.myconstraint;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.WindowManager;
import android.widget.TextView;

import static android.view.Gravity.CENTER;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WindowManager windowManager = MainActivity.this.getWindowManager();
        Display display = windowManager.getDefaultDisplay();

        TextView txtHello = findViewById(R.id.txt_Hello);
        TextView txtWorld = findViewById(R.id.txt_World);

        ConstraintLayout.LayoutParams layoutParams_Hello = (ConstraintLayout.LayoutParams) txtHello.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams_World = (ConstraintLayout.LayoutParams) txtWorld.getLayoutParams();

        txtHello.setGravity(CENTER);
        layoutParams_Hello.width = display.getWidth();
        layoutParams_Hello.height = display.getHeight() / 2;
        txtWorld.setGravity(CENTER);
        layoutParams_World.topMargin = 0;
        layoutParams_World.topToBottom = R.id.txt_Hello;
        layoutParams_World.leftToLeft = R.id.txt_Hello;
        layoutParams_World.width = 80;

    }
}

