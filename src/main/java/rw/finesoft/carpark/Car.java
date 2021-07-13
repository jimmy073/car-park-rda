package rw.finesoft.carpark;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {
    @Id@GeneratedValue
    private Long id;
    @Column(unique = true)
    private String plateNo;
    private String owner;
    private String telephone;
    private double debt;

    public Car(String plateNo) {
        this.plateNo = plateNo;
    }

    public Car() {
    }

    public Car( String plateNo, String owner, String telephone, double debt) {
        this.plateNo = plateNo;
        this.owner = owner;
        this.telephone = telephone;
        this.debt = debt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }
}
