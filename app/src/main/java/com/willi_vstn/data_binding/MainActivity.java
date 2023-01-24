package com.willi_vstn.data_binding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.willi_vstn.data_binding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private MainActivityClickHandlers clickHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person person1 = new Person("Jack", "jack@gmail.com");

        //TextView
        activityMainBinding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
        );
        activityMainBinding.setPerson(person1);

        //Binding the handler
        clickHandler = new MainActivityClickHandlers(this);
        activityMainBinding.setClickHandler(clickHandler);


    }

    public class MainActivityClickHandlers{
        Context context;

        public MainActivityClickHandlers(Context context) {
            this.context = context;
        }

        //First Button click handling
        public void onButton1Click(View view){
            Toast.makeText(context, "Hello!", Toast.LENGTH_SHORT).show();
        }

        //Second Button click handling
        public void onButton2Click(View view){
            Toast.makeText(context, "Bye!", Toast.LENGTH_SHORT).show();
        }
    }

}