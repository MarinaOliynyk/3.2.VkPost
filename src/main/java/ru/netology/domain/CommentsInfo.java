package ru.netology.domain;

import javax.xml.crypto.Data;

public class CommentsInfo {

    private int idComment; //id комментария
    private int idOwner; //id автора
    private String nameOwner; //имя автора
    private String iconOwnerUrl; //аватар автора
    private Data dateComment; //дата комментария
    private String textComment; //текст комментария
    private int countComment; //количество комментариев

    private boolean canPost; //разрешена публикация комментария
    private boolean canAnswerComment; //разрешено отвечать на комментарии
    private boolean canComplainOnComment; //разрешено "Пожаловаться"
    private boolean canEditComment; //разрешено редактирование
    private boolean canDeleteComment; //разрешено удаление
    private boolean canExport; //разрешен экспорт ссылки комментария

    private AttachmentsInfo attachmentsInfo; //информация о вложениях в комментариях
    private LikesInfo likesInfo; //информация о "Нравится"
    private SharesInfo sharesInfo; //информация о "Поделиться"
    private OwnersInfo ownersInfo; //информация об авторах (пользователи/сообщества)

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getIconOwnerUrl() {
        return iconOwnerUrl;
    }

    public void setIconOwnerUrl(String iconOwnerUrl) {
        this.iconOwnerUrl = iconOwnerUrl;
    }

    public Data getDateComment() {
        return dateComment;
    }

    public void setDateComment(Data dateComment) {
        this.dateComment = dateComment;
    }

    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    public int getCountComment() {
        return countComment;
    }

    public void setCountComment(int countComment) {
        this.countComment = countComment;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean isCanAnswerComment() {
        return canAnswerComment;
    }

    public void setCanAnswerComment(boolean canAnswerComment) {
        this.canAnswerComment = canAnswerComment;
    }

    public boolean isCanComplainOnComment() {
        return canComplainOnComment;
    }

    public void setCanComplainOnComment(boolean canComplainOnComment) {
        this.canComplainOnComment = canComplainOnComment;
    }

    public boolean isCanEditComment() {
        return canEditComment;
    }

    public void setCanEditComment(boolean canEditComment) {
        this.canEditComment = canEditComment;
    }

    public boolean isCanDeleteComment() {
        return canDeleteComment;
    }

    public void setCanDeleteComment(boolean canDeleteComment) {
        this.canDeleteComment = canDeleteComment;
    }

    public boolean isCanExport() {
        return canExport;
    }

    public void setCanExport(boolean canExport) {
        this.canExport = canExport;
    }

    public AttachmentsInfo getAttachmentsInfo() {
        return attachmentsInfo;
    }

    public void setAttachmentsInfo(AttachmentsInfo attachmentsInfo) {
        this.attachmentsInfo = attachmentsInfo;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public SharesInfo getSharesInfo() {
        return sharesInfo;
    }

    public void setSharesInfo(SharesInfo sharesInfo) {
        this.sharesInfo = sharesInfo;
    }

    public OwnersInfo getOwnersInfo() {
        return ownersInfo;
    }

    public void setOwnersInfo(OwnersInfo ownersInfo) {
        this.ownersInfo = ownersInfo;
    }
}
