package pt.javarush.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(schema = "movie", name = "rental")
public class Rental {
    @Id
    @Column(name = "rental_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "rental_date")
    private LocalDateTime rentalDate;

    @ManyToOne
    @JoinColumn(name = "inventory_id")
    private Inventory inventory;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "return_date")
    private LocalDateTime returnDate;

    @ManyToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;

    @Column(name = "last_update")
    @UpdateTimestamp
    private LocalDateTime lastUpdate;

    public Integer getId() {
        return id;
    }

    public Rental setId(Integer id) {
        this.id = id;
        return this;
    }

    public LocalDateTime getRentalDate() {
        return rentalDate;
    }

    public Rental setRentalDate(LocalDateTime rentalDate) {
        this.rentalDate = rentalDate;
        return this;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Rental setInventory(Inventory inventory) {
        this.inventory = inventory;
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Rental setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public Rental setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
        return this;
    }

    public Staff getStaff() {
        return staff;
    }

    public Rental setStaff(Staff staff) {
        this.staff = staff;
        return this;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public Rental setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
}
