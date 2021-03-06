package bhouse.travellist_starterproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by valentine on 12/15/15.
 */

public class TravelListAdapter extends RecyclerView.Adapter<TravelListAdapter.ViewHolder> {
    Context mContext;

    public TravelListAdapter(Context context) {
        this.mContext = context;
    }


    @Override
    public TravelListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_places, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TravelListAdapter.ViewHolder holder, int position) {
        final Place place = new PlaceData().placeList().get(position);
        holder.placeName.setText(place.name);
        Picasso.with(mContext).load(place.getImageResourceId(mContext)).into(holder.placeImage);

    }

    @Override
    public int getItemCount() {
        return new PlaceData().placeList().size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder implements bhouse.travellist_starterproject.ViewHolder {
        public LinearLayout placeHolder;
        public LinearLayout placeNameHolder;
        public TextView placeName;
        public ImageView placeImage;
        AdapterView.OnItemClickListener mItemClickListener;




        public ViewHolder(View itemView) {
            super(itemView);
            placeHolder = (LinearLayout) itemView.findViewById(R.id.mainHolder);
            placeName = (TextView) itemView.findViewById(R.id.placeName);
            placeNameHolder = (LinearLayout) itemView.findViewById(R.id.placeNameHolder);
            placeImage = (ImageView) itemView.findViewById(R.id.placeImage);


        }

        @Override
        public void onClick(View v) {

        }


    }
}
