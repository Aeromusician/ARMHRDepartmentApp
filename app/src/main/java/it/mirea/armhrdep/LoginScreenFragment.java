package it.mirea.armhrdep;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LoginScreenFragment extends Fragment {
    String loginMessage;
    String registerMessage;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login, container, false).getRootView();
        EditText login_line = view.findViewById(R.id.login_line);
        EditText register_line = view.findViewById(R.id.password_line);
        Button loginButton = view.findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //тут мы в бд проходим по списку и если логин и пароль
                // совпадают делаем вход и открываем список сотрудников
            }
        });
        login_line.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                loginMessage = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        register_line.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                registerMessage = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        return view;
    }

}
