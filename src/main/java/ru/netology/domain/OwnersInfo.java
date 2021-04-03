package ru.netology.domain;

public class OwnersInfo {

    private int idOwner; //id автора/пользователя/сообщества
    private String nameOwner; //имя пользователя
    private String iconOwnerUrl; //аватар

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
}
