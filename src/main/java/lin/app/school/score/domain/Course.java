package lin.app.school.score.domain;

import javax.persistence.*;

public class Course {
    /**
     * 课程ID
     */
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 课程名称
     */
    private String name;

    /**
     * 课程描述
     */
    private String detail;

    /**
     * 获取课程ID
     *
     * @return ID - 课程ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置课程ID
     *
     * @param id 课程ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取课程名称
     *
     * @return name - 课程名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置课程名称
     *
     * @param name 课程名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取课程描述
     *
     * @return detail - 课程描述
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置课程描述
     *
     * @param detail 课程描述
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }
}