package org.zhijun.online.main.mybatis.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table(name = "`t_demo`")
public class DataDemo implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "`create_time`")
    private Date createTime;

    @Column(name = "`update_time`")
    private Date updateTime;

    @Column(name = "`name`")
    private String name;

    private static final long serialVersionUID = 1L;
}