package ruicourse.tiancheng.recourse.mine.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import ruicourse.tiancheng.recourse.R;
import ruicourse.tiancheng.recourse.UpImageView;
import ruicourse.tiancheng.recourse.mine.data.entity.JoinedCourseData;

/**
 * Created by 10919 on 2018/3/6/006.
 */

public class JoinedCourseAdapter extends RecyclerView.Adapter {

    private Context mContext = null;
    private List<JoinedCourseData> dataList = null;

    public JoinedCourseAdapter(Context mContext, List<JoinedCourseData> dataList) {
        this.mContext = mContext;
        this.dataList = dataList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_joined_course, parent, false));
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        /*Glide.with(mContext).load(dataList.get(position).getImg()).into(((ViewHolder)holder).img);
        ((ViewHolder)holder).name.setText(dataList.get(position).getName());*/
        ((ViewHolder)holder).name.setText("课程名称");
    }

    @Override
    public int getItemCount() {
        /*return dataList.size();*/
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        UpImageView img;
        TextView name;

        public ViewHolder(View itemView) {
            super(itemView);
            img = (UpImageView)itemView.findViewById(R.id.iv_img_item_joined_course);
            name = (TextView)itemView.findViewById(R.id.tv_name_item_joined_course);
        }
    }

}
