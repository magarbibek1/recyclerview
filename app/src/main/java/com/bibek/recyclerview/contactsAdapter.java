package com.bibek.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class contactsAdapter extends RecyclerView.Adapter<contactsAdapter.ViewHolder>{
    MainActivity mcontext;
    List<contacts>contactsList;

    public contactsAdapter(MainActivity mcontext, List<contacts> contactsList) {
        this.mcontext = mcontext;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_contacts,parent,
                false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        contacts contacts =contactsList.get(position);
        holder.imageprofile.setImageResource(contacts.getImageId());
        holder.tvName.setText(contacts.getName());
        holder.tvPhone.setText(contacts.getPhone());

    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageprofile;
        TextView tvName,tvPhone;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageprofile=itemView.findViewById(R.id.imageView);
            tvName=itemView.findViewById(R.id.textView);
            tvPhone=itemView.findViewById(R.id.textView4);
        }
    }
}
