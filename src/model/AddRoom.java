package model;

public class AddRoom {

    private String roomNo;
    private String roomType;
    private String typeofBed;
    private String noOfBeds;

    public AddRoom() {
    }

    public AddRoom(String roomNo, String roomType, String typeofBed, String noOfBeds) {
        this.setRoomNo(roomNo);
        this.setRoomType(roomType);
        this.setTypeofBed(typeofBed);
        this.setNoOfBeds(noOfBeds);
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getTypeofBed() {
        return typeofBed;
    }

    public void setTypeofBed(String typeofBed) {
        this.typeofBed = typeofBed;
    }

    public String getNoOfBeds() {
        return noOfBeds;
    }

    public void setNoOfBeds(String noOfBeds) {
        this.noOfBeds = noOfBeds;
    }
}
