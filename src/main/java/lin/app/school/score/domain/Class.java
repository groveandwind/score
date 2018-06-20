package lin.app.school.score.domain;

import javax.persistence.*;

public class Class {
    /**
     * 班级ID
     */
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 班级名称
     */
    private String name;

    /**
     * 班号
     */
    private String number;

    /**
     * 班主任ID
     */
    @Column(name = "class_teacher_id")
    private String classTeacherId;

    /**
     * 所属学校ID
     */
    @Column(name = "school_id")
    private String schoolId;

    /**
     * 班级描述
     */
    private String detail;

    /**
     * 获取班级ID
     *
     * @return ID - 班级ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置班级ID
     *
     * @param id 班级ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取班级名称
     *
     * @return name - 班级名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置班级名称
     *
     * @param name 班级名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取班号
     *
     * @return number - 班号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置班号
     *
     * @param number 班号
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 获取班主任ID
     *
     * @return class_teacher_id - 班主任ID
     */
    public String getClassTeacherId() {
        return classTeacherId;
    }

    /**
     * 设置班主任ID
     *
     * @param classTeacherId 班主任ID
     */
    public void setClassTeacherId(String classTeacherId) {
        this.classTeacherId = classTeacherId;
    }

    /**
     * 获取所属学校ID
     *
     * @return school_id - 所属学校ID
     */
    public String getSchoolId() {
        return schoolId;
    }

    /**
     * 设置所属学校ID
     *
     * @param schoolId 所属学校ID
     */
    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    /**
     * 获取班级描述
     *
     * @return detail - 班级描述
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置班级描述
     *
     * @param detail 班级描述
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }
}