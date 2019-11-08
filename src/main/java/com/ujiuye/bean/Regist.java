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
public class Regist extends Model<Regist> {

    private static final long serialVersionUID=1L;

    @TableId(value = "rid", type = IdType.AUTO)
    private Integer rid;

    private String rname;

    private String rdep;

    private String radd;


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRdep() {
        return rdep;
    }

    public void setRdep(String rdep) {
        this.rdep = rdep;
    }

    public String getRadd() {
        return radd;
    }

    public void setRadd(String radd) {
        this.radd = radd;
    }

    @Override
    protected Serializable pkVal() {
        return this.rid;
    }

    @Override
    public String toString() {
        return "Regist{" +
        "rid=" + rid +
        ", rname=" + rname +
        ", rdep=" + rdep +
        ", radd=" + radd +
        "}";
    }
}
