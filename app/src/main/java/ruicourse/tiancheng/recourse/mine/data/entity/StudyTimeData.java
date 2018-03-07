package ruicourse.tiancheng.recourse.mine.data.entity;

/**
 * Created by 10919 on 2018/3/6/006.
 */

public class StudyTimeData {

    private String img;
    private String name;
    private String time;

    public StudyTimeData(String img, String name, String time) {
        this.img = img;
        this.name = name;
        this.time = time;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
