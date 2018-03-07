package ruicourse.tiancheng.recourse.mine.data.entity;

/**
 * Created by 10919 on 2018/3/6/006.
 */

public class JoinedCourseData {

    private String img;
    private String name;

    public JoinedCourseData(String img, String name) {
        this.img = img;
        this.name = name;
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
}
