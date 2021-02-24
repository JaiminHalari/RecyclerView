package james.my.recyclerviewdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    MyDataLists[] myData;

    public RecyclerViewAdapter(MyDataLists[] myData) {
        this.myData = myData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_list_layout,parent,false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.MainImage.setImageResource(myData[position].getMainImage());
        holder.Name.setText(myData[position].getName());
        holder.Description.setText(myData[position].getDescription());
        holder.SubImage.setImageResource(myData[position].getSubImage());
    }

    @Override
    public int getItemCount() {
        return myData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView MainImage,SubImage;
        TextView Name,Description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            MainImage = itemView.findViewById(R.id.imageview_id);
            SubImage = itemView.findViewById(R.id.imageview_second_id);
            Name = itemView.findViewById(R.id.txt_name);
            Description = itemView.findViewById(R.id.txt_description);

        }
    }
}
