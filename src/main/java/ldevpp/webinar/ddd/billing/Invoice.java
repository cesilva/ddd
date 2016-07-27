package ldevpp.webinar.ddd.billing;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;

import ldevpp.webinar.ddd.appointments.Appointment;

@Entity
public class Invoice extends Receivable {

    private Date dueDate;
    private String recipientName;

    public Invoice() {
    }

    public Invoice(LocalDate issueDate, BigDecimal amount, Appointment appointment, LocalDate dueDate,
        String recipientName) {
        super(issueDate, amount, appointment);
        this.dueDate = Date.valueOf(dueDate);
        this.recipientName = recipientName;
    }

    public LocalDate getDueDate() {
        return dueDate == null ? null : dueDate.toLocalDate();
    }

    public String getRecipientName() {
        return recipientName;
    }

    @Override
    public String getEntryDescription() {
        return "Invoice";
    }
}
