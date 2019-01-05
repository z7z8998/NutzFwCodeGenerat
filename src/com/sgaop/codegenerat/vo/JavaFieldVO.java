package com.sgaop.codegenerat.vo;

/**
 * @author 黄川 huchuc@vip.qq.com
 * @date: 2018/12/24
 */
public class JavaFieldVO {
    /**
     * JAVA字段名称
     */
    String name;

    /**
     * 主键
     */
    boolean primaryKey;

    /**
     * 字段描述
     */
    String comment;

    /**
     * 数据库字段值
     */
    String dbName;

    /**
     * JAVA字段类型
     */
    String type;

    /**
     * JAVA字段类型包含引用
     */
    String fullType;

    /**
     * 日期
     */
    boolean date;

    /**
     * 是字典
     */
    boolean dict;

    /**
     * 枚举字典CODE
     * <p>
     * 值若不为空将默认为字典类型
     *
     * @return
     */
    String dictCode;


    /**
     * 必填必选字段
     *
     * @return
     */
    boolean required;

    /**
     * 是富文本
     *
     * @return
     */
    int text;

    /**
     * 是附件类型
     *
     * @return
     */
    boolean attachment;

    /**
     * 附件类型-多附件-单附件
     *
     * @return
     */
    boolean attachmentMultiple;

    /**
     * 附件全部是图片
     *
     * @return
     */
    boolean attachmentAllIsImg;

    /**
     * 附件格式
     *
     * @return
     */
    String attachSuffix;


    /**
     * 提示信息
     *
     * @return
     */
    String placeholder;

    /**
     * 文本最大长度
     *
     * @return
     */
    int maxLength;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(boolean primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFullType() {
        return fullType;
    }

    public void setFullType(String fullType) {
        this.fullType = fullType;
    }

    public boolean isDate() {
        return date;
    }

    public void setDate(boolean date) {
        this.date = date;
    }

    public boolean isDict() {
        return dict;
    }

    public void setDict(boolean dict) {
        this.dict = dict;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public int getText() {
        return text;
    }

    public void setText(int text) {
        this.text = text;
    }

    public boolean isAttachment() {
        return attachment;
    }

    public void setAttachment(boolean attachment) {
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return "JavaFieldVO{" +
                "name='" + name + '\'' +
                ", primaryKey=" + primaryKey +
                ", comment='" + comment + '\'' +
                ", dbName='" + dbName + '\'' +
                ", type='" + type + '\'' +
                ", fullType='" + fullType + '\'' +
                ", date=" + date +
                ", dict=" + dict +
                ", dictCode='" + dictCode + '\'' +
                ", required=" + required +
                ", text=" + text +
                ", attachment=" + attachment +
                ", attachmentMultiple=" + attachmentMultiple +
                ", attachmentAllIsImg=" + attachmentAllIsImg +
                ", attachSuffix='" + attachSuffix + '\'' +
                ", placeholder='" + placeholder + '\'' +
                ", maxLength=" + maxLength +
                '}';
    }

    public boolean isAttachmentMultiple() {
        return attachmentMultiple;
    }

    public void setAttachmentMultiple(boolean attachmentMultiple) {
        this.attachmentMultiple = attachmentMultiple;
    }

    public boolean isAttachmentAllIsImg() {
        return attachmentAllIsImg;
    }

    public void setAttachmentAllIsImg(boolean attachmentAllIsImg) {
        this.attachmentAllIsImg = attachmentAllIsImg;
    }

    public String getAttachSuffix() {
        return attachSuffix;
    }

    public void setAttachSuffix(String attachSuffix) {
        this.attachSuffix = attachSuffix;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }
}
