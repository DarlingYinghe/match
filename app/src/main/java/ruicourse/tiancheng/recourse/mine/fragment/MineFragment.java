package ruicourse.tiancheng.recourse.mine.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import ruicourse.tiancheng.recourse.MainFragmentPagerAdapter;
import ruicourse.tiancheng.recourse.R;
import ruicourse.tiancheng.recourse.UpImageView;

import static ruicourse.tiancheng.recourse.mine.data.dao.MineData.getMineFragments;
import static ruicourse.tiancheng.recourse.mine.data.dao.MineData.getStatisticsSumes;
import static ruicourse.tiancheng.recourse.mine.data.dao.MineData.getStatisticsTitles;

/**
 * A simple {@link Fragment} subclass.
 */
public class MineFragment extends Fragment {

    private static final String TAG = "MineFragment";
    private static boolean firstLoad = true;

    UpImageView ivAvatar;
    TextView tvName;
    TabLayout statistics;

    ViewPager vp;


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        if(isVisibleToUser&&firstLoad) {
            firstLoad = false;
            Log.i(TAG, "setUserVisibleHint: "+firstLoad);
            Glide.with(getActivity()).load(R.drawable.avatar).into(ivAvatar);
        }
        super.setUserVisibleHint(isVisibleToUser);
    }

    public MineFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mine, container, false);
        initView(view);
        setStatistics();
        setViewPager();

        return view;
    }



    private void initView(View view) {
        ivAvatar = (UpImageView)view.findViewById(R.id.iv_avatar_mine);
        statistics = (TabLayout)view.findViewById(R.id.statistics_mine);
        tvName = (TextView)view.findViewById(R.id.name_mine);
        vp = (ViewPager) view.findViewById(R.id.vp_mine);
    }

    private void setStatistics() {
        String[] sums = getStatisticsSumes();
        int[] titles = getStatisticsTitles();


        for (int i = 0; i < 3; i++) {
            View itemView = LayoutInflater.from(getActivity()).inflate(R.layout.statistics_item, null);
            TextView tvSum = itemView.findViewById(R.id.statistics_mine_sum);
            TextView tvTitle = itemView.findViewById(R.id.statistics_mine_title);
            tvSum.setText(sums[i]);
            tvTitle.setText(titles[i]);
            statistics.getTabAt(i).setCustomView(itemView);
        }

        statistics.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setViewPager() {

        //将Fragment存入数组
        Fragment[] fragments = getMineFragments();

        //适配器
        vp.setAdapter(new MainFragmentPagerAdapter(getActivity().getSupportFragmentManager(), fragments));

        //设置屏幕外页面数量上限
        vp.setOffscreenPageLimit(2);

        //添加视图切换事件监听器
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                statistics.getTabAt(position).select();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


}
