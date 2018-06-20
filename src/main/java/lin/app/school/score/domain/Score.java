package lin.app.school.score.domain;

import javax.persistence.*;

public class Score {
    /**
     * ID
     */
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 学生ID
     */
    @Column(name = "student_id")
    private String studentId;

    /**
     * 课程ID
     */
    @Column(name = "course_id")
    private String courseId;

    /**
     * 成绩
     */
    private Double score;

    /**
     * 考试ID
     */
    @Column(name = "exam_id")
    private String examId;

    /**
     * 获取ID
     *
     * @return ID - ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取学生ID
     *
     * @return student_id - 学生ID
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * 设置学生ID
     *
     * @param studentId 学生ID
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
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
     * 获取成绩
     *
     * @return score - 成绩
     */
    public Double getScore() {
        return score;
    }

    /**
     * 设置成绩
     *
     * @param score 成绩
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * 获取考试ID
     *
     * @return exam_id - 考试ID
     */
    public String getExamId() {
        return examId;
    }

    /**
     * 设置考试ID
     *
     * @param examId 考试ID
     */
    public void setExamId(String examId) {
        this.examId = examId;
    }
}