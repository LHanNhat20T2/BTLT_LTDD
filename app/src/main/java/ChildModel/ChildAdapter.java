package ChildModel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bttonghoplt.R;

import java.util.List;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ViewHolder> {

    List<ChildModelClass> childModelClassList;
    Context context;

    public ChildAdapter(List<ChildModelClass> childModelClassList, Context context) {
        this.childModelClassList = childModelClassList;
        this.context = context;
    }


    @NonNull
    @Override
    public ChildAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_child,null,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChildAdapter.ViewHolder holder, int position) {
        holder.iv_child_img.setImageResource(childModelClassList.get(position).image);
    }

    @Override
    public int getItemCount() {
        return childModelClassList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_child_img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_child_img = itemView.findViewById(R.id.iv_child_item);
        }
    }
}