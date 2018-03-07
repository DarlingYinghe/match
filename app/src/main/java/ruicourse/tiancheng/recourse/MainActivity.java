package ruicourse.tiancheng.recourse;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.luseen.luseenbottomnavigation.BottomNavigation.BottomNavigationItem;
import com.luseen.luseenbottomnavigation.BottomNavigation.BottomNavigationView;
import com.luseen.luseenbottomnavigation.BottomNavigation.OnBottomNavigationItemClickListener;

import ruicourse.tiancheng.recourse.discover.DiscoverFragment;
import ruicourse.tiancheng.recourse.download.DownloadFragment;
import ruicourse.tiancheng.recourse.mine.fragment.MineFragment;
import ruicourse.tiancheng.recourse.video.VideoFragment;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private BottomNavigationView bottomNav;//底部导航栏
    private ViewPager container;//包含主要Fragment的容器
    private View searchBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setBottomNav();
        setContainer();

        container.setCurrentItem(0);



    }


    /**
     * 初始化所有控件
     */
    private void initView() {
        bottomNav = (BottomNavigationView) findViewById(R.id.bottom_nav_main);
        container = (ViewPager) findViewById(R.id.container_main);
        searchBar = (View)findViewById(R.id.search_bar_main);
    }

    /**
     * 设置底部导航栏
     */
    private void setBottomNav() {
        //创建按钮
        BottomNavigationItem bottomNavigationItem1 = new BottomNavigationItem
                ("首页", ContextCompat.getColor(this, R.color.cany3), R.drawable.btn_video);
        BottomNavigationItem bottomNavigationItem2 = new BottomNavigationItem
                ("发现", ContextCompat.getColor(this, R.color.springGreen3), R.drawable.btn_discover);
        BottomNavigationItem bottomNavigationItem3 = new BottomNavigationItem
                ("下载", ContextCompat.getColor(this, R.color.chocolate1), R.drawable.btn_download);
        BottomNavigationItem bottomNavigationItem4 = new BottomNavigationItem
                ("我的", ContextCompat.getColor(this, R.color.pink), R.drawable.btn_mine);

        //添加按钮
        bottomNav.addTab(bottomNavigationItem1);
        bottomNav.addTab(bottomNavigationItem2);
        bottomNav.addTab(bottomNavigationItem3);
        bottomNav.addTab(bottomNavigationItem4);

        //添加点击切换事件监听器
        bottomNav.setOnBottomNavigationItemClickListener(new OnBottomNavigationItemClickListener() {
            @Override
            public void onNavigationItemClick(int index) {
                container.setCurrentItem(index);
                switch (index) {
                    case 0:
                        searchBar.setVisibility(View.VISIBLE);
                        ViewCompat.animate(searchBar).alpha(1).scaleX(1);
                        break;
                    case 1:
                        searchBar.setVisibility(View.VISIBLE);
                        ViewCompat.animate(searchBar).alpha(1).scaleX(1);
                        break;
                    case 2:
                        searchBar.setVisibility(View.VISIBLE);
                        ViewCompat.animate(searchBar).alpha(1).scaleX(1);
                        break;
                    case 3:
                        ViewCompat.animate(searchBar).alpha(0).scaleX(0).withEndAction(new Runnable() {
                            @Override
                            public void run() {
                                searchBar.setVisibility(View.GONE);
                            }
                        });
                }
            }
        });
    }

    private void setContainer() {
        //初始化Fragment
        VideoFragment videoFragment = new VideoFragment();
        DiscoverFragment discoverFragment = new DiscoverFragment();
        DownloadFragment downloadFragment = new DownloadFragment();
        MineFragment mineFragment = new MineFragment();

        //将Fragment存入数组
        Fragment[] fragments = new Fragment[4];
        fragments[0] = videoFragment;
        fragments[1] = discoverFragment;
        fragments[2] = downloadFragment;
        fragments[3] = mineFragment;

        //适配器
        container.setAdapter(new MainFragmentPagerAdapter(this.getSupportFragmentManager(), fragments));

        //设置屏幕外页面数量上限
        container.setOffscreenPageLimit(3);

        //添加视图切换事件监听器
        container.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                bottomNav.selectTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
