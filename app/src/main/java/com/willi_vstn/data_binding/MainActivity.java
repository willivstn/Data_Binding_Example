package com.willi_vstn.data_binding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.TextView;

import com.willi_vstn.data_binding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person person1 = new Person("Jack", "jack@gmail.com");

        activityMainBinding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
        );
        activityMainBinding.setPerson(person1);


    }



}