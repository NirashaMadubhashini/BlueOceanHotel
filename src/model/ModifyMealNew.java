package model;

public class ModifyMealNew {
     private String mond;
     private String tues;
     private String wedn;
     private String thus;
     private String frid;
     private String satu;
     private String sund;

    public ModifyMealNew() {
    }

    public ModifyMealNew(String mond, String tues, String wedn, String thus, String frid, String satu, String sund) {
        this.setMond(mond);
        this.setTues(tues);
        this.setWedn(wedn);
        this.setThus(thus);
        this.setFrid(frid);
        this.setSatu(satu);
        this.setSund(sund);
    }

    public String getMond() {
        return mond;
    }

    public void setMond(String mond) {
        this.mond = mond;
    }

    public String getTues() {
        return tues;
    }

    public void setTues(String tues) {
        this.tues = tues;
    }

    public String getWedn() {
        return wedn;
    }

    public void setWedn(String wedn) {
        this.wedn = wedn;
    }

    public String getThus() {
        return thus;
    }

    public void setThus(String thus) {
        this.thus = thus;
    }

    public String getFrid() {
        return frid;
    }

    public void setFrid(String frid) {
        this.frid = frid;
    }

    public String getSatu() {
        return satu;
    }

    public void setSatu(String satu) {
        this.satu = satu;
    }

    public String getSund() {
        return sund;
    }

    public void setSund(String sund) {
        this.sund = sund;
    }
}
