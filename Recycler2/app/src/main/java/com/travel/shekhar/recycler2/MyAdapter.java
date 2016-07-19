package com.travel.shekhar.recycler2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private ArrayList<PersonData> peopleDataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewShop;
        TextView textViewAmount;
        TextView textViewOrder;
        TextView textViewDate;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewShop = (TextView) itemView.findViewById(R.id.textViewShop);
            this.textViewAmount = (TextView) itemView.findViewById(R.id.textViewAmount);
            this.textViewOrder= (TextView) itemView.findViewById(R.id.textViewOrder);
            this.textViewDate= (TextView) itemView.findViewById(R.id.textViewDate);

        }
    }

    public MyAdapter(ArrayList<PersonData> people) {
        this.peopleDataSet = people;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);



        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView textViewShop = holder.textViewShop;
        TextView textViewAmount = holder.textViewAmount;
        TextView textViewOrder = holder.textViewOrder;
        TextView textViewDate = holder.textViewDate;

        textViewShop.setText(peopleDataSet.get(listPosition).getShop());
        textViewAmount.setText(peopleDataSet.get(listPosition).getAmount());
        textViewOrder.setText(peopleDataSet.get(listPosition).getOrder());
        textViewDate.setText(peopleDataSet.get(listPosition).getDate());

    }

    @Override
    public int getItemCount() {
        return peopleDataSet.size();
    }
}
