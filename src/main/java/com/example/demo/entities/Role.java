package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pruebas", schema = "contasystem")
public class Role {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long krole;
	private String srole;

    public Role(Long krole, String srole) {
        this.krole = krole;
        this.srole = srole;
    }

    public Long getKrole() {
        return this.krole;
    }

    public void setKrole(Long krole) {
        this.krole = krole;
    }

    public String getSrole() {
        return this.srole;
    }

    public void setSrole(String srole) {
        this.srole = srole;
    }

    @Override
    public String toString() {
        return "{" +
            " krole='" + getKrole() + "'" +
            ", srole='" + getSrole() + "'" +
            "}";
    }

    public Role() {
        super();
    }
    
}
