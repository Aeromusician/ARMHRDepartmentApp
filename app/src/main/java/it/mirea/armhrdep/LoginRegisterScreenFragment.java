package it.mirea.armhrdep;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.ListFragment;

public class LoginRegisterScreenFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login_register, container, false).getRootView();
        Button loginButton = view.findViewById(R.id.buttonLogin);
        Button registerButton = view.findViewById(R.id.buttonRegister);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getParentFragmentManager().beginTransaction().replace(R.id.fl_container, new LoginScreenFragment()).
                        addToBackStack(null).commit();

            }
        });
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //тут будет переход в окно регистрации
                getParentFragmentManager().beginTransaction().replace(R.id.fl_container,
                        new RegisterScreenFragment()).addToBackStack(null).commit();
            }
        });
        return view;
    }
}
