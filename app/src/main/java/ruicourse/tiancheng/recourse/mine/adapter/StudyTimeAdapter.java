package ruicourse.tiancheng.recourse.mine.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import ruicourse.tiancheng.recourse.R;
import ruicourse.tiancheng.recourse.UpImageView;
import ruicourse.tiancheng.recourse.mine.data.entity.StudyNoteData;
import ruicourse.tiancheng.recourse.mine.data.entity.StudyTimeData;

/**
 * Created by 10919 on 2018/3/6/006.
 */

public class StudyTimeAdapter extends RecyclerView.Adapter {

    private Context mContext = null;
    private List<StudyTimeData> dataList = null;

    public StudyTimeAdapter(Context mContext, List<StudyTimeData> dataList) {
        this.mContext = mContext;
        this.dataList = dataList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_study_time, parent, false));
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
       /*Glide.with(mContext).load(dataList.get(position).getImg()).into(((ViewHolder)holder).img);
        ((ViewHolder)holder).name.setText(dataList.get(position).getName());
        ((ViewHolder)holder).time.setText(dataList.get(position).getTime());*/
        Glide.with(mContext).load(R.drawable.bg_more_light_glory).into(((ViewHolder)holder).img);
        ((ViewHolder)holder).name.setText("用户名");
        ((ViewHolder)holder).time.setText("时长");
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
        TextView time;

        public ViewHolder(View itemView) {
            super(itemView);

            img = (UpImageView) itemView.findViewById(R.id.iv_img_item_study_time);
            name = (TextView)itemView.findViewById(R.id.tv_name_item_study_time);
            time = (TextView)itemView.findViewById(R.id.tv_time_item_study_time);
        }
    }

}
