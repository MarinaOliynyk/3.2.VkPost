package ru.netology.domain;

public class LikesInfo {

    private int countLike; //количество "Нравится"
    private String ownerLike; //пользователи (Имя Фамилия/наименование сообщества) поставившие отметку "Нравится"

    private boolean canLike; //может ли текущий пользователь поставить отметку «Мне нравится»

    public int getCountLike() {
        return countLike;
    }

    public void setCountLike(int countLike) {
        this.countLike = countLike;
    }

    public String getOwnerLike() {
        return ownerLike;
    }

    public void setOwnerLike(String ownerLike) {
        this.ownerLike = ownerLike;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }
}
