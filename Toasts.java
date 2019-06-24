package com.example.anany.edittextsandmultipleactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		//Create a Toast Object to last for 4 seconds displaying the text "Subscribe to IJ Apps"
        Toast toast = Toast.makeText(getApplicationContext(), "Subscribe to IJ Apps", Toast.LENGTH_LONG);
		
		//Set the Toast Gravity to the top left of the screen. Provide some margin of 10px to the left and 20 px to the top.
		toast.setGravity(Gravity.LEFT|Gravity.TOP, 10, 20);

		//Percentages for length of Toast in relation to the horizontal distance of the screen and vertical distance of screen.
		toast.setMargin(10,20);
		
		//DISPLAY THE TOAST!
		toast.show();

    }
}
