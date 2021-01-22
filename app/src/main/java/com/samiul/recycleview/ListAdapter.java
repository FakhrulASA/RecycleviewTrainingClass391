package com.samiul.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewClass> {


    LayoutInflater inflater;
    Context context;
    List<String> name;
    List<String> title;

    public ListAdapter(Context context, List<String> name, List<String> title) {
        this.context = context;
        this.name = name;
        this.title = title;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ListAdapter.ViewClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view= inflater.inflate(R.layout.list_item,parent,false);
            return new ViewClass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewClass holder, int position) {
         holder.names.setText(name.get(position));
         holder.titles.setText(title.get(position));
         holder.names.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(context,name.get(position),Toast.LENGTH_SHORT).show();
             }
         });
    }

    @Override
    public int getItemCount() {
        return name.size();
    }

    public class ViewClass extends RecyclerView.ViewHolder {
        TextView names, titles;
        public ViewClass(@NonNull View itemView) {
            super(itemView);
            names=itemView.findViewById(R.id.nametext);
            titles=itemView.findViewById(R.id.titletext);

        }
    }
}
