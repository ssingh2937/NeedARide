package com.app.ride.authentication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.app.ride.R;
import com.app.ride.authentication.model.DriverRequestModel;
import com.app.ride.authentication.utility.Globals;
import com.bumptech.glide.Glide;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class DriverRideListAdapter extends RecyclerView.Adapter<DriverRideListAdapter.ViewHolder> {
    private ArrayList<DriverRequestModel> dataList;
    private Context context;
    private OnViewClick listener;
    Globals globals;


    public  DriverRideListAdapter(Context context, ArrayList<DriverRequestModel> listData, OnViewClick listener) {
        this.dataList = listData;
        this.context = context;
        this.listener = listener;
        globals = new Globals();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        AppCompatTextView tvDateOfJourney,tvStartPlace,tvEndPlace,tvSeatAvailable,tvCostPerSeat,tvEdit,tvRiderName;
        CardView cdDriver;
        ImageView ivRiderProfile;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDateOfJourney = itemView.findViewById(R.id.tvDateOfJourney);
            tvStartPlace= itemView.findViewById(R.id.tvStartPlace);
            tvEndPlace= itemView.findViewById(R.id.tvEndPlace);
            tvSeatAvailable= itemView.findViewById(R.id.tvSeatAvailable);
            tvCostPerSeat= itemView.findViewById(R.id.tvCostPerSeat);
            tvEdit= itemView.findViewById(R.id.tvEdit);
            tvRiderName = itemView.findViewById(R.id.tvRiderName);
            ivRiderProfile = itemView.findViewById(R.id.riderImage);

            cdDriver = itemView.findViewById(R.id.cdDriver);
        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.driver_ride_cell, parent, false));
    }

    public interface OnViewClick{
        void onEditClick(DriverRequestModel model);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DriverRequestModel model = dataList.get(position);
        holder.tvDateOfJourney.setText(/*context.getString(R.string.text_dis_date)+" - "+*/model.getDateOfJourney());
        holder.tvStartPlace.setText(/*context.getString(R.string.text_start__dis_place)+" - "+*/model.getStartPlace());
        holder.tvEndPlace.setText(/*context.getString(R.string.text_end_dis_place)+" - "+*/model.getEndPlace());
        holder.tvSeatAvailable.setText(/*context.getString(R.string.text_number_of_seat_available_dis)+" - "+*/String.valueOf(model.getSeatAvailable()) + " seats left");
        holder.tvCostPerSeat.setText(/*context.getString(R.string.text_cost_per_seat_dis)+" - "+*/"$ "+model.getCostPerSeat());
        holder.tvRiderName.setText(/*context.getString(R.string.driver_name)+"-"+*/model.getName());

        //Glide.with(context).load(model.getProfilePic()).into(holder.ivRiderProfile);

        /*if (globals.getUserDetails(context) != null) {
            Glide.with(context)
                    .load(globals.getUserDetails(context).getProfilePic())
                    .into(holder.ivRiderProfile);
        }*/
        /*holder.tvEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onEditClick(model);
            }
        });*/

        holder.cdDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onEditClick(model);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}

