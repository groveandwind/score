package lin.app.school.score.domain;

import javax.persistence.*;

public class Teacher {
    /**
     * 教师ID
     */
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 工号
     */
    private String number;

    /**
     * 所属学校
     */
    @Column(name = "school_id")
    private String schoolId;

    /**
     * 获取教师ID
     *
     * @return ID - 教师ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置教师ID
     *
     * @param id 教师ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取工号
     *
     * @return number - 工号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置工号
     *
     * @param number 工号
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 获取所属学校
     *
     * @return school_id - 所属学校
     */
    public String getSchoolId() {
        return schoolId;
    }

    /**
     * 设置所属学校
     *
     * @param schoolId 所属学校
     */
    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }
}