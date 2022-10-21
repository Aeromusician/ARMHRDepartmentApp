package it.mirea.armhrdep;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

public class EmployeesAdapter extends ListAdapter<Employee, EmployeesAdapter.ViewHolder> {

    protected EmployeesAdapter(@NonNull androidx.recyclerview.widget.DiffUtil.ItemCallback diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_employee, parent, false).getRootView());
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(getCurrentList().get(position));
    }

    @Override
    public int getItemCount() {
        return super.getItemCount();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private Employee employee;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(Employee employee) {
            this.employee = employee;

            TextView tvName = itemView.getRootView().findViewById(R.id.tvName);
            TextView tvSecondName = itemView.getRootView().findViewById(R.id.tvSecondName);
            TextView tvSector = itemView.getRootView().findViewById(R.id.tvSector);


            tvName.setText(employee.name);
            tvSecondName.setText(employee.secondName);
            tvSector.setText(employee.sector);
        }


    }

    static class DiffUtilCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<Employee> {

        @Override
        public boolean areItemsTheSame(@NonNull Employee oldItem, @NonNull Employee newItem) {
            return oldItem.equals(newItem);
        }

        @Override
        public boolean areContentsTheSame(@NonNull Employee oldItem, @NonNull Employee newItem) {
            return oldItem.equals(newItem);
        }
    }
}
