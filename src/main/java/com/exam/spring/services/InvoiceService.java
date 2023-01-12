package com.exam.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.spring.models.Invoice;

import com.exam.spring.repositories.InvoiceeRepository;


@Service
public class InvoiceService {
	@Autowired
	InvoiceeRepository ir;
	public void addInvoice(Invoice in) {
		ir.save(in);
	}
	public void updateInvoice(Invoice in) {
		ir.save(in);
	}
	public void deleteInvoice(Invoice in) {
		ir.delete(in);
	}
	public List<Invoice> findAllInvoice() {
		return ir.findAll();
	}
	public Invoice findInvoiceById(int iid) {
		return ir.findById(iid).get();
	}

}
