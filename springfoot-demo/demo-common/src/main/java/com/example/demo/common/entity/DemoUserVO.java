package com.example.demo.common.entity;

import com.codesart.springfoot.common.data.entity.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Schema(description = "DemoUser对象")
public class DemoUserVO extends BaseEntity {

    @Schema(description = "ID")
    private Long id;

    @Schema(description = "用户编码")
    private String code;

    @Schema(description = "用户名")
    private String username;

    @Schema(description = "密码")
    private String password;

    @Schema(description = "年龄")
    private Integer age;

    @Schema(description = "性别")
    private String sex;

    @Schema(description = "头像")
    private String picture;

}
