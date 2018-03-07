package ruicourse.tiancheng.recourse.mine.data.entity;

/**
 * Created by 10919 on 2018/3/6/006.
 */

public class StudyNoteData {

    private String title;
    private String content;
    private String date;

    public StudyNoteData(String title, String content, String date) {
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
