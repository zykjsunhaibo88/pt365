package com.xm.api.module.article.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.xm.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 文章表
 * </p>
 *
 * @author xiaomalover <xiaomalover@gmail.com>
 * @since 2020-03-01
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ArticleInfo extends BaseEntity{

    private static final long serialVersionUID = 1L;

    /**
     * 文章分类ID
     */
    private String categoryId;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章封面图
     */
    private String thumb;

    /**
     * 文章简介
     */
    private String summary;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 作者
     */
    private String author;

    /**
     * 状态（0启用;1禁用）
     */
    private Boolean status;

    @TableField(exist = false)
    private String categoryTitle;

    @TableField(exist = false)
    private String categoryShortTitle;
}
