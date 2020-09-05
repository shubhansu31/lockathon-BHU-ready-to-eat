package com.e.untammeddragons;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
//    List<String> itemList;
//    List<Integer> priceList;
//    List<Integer> imageList;
//
//    public MyAdapter(List<Integer> imageList, List<String> itemList, List<Integer> priceList) {
//        this.itemList = itemList;
//        this.priceList = priceList;
//        this.imageList = imageList;
//    }

    List<MenuItems> menuItems = Arrays.asList(
            new MenuItems(R.drawable.aloo_paratha,"Aloo-Paratha", 45),
            new MenuItems(R.drawable.burger,"Burger", 25),
            new MenuItems(R.drawable.chole_bhature,"Chole-Bhature", 45),
            new MenuItems(R.drawable.coffee,"Coffee", 20),
            new MenuItems(R.drawable.cold_coffee,"Cold-Coffee", 30),
            new MenuItems(R.drawable.hot_dog,"Hot-Dog", 20),
            new MenuItems(R.drawable.masala_dosa,"Masala-Dosa", 45),
            new MenuItems(R.drawable.plain_dosa,"Plain-Dosa", 35),
            new MenuItems(R.drawable.samosa,"Samosa", 10),
            new MenuItems(R.drawable.tea,"Tea", 10));

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.my_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MenuItems current = menuItems.get(position);
        holder.itemName_txt.setText(current.getItemName());
        holder.price_txt.setText(Integer.toString(current.getPrice()));
        holder.imgView.setImageResource(current.getImage());
        holder.containerView.setTag(current);
    }

    @Override
    public int getItemCount() {
        return menuItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgView;
        public TextView itemName_txt, price_txt;
        public Button btnAdd;
        public ConstraintLayout containerView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            containerView = itemView.findViewById(R.id.item_row);
            imgView = itemView.findViewById(R.id.imageView);
            itemName_txt = itemView.findViewById(R.id.itemName);
            price_txt = itemView.findViewById(R.id.price);
            btnAdd = itemView.findViewById(R.id.addItem);

            containerView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MenuItems current = (MenuItems) containerView.getTag();
                    Intent intent = new Intent(view.getContext(), ItemActivity.class);
                    intent.putExtra("image", current.getImage());
                    intent.putExtra("name", current.getItemName());
                    intent.putExtra("price", current.getPrice());

                    view.getContext().startActivity(intent);
                }
            });
            btnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MenuItems current = (MenuItems) containerView.getTag();
                    Intent intent = new Intent(view.getContext(), CartMain.class);
                    intent.putExtra("name", current.getItemName());
                    intent.putExtra("price", current.getPrice());

                    view.getContext().startActivity(intent);
                }
            });
        }
    }

}
