package ruicourse.tiancheng.recourse.mine.data.dao;

import android.support.v4.app.Fragment;

import java.util.ArrayList;
import java.util.List;

import ruicourse.tiancheng.recourse.R;
import ruicourse.tiancheng.recourse.mine.data.entity.JoinedCourseData;
import ruicourse.tiancheng.recourse.mine.data.entity.StudyNoteData;
import ruicourse.tiancheng.recourse.mine.data.entity.StudyTimeData;
import ruicourse.tiancheng.recourse.mine.fragment.JoinedCourseFragment;
import ruicourse.tiancheng.recourse.mine.fragment.StudyNoteFragment;
import ruicourse.tiancheng.recourse.mine.fragment.StudyTimeFragment;

/**
 * Created by 10919 on 2018/3/6/006.
 */

public class MineData {

    public static String[] getStatisticsSumes() {
        return new String[] {
                "12",
                "21",
                "50"
        };
    }

    public static int[] getStatisticsTitles() {
        return new int[]{
                R.string.joined_course,
                R.string.study_note,
                R.string.study_time
        };
    }

    public static Fragment[] getMineFragments() {
        JoinedCourseFragment joinedCourseFragment = new JoinedCourseFragment();
        StudyNoteFragment studyNoteFragment = new StudyNoteFragment();
        StudyTimeFragment studyTimeFragment = new StudyTimeFragment();

        Fragment[] fragments = new Fragment[3];
        fragments[0] = joinedCourseFragment;
        fragments[1] = studyNoteFragment;
        fragments[2] = studyTimeFragment;

        return fragments;
    }

    public static List<JoinedCourseData> getJoinedCourseData() {
        List<JoinedCourseData> dataList = new ArrayList<JoinedCourseData>();
        /******************获取数据*****************/

        /******************************************/
        return dataList;
    }

    public static List<StudyNoteData> getStudyNoteData() {
        List<StudyNoteData> dataList = new ArrayList<StudyNoteData>();
        /******************获取数据*****************/

        /******************************************/
        return dataList;
    }

    public static List<StudyTimeData> getStudyTimeData() {
        List<StudyTimeData> dataList = new ArrayList<StudyTimeData>();
        /******************获取数据*****************/

        /******************************************/
        return dataList;
    }

}
