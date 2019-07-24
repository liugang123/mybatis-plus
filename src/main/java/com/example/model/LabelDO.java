package com.example.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

/**
 * 标签实体信息
 *
 * @author LiuGang
 * @date 2019/02/23 14:46
 */
@TableName("t_label")
public class LabelDO {

    /**
     * 主键
     */
    @TableId(value = "c_id")
    private Long id;

    /**
     * 标签类型
     */
    @TableField(value = "c_type_id")
    private Long typeId;

    @TableField(value = "c_create_time")
    private Date createTime;

    /**
     * 标签名称
     */
    @TableField(value = "c_name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "LabelDO{" +
                "id=" + id +
                ", typeId=" + typeId +
                ", name='" + name + '\'' +
                '}';
    }
}
