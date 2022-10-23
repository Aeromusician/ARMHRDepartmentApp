package it.mirea.armhrdep;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.ListFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onResume() {
        super.onResume();


        //new LoginScreenFragment();

        // Переходить на фрагменты вот так
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container, new LoginRegisterScreenFragment())
                .addToBackStack(null)
                .commit();
    }
}