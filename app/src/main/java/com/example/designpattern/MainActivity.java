package com.example.designpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("TAG", "TAG");

        Duck mallard = new MallardDuck();
        mallard.perfermQuack();
        mallard.preformFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.perfermQuack();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.preformFly();
    }
}