package com.zx.sys.vo;

public class SysCompanyVO {

    /**
     * 公司ID
     */
    private Integer id;

    /**
     * 公司名称
     */
    private String compName;

    /**
     * 法人
     */
    private String legalPerson;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }
}