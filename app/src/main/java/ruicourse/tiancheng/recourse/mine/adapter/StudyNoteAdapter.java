package ruicourse.tiancheng.recourse.mine.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ruicourse.tiancheng.recourse.R;
import ruicourse.tiancheng.recourse.UpImageView;
import ruicourse.tiancheng.recourse.mine.data.entity.JoinedCourseData;
import ruicourse.tiancheng.recourse.mine.data.entity.StudyNoteData;

/**
 * Created by 10919 on 2018/3/6/006.
 */

public class StudyNoteAdapter extends RecyclerView.Adapter {

    private Context mContext = null;
    private List<StudyNoteData> dataList = null;

    public StudyNoteAdapter(Context mContext, List<StudyNoteData> dataList) {
        this.mContext = mContext;
        this.dataList = dataList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_study_note, parent, false));
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
       /* ((ViewHolder)holder).title.setText(dataList.get(position).getTitle());
        ((ViewHolder)holder).content.setText(dataList.get(position).getContent());
        ((ViewHolder)holder).date.setText(dataList.get(position).getDate());*/
        ((ViewHolder)holder).title.setText("手记标题");
        ((ViewHolder)holder).content.setText("手机内容");
        ((ViewHolder)holder).date.setText("手记日期");
    }

    @Override
    public int getItemCount() {
        /*return dataList.size();*/
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView title;
        TextView content;
        TextView date;

        public ViewHolder(View itemView) {
            super(itemView);

            title = (TextView)itemView.findViewById(R.id.tv_title_item_study_note);
            content = (TextView)itemView.findViewById(R.id.tv_content_item_study_note);
            date = (TextView)itemView.findViewById(R.id.tv_date_item_study_note);
        }
    }

}
