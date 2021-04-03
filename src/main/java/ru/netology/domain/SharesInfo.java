package ru.netology.domain;

public class SharesInfo {

    private int countShare; //количество поделившихся
    private String nameOwner; //имя пользователя, поделившегося публикацией
    private boolean canShare; //разрешено "Поделиться"

    public int getCountShare() {
        return countShare;
    }

    public void setCountShare(int countShare) {
        this.countShare = countShare;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public boolean isCanShare() {
        return canShare;
    }

    public void setCanShare(boolean canShare) {
        this.canShare = canShare;
    }
}
