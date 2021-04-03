package ru.netology.domain;

public class AttachmentsInfo {

    private String typeAttachment; //тип вложения (фото, видео, документ, эмодзи, стикер)
    private String linkAttachment; //ссылка

    public String getTypeAttachment() {
        return typeAttachment;
    }

    public void setTypeAttachment(String typeAttachment) {
        this.typeAttachment = typeAttachment;
    }

    public String getLinkAttachment() {
        return linkAttachment;
    }

    public void setLinkAttachment(String linkAttachment) {
        this.linkAttachment = linkAttachment;
    }
}
