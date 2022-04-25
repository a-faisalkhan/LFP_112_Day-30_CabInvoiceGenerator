package com.bridgelabz.cab.invoice.generator.service;

import com.bridgelabz.cab.invoice.generator.model.InvoiceModel;
import com.bridgelabz.cab.invoice.generator.model.RideModel;

public interface InvoiceService {

	void addRideDetails(RideModel ride);

	InvoiceModel generateInvoice();

}
