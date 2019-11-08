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
public class Emp extends Model<Emp> {

    private static final long serialVersionUID=1L;

    @TableId(value = "eid", type = IdType.AUTO)
    private Integer eid;

    private String ename;

    private String address;


    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    protected Serializable pkVal() {
        return this.eid;
    }

    @Override
    public String toString() {
        return "Emp{" +
        "eid=" + eid +
        ", ename=" + ename +
        ", address=" + address +
        "}";
    }
}
