package it.mirea.armhrdep;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListFragment extends Fragment {

    private RecyclerView recyclerView;

    private ListAdapter<Employee, EmployeesAdapter.ViewHolder> adapter = new EmployeesAdapter(new EmployeesAdapter.DiffUtilCallback());

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_employees_list, container, false).getRootView();

        recyclerView = view.findViewById(R.id.rv_employees);

        recyclerView.setAdapter(
                adapter
        );

        List<Employee> emp = new ArrayList<>();

        emp.add(new Employee("Вася", "Пупкин", "Стоматолог"));
        emp.add(new Employee("Иван", "Пупкин", "Практолог"));
        emp.add(new Employee("Федя", "Пупкин", "Уролог"));

        adapter.submitList(emp);

        return view;

    }
}
