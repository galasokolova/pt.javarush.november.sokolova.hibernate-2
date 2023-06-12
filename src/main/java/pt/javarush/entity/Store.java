package pt.javarush.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(schema = "movie", name = "store")
public class Store {
    @Id
    @Column(name = "store_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Byte id;

    @OneToOne
    @JoinColumn(name = "manager_staff_id")
    private Staff staff;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @Column(name = "last_update")
    @UpdateTimestamp
    private LocalDateTime lastUpdate;

    public Byte getId() {
        return id;
    }

    public Store setId(Byte id) {
        this.id = id;
        return this;
    }

    public Staff getStaff() {
        return staff;
    }

    public Store setStaff(Staff staff) {
        this.staff = staff;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Store setAddress(Address address) {
        this.address = address;
        return this;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public Store setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
}
