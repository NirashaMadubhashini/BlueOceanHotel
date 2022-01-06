package model;

public class Guest {
     private String firstName;
     private String lastName;
     private String email;
     private String mobileOne;
     private String mobileTwo;
     private String address;
     private String checkedInDate;
     private String checkedOutDate;
     private String guestNumber;
     private String roomType;
     private String totalAmount;

     public Guest() {
     }

     public Guest(String firstName, String lastName, String email, String mobileOne, String mobileTwo, String address, String checkedInDate, String checkedOutDate, String guestNumber, String roomType, String totalAmount) {
          this.setFirstName(firstName);
          this.setLastName(lastName);
          this.setEmail(email);
          this.setMobileOne(mobileOne);
          this.setMobileTwo(mobileTwo);
          this.setAddress(address);
          this.setCheckedInDate(checkedInDate);
          this.setCheckedOutDate(checkedOutDate);
          this.setGuestNumber(guestNumber);
          this.setRoomType(roomType);
          this.setTotalAmount(totalAmount);
     }

     public String getFirstName() {
          return firstName;
     }

     public void setFirstName(String firstName) {
          this.firstName = firstName;
     }

     public String getLastName() {
          return lastName;
     }

     public void setLastName(String lastName) {
          this.lastName = lastName;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public String getMobileOne() {
          return mobileOne;
     }

     public void setMobileOne(String mobileOne) {
          this.mobileOne = mobileOne;
     }

     public String getMobileTwo() {
          return mobileTwo;
     }

     public void setMobileTwo(String mobileTwo) {
          this.mobileTwo = mobileTwo;
     }

     public String getAddress() {
          return address;
     }

     public void setAddress(String address) {
          this.address = address;
     }

     public String getCheckedInDate() {
          return checkedInDate;
     }

     public void setCheckedInDate(String checkedInDate) {
          this.checkedInDate = checkedInDate;
     }

     public String getCheckedOutDate() {
          return checkedOutDate;
     }

     public void setCheckedOutDate(String checkedOutDate) {
          this.checkedOutDate = checkedOutDate;
     }

     public String getGuestNumber() {
          return guestNumber;
     }

     public void setGuestNumber(String guestNumber) {
          this.guestNumber = guestNumber;
     }

     public String getRoomType() {
          return roomType;
     }

     public void setRoomType(String roomType) {
          this.roomType = roomType;
     }

     public String getTotalAmount() {
          return totalAmount;
     }

     public void setTotalAmount(String totalAmount) {
          this.totalAmount = totalAmount;
     }
}
