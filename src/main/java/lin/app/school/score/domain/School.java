package lin.app.school.score.domain;

import javax.persistence.*;

public class School {
    /**
     * 学校ID
     */
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 学校名称
     */
    private String name;

    /**
     * 学校地址
     */
    private String adderss;

    /**
     * 学校描述
     */
    private String detail;

    /**
     * 获取学校ID
     *
     * @return ID - 学校ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置学校ID
     *
     * @param id 学校ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取学校名称
     *
     * @return name - 学校名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置学校名称
     *
     * @param name 学校名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取学校地址
     *
     * @return adderss - 学校地址
     */
    public String getAdderss() {
        return adderss;
    }

    /**
     * 设置学校地址
     *
     * @param adderss 学校地址
     */
    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    /**
     * 获取学校描述
     *
     * @return detail - 学校描述
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置学校描述
     *
     * @param detail 学校描述
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }
}