package com.warehouse_accounting.models;

import com.warehouse_accounting.models.Company;
import com.warehouse_accounting.models.Employee;
import com.warehouse_accounting.models.TypeOfInvoice;
import com.warehouse_accounting.models.Warehouse;
import com.warehouse_accounting.models.Project;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.warehouse_accounting.models.InvoiceEdit;
//import com.warehouse_accounting.models.InvoiceProduct;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;


// Универсальная сущность для операций "ПРИХОД", "РАСХОД", "ОПРИХОДОВАНИЕ", "СПИСАНИЕ"

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "invoices")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column
    private LocalDateTime invoiceDateTime;

    @Column
    @Enumerated(EnumType.STRING)
    private TypeOfInvoice type;

    @Column
    private boolean isPosted;

    @ManyToOne(fetch = FetchType.LAZY)
    private Employee invoiceAuthor;

    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    private Project project;

    @ManyToOne(fetch = FetchType.LAZY)
    private Warehouse warehouse;

    @OneToMany(fetch = FetchType.LAZY)
    private List<InvoiceProduct> invoiceProducts;

    @Column
    private String comment;

    @ManyToOne(fetch = FetchType.LAZY)
    private Contractor contractor;

    @ManyToOne(fetch = FetchType.LAZY)
    private Contract contract;

    @OneToMany(fetch = FetchType.LAZY)
    private List<InvoiceEdit> edits;
}
