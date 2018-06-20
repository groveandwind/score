package lin.app.school.score.domain;

import javax.persistence.*;

@Table(name = "Current_Class")
public class CurrentClass {
    /**
     * 班级信息表记录ID
     */
    @Column(name = "cla_info_id")
    private String claInfoId;

    /**
     * 获取班级信息表记录ID
     *
     * @return cla_info_id - 班级信息表记录ID
     */
    public String getClaInfoId() {
        return claInfoId;
    }

    /**
     * 设置班级信息表记录ID
     *
     * @param claInfoId 班级信息表记录ID
     */
    public void setClaInfoId(String claInfoId) {
        this.claInfoId = claInfoId;
    }
}