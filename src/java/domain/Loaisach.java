package domain;
// Generated 28-May-2022 04:22:46 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Loaisach generated by hbm2java
 */
public class Loaisach  implements java.io.Serializable {


     private Integer maloai;
     private String tenloai;
     private Set<Sach> saches = new HashSet<Sach>(0);

    public Loaisach() {
    }

	
    public Loaisach(String tenloai) {
        this.tenloai = tenloai;
    }
    public Loaisach(String tenloai, Set<Sach> saches) {
       this.tenloai = tenloai;
       this.saches = saches;
    }
   
    public Integer getMaloai() {
        return this.maloai;
    }
    
    public void setMaloai(Integer maloai) {
        this.maloai = maloai;
    }
    public String getTenloai() {
        return this.tenloai;
    }
    
    public void setTenloai(String tenloai) {
        this.tenloai = tenloai;
    }
    public Set<Sach> getSaches() {
        return this.saches;
    }
    
    public void setSaches(Set<Sach> saches) {
        this.saches = saches;
    }




}

