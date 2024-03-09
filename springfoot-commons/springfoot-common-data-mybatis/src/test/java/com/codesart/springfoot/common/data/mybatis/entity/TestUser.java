package com.codesart.springfoot.common.data.mybatis.entity;

import com.codesart.springfoot.common.data.entity.BaseDateEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class TestUser extends BaseDateEntity {

    private String name;

}
