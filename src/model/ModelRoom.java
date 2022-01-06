package model;

public class ModelRoom {
    private String room;
    private String roomM;
    private String bed;
    private String bedNum;

    public ModelRoom() {
    }

    public ModelRoom(String room, String roomM, String bed, String bedNum) {
        this.setRoom(room);
        this.setRoomM(roomM);
        this.setBed(bed);
        this.setBedNum(bedNum);
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRoomM() {
        return roomM;
    }

    public void setRoomM(String roomM) {
        this.roomM = roomM;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getBedNum() {
        return bedNum;
    }

    public void setBedNum(String bedNum) {
        this.bedNum = bedNum;
    }
}