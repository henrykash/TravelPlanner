package bhouse.travellist_starterproject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

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
        return null;
    }

    @Override
    public void onBindViewHolder(TravelListAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
    }
}
