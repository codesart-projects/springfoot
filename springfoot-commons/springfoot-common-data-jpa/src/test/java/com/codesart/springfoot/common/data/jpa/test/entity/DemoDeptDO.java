package com.codesart.springfoot.common.data.jpa.test.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.codesart.springfoot.common.data.entity.BaseEntity;
import com.querydsl.core.annotations.QueryEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Data
@Entity
@QueryEntity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("demo_dept")
public class DemoDeptDO extends BaseEntity {

    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 父级
     */
    private Long parentId;

    /**
     * 路径
     */
    private String path;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 部门描述
     */
    private String description;

}