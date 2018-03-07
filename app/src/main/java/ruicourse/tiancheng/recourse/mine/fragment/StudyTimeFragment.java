package ruicourse.tiancheng.recourse.mine.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ruicourse.tiancheng.recourse.R;
import ruicourse.tiancheng.recourse.mine.adapter.StudyNoteAdapter;
import ruicourse.tiancheng.recourse.mine.adapter.StudyTimeAdapter;
import ruicourse.tiancheng.recourse.mine.data.entity.StudyNoteData;
import ruicourse.tiancheng.recourse.mine.data.entity.StudyTimeData;

import static ruicourse.tiancheng.recourse.SizeManager.dp2px;
import static ruicourse.tiancheng.recourse.mine.data.dao.MineData.getStudyNoteData;
import static ruicourse.tiancheng.recourse.mine.data.dao.MineData.getStudyTimeData;

/**
 * A simple {@link Fragment} subclass.
 */
public class StudyTimeFragment extends Fragment {
    private RecyclerView rv;

    private View bottomNav;

    public StudyTimeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_study_time, container, false);
        initView(view);
        setRecyclerView(view);
        return view;
    }

    private void initView(View view) {
        rv = (RecyclerView) view.findViewById(R.id.rv_study_time);
        bottomNav = this.getActivity().findViewById(R.id.bottom_nav_main);
    }

    private void setRecyclerView(View view) {
        List<StudyTimeData> dataList = getStudyTimeData();
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setAdapter(new StudyTimeAdapter(getActivity(), dataList));
        rv.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (dy > 0) {
                    ViewCompat.animate(bottomNav).translationY(dp2px(getActivity(), 56));
                } else {
                    ViewCompat.animate(bottomNav).translationY(0);
                }
            }
        });
    }

}
