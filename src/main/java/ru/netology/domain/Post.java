package ru.netology.domain;

import javax.xml.crypto.Data;

public class Post {

    private int idAccountPage; //id страницы аккаунта
    private int idPost; //id публикации
    private int idOwner; //id автора
    private String nameOwner; //имя автора/сообщества
    private String iconOwnerUrl; //аватар автора/сообщества
    private Data datePost; //дата в формате дата + время если текущий год, и если ранее то только дата
    private String textPost; //текст публикации, включая заголовок
    private String imagePostUrl; //изображение, gif, видео используемые в публикации
    private String linkPage; //ссылка для перехода

    private boolean canComment; //разрешены ли комментарии
    private boolean canDelete; //разрешено удаление
    private boolean canEdit; //разрешено редактирование
    private boolean canComplain; //разрешено "Пожаловаться" на содержание
    private boolean canBookmarkPost; //разрешено добавление в закладки
    private boolean canPostPin; //разрешено закрепление публикации
    private boolean canPostUnpin; //разрешено открепление публикации

    private CommentsInfo commentsInfo; //информация о комментариях
    private LikesInfo likesInfo; //информация "Нравится"
    private SharesInfo sharesInfo; //информация "Поделиться"
    private ViewsInfo viewsInfo; //информация о просмотрах
    private OwnersInfo ownersInfo; //информация об авторах (пользователях/сообществах)

    public int getIdAccountPage() {
        return idAccountPage;
    }

    public void setIdAccountPage(int idAccountPage) {
        this.idAccountPage = idAccountPage;
    }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
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

    public Data getDatePost() {
        return datePost;
    }

    public void setDatePost(Data datePost) {
        this.datePost = datePost;
    }

    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }

    public String getImagePostUrl() {
        return imagePostUrl;
    }

    public void setImagePostUrl(String imagePostUrl) {
        this.imagePostUrl = imagePostUrl;
    }

    public String getLinkPage() {
        return linkPage;
    }

    public void setLinkPage(String linkPage) {
        this.linkPage = linkPage;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanComplain() {
        return canComplain;
    }

    public void setCanComplain(boolean canComplain) {
        this.canComplain = canComplain;
    }

    public boolean isCanBookmarkPost() {
        return canBookmarkPost;
    }

    public void setCanBookmarkPost(boolean canBookmarkPost) {
        this.canBookmarkPost = canBookmarkPost;
    }

    public boolean isCanPostPin() {
        return canPostPin;
    }

    public void setCanPostPin(boolean canPostPin) {
        this.canPostPin = canPostPin;
    }

    public boolean isCanPostUnpin() {
        return canPostUnpin;
    }

    public void setCanPostUnpin(boolean canPostUnpin) {
        this.canPostUnpin = canPostUnpin;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
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

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public OwnersInfo getOwnersInfo() {
        return ownersInfo;
    }

    public void setOwnersInfo(OwnersInfo ownersInfo) {
        this.ownersInfo = ownersInfo;
    }
}
