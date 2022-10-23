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

public class RegisterScreenFragment extends Fragment {
    String email;
    String name;
    String family;
    String pass1;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.register, container, false).getRootView();
        EditText emailLine = view.findViewById(R.id.email_address_reg);
        EditText nameLine = view.findViewById(R.id.reg_name);
        EditText familyLine = view.findViewById(R.id.reg_family);
        EditText passWord1 = view.findViewById(R.id.password_first);


        emailLine.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                email = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        nameLine.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                name = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        familyLine.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                family = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        passWord1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                pass1 = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        Button doneButton = view.findViewById(R.id.done_button);
        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //осуществляем вход)
            }
        });
        return view;
    }
}
