package org.kekee.bilibili.entity;

//import com.baomidou.mybatisplus.annotation.IdType;
//import com.baomidou.mybatisplus.annotation.TableId;
//import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * TODO
 * @param  @return
 * @author 可可
 * @date 2021/6/17
 */
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
//@TableName("user")
public class User implements Serializable {

//    @TableId(value = "uid", type = IdType.AUTO)
    private Integer id;

    private Integer age;

    private String name;

    private String email;

    private String password;

}