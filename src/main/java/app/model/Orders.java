package app.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String user;
    private String book;
    private Date fromDate;
    private Date toDate;
    private Boolean isOriginal;
    private Boolean isActive;

    public Orders(Long id, String user, String book, Date fromDate, Date toDate, Boolean isOriginal, Boolean isActive) {
        this.id = id;
        this.user = user;
        this.book = book;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.isOriginal = isOriginal;
        this.isActive = isActive;
    }

    public Orders() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Boolean getOriginal() {
        return isOriginal;
    }

    public void setOriginal(Boolean original) {
        isOriginal = original;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", user=" + user +
                ", book=" + book +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", isOriginal=" + isOriginal +
                ", isActive=" + isActive +
                '}';
    }
}