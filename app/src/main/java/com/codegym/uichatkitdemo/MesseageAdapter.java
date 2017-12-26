package com.codegym.uichatkitdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TienBM on 12/26/2017.
 */
public class MesseageAdapter extends RecyclerView.Adapter<MesseageAdapter.ViewHolder> {

    private static final String TAG = MesseageAdapter.class.getSimpleName();
    private Context mContext;
    private List<MesseageEntity> mList;

    public MesseageAdapter(Context context) {
        this.mContext = context;
        this.mList = new ArrayList<>();

    }

    public void addMesseage(MesseageEntity messeageEntity) {
        this.mList.add(0, messeageEntity);
        notifyItemInserted(0);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.item_chat, parent, false);
        if(viewType==1){
            view = inflater.inflate(R.layout.item_chat_in, parent, false);
        }
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MesseageEntity item = mList.get(position);
        holder.tvMsgConent.setText(item.getContent());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return mList.get(position).getId();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvMsgConent;

        //TODO Bind views
        public ViewHolder(View itemView) {
            super(itemView);
            tvMsgConent = itemView.findViewById(R.id.tvMsgConent);
        }
    }
}