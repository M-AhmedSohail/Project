package com.project.i200557_i200405_i200590;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class JournalRVAdapter extends RecyclerView.Adapter<JournalRVAdapter.MyViewHolder> {

    Context c;
    List<JournalEntries> ls;

    public JournalRVAdapter(Context c, List<JournalEntries> ls) {
        this.c = c;
        this.ls = ls;
    }

    @NonNull
    @Override
    public JournalRVAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(c).inflate(R.layout.journal,null,false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull JournalRVAdapter.MyViewHolder holder, int position) {

        holder.title.setText(ls.get(position).getTitle());
        holder.description.setText(ls.get(position).getDescription());
        holder.day.setText(ls.get(position).getDay());
        holder.date.setText(ls.get(position).getDate());
        holder.time.setText(ls.get(position).getTime());
        holder.location.setText(ls.get(position).getLocation());
        /*holder.ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_DIAL, Uri.parse("title :" + ls.get(position).getTitle()));
                c.startActivity(intent);
            }
        });*/



    }

    @Override
    public int getItemCount() {
        return ls.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title, description, day, date, time, location;
        LinearLayout ll;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            description=itemView.findViewById(R.id.description);
            day=itemView.findViewById(R.id.day);
            date=itemView.findViewById(R.id.date);
            time=itemView.findViewById(R.id.time);
            location=itemView.findViewById(R.id.location);
            ll=itemView.findViewById(R.id.ll);

        }
    }
}
