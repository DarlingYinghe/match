package ruicourse.tiancheng.recourse.video;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import ruicourse.tiancheng.recourse.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideoFragment extends Fragment {
    private Button button1;
    private Button button2;
    private View searchBar;

    public VideoFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_video, container, false);
        button1 = (Button)view.findViewById(R.id.in);
        button2 = (Button)view.findViewById(R.id.exit);
        searchBar = (View)getActivity().findViewById(R.id.search_bar_main);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewCompat.animate(searchBar).translationY(0);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewCompat.animate(searchBar).translationY(-200);
            }
        });
        return view;
    }

}
