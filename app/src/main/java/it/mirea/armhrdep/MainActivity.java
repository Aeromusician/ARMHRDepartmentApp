package it.mirea.armhrdep;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onResume() {
        super.onResume();

        //Переходить на фрагменты вот так
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container, new ListFragment())
                .addToBackStack(null)
                .commit();
    }
}