package com.bibek.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

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
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        final contacts con =contactsList.get(i);
        holder.imageprofile.setImageResource(con.getImageId());
        holder.tvName.setText(con.getName());
        holder.tvPhone.setText(con.getPhone());
        holder.imageprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(mcontext,details.class);
                intent.putExtra("image",con.getImageId());
                intent.putExtra("name",con.getName());
                intent.putExtra("phone",con.getPhone());
                mcontext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
         CircleImageView imageprofile;
        TextView tvName,tvPhone;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageprofile=itemView.findViewById(R.id.imageView);
            tvName=itemView.findViewById(R.id.textView);
            tvPhone=itemView.findViewById(R.id.textView4);
        }
    }
}
