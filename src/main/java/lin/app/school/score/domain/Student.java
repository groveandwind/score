package lin.app.school.score.domain;

import javax.persistence.*;

public class Student {
    /**
     * 唯一
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
     * 班级ID
     */
    @Column(name = "class_id")
    private String classId;

    /**
     * 学号
     */
    private String number;

    /**
     * 获取唯一
     *
     * @return ID - 唯一
     */
    public String getId() {
        return id;
    }

    /**
     * 设置唯一
     *
     * @param id 唯一
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
     * 获取班级ID
     *
     * @return class_id - 班级ID
     */
    public String getClassId() {
        return classId;
    }

    /**
     * 设置班级ID
     *
     * @param classId 班级ID
     */
    public void setClassId(String classId) {
        this.classId = classId;
    }

    /**
     * 获取学号
     *
     * @return number - 学号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置学号
     *
     * @param number 学号
     */
    public void setNumber(String number) {
        this.number = number;
    }
}