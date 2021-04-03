package ru.netology.domain;

public class GeoInfo {

    private String type; //тип места
    private String coordinate; //координаты места

    private PlaceInfo placeInfo;//информация при добавлении нового места

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public PlaceInfo getPlaceInfo() {
        return placeInfo;
    }

    public void setPlaceInfo(PlaceInfo placeInfo) {
        this.placeInfo = placeInfo;
    }
}