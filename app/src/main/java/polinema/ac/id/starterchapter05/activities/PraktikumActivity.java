package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.praktikumFragment.dipsFragment;
import polinema.ac.id.starterchapter05.praktikumFragment.handstandFragment;
import polinema.ac.id.starterchapter05.praktikumFragment.pushupFragment;

public class PraktikumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktikum);
    }

    public void handlerClickPushup(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.replace(R.id.fragment_placeHolder,new pushupFragment());
        fragmentTransaction.commit();
    }

    public void handlerClickDips(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.replace(R.id.fragment_placeHolder,new dipsFragment());
        fragmentTransaction.commit();
    }

    public void handlerClickHandstand(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.replace(R.id.fragment_placeHolder,new handstandFragment());
        fragmentTransaction.commit();
    }
}
