package com.example.administrator.myfragment;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)this.findViewById(R.id.button);
        button.setOnClickListener(this);
       replaceFragment(new RightFragment());
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
               replaceFragment(new AnotherRightFragment());
                break;
            default:
                break;
    }
}
 private void replaceFragment(android.support.v4.app.Fragment fragment){
     FragmentManager fragmentManager = this.getSupportFragmentManager();
     FragmentTransaction transaction = fragmentManager.beginTransaction();
     transaction.replace(R.id.right_layout,fragment);
     transaction.addToBackStack(null);
     transaction.commit();
   }
 }
