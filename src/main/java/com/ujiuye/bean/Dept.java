package com.ujiuye.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangjiandong
 * @since 2019-11-04
 */
public class Dept extends Model<Dept> {

    private static final long serialVersionUID=1L;

    @TableId(value = "deptno", type = IdType.AUTO)
    private Integer deptno;

    private String dname;

    private String local;


    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    protected Serializable pkVal() {
        return this.deptno;
    }

    @Override
    public String toString() {
        return "Dept{" +
        "deptno=" + deptno +
        ", dname=" + dname +
        ", local=" + local +
        "}";
    }
}
