package com.e.untammeddragons;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {

    List<CanteenList> canteens = Arrays.asList(
            new CanteenList("Medi-Caps University Campus Canteen"),
            new CanteenList("Kulhad Restaurant"),
            new CanteenList("Gurukripa Restaurant")
    );

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_home, parent, false);
        HomeViewHolder homeViewHolder = new HomeViewHolder(view);
        return homeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        CanteenList current = canteens.get(position);
        holder.canteen.setText(current.getCanteenName());
        holder.homeContainerView.setTag(current);
    }

    @Override
    public int getItemCount() {
        return canteens.size();
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder {

        public TextView canteen;
        public ConstraintLayout homeContainerView;

        public HomeViewHolder(@NonNull View itemView) {
            super(itemView);

            canteen = itemView.findViewById(R.id.canteen);
            homeContainerView = itemView.findViewById(R.id.home_row);

            homeContainerView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CanteenList current = (CanteenList) homeContainerView.getTag();
                    Intent intent = new Intent(view.getContext(), Menu.class);
                    intent.putExtra("canteenName", current.getCanteenName());

                    view.getContext().startActivity(intent);
                }
            });
        }
    }
}
