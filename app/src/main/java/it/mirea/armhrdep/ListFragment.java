package it.mirea.armhrdep;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;

import java.util.ArrayList;
import java.util.List;

public class ListFragment extends Fragment {

    private RecyclerView recyclerView;

    private ListAdapter<Employee, EmployeesAdapter.ViewHolder> adapter = new EmployeesAdapter(new EmployeesAdapter.DiffUtilCallback());

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_employees_list, container, false).getRootView();
        FirebaseDatabase db;
        FirebaseAuth auth;
        DatabaseReference users;
        auth = FirebaseAuth.getInstance();
        db = FirebaseDatabase.getInstance();
        users = db.getReference("users");
        recyclerView = view.findViewById(R.id.rv_employees);

        recyclerView.setAdapter(adapter);

        List<Employee> emp = new ArrayList<>();

        users.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                ArrayList<Employee> list = new ArrayList<>();
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    Log.d("Тут", dataSnapshot.getKey());
                    Employee employee = dataSnapshot.getValue(Employee.class);
                    Log.d("Работяга", employee.toString());
                    list.addAll(adapter.getCurrentList());
                    list.add(employee);
                }
                adapter.submitList(list);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                error.getMessage();
            }
        });

        return view;

    }
}
