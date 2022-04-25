package com.bridgelabz.cab.invoice.generator.repository;


import com.bridgelabz.cab.invoice.generator.model.InvoiceModel;
import com.bridgelabz.cab.invoice.generator.model.RideModel;

public interface RideRepository {

	void addRideDetails(RideModel ride);

	InvoiceModel getInvoice();
	
}