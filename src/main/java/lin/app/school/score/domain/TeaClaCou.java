package lin.app.school.score.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "Tea_Cla_Cou")
public class TeaClaCou {
    /**
     * 教师ID
     */
    @Column(name = "teacher_id")
    private String teacherId;

    /**
     * 班级ID
     */
    @Column(name = "class_id")
    private String classId;

    /**
     * 课程ID
     */
    @Column(name = "course_id")
    private String courseId;

    /**
     * 开始时间
     */
    @Column(name = "start_date")
    private Date startDate;

    /**
     * 结束时间
     */
    @Column(name = "end_date")
    private Date endDate;

    /**
     * 获取教师ID
     *
     * @return teacher_id - 教师ID
     */
    public String getTeacherId() {
        return teacherId;
    }

    /**
     * 设置教师ID
     *
     * @param teacherId 教师ID
     */
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
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
     * 获取课程ID
     *
     * @return course_id - 课程ID
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * 设置课程ID
     *
     * @param courseId 课程ID
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    /**
     * 获取开始时间
     *
     * @return start_date - 开始时间
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置开始时间
     *
     * @param startDate 开始时间
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取结束时间
     *
     * @return end_date - 结束时间
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置结束时间
     *
     * @param endDate 结束时间
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}