package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	private OnlinePaymentServices onlinePaymentServices;

	public ContractService(OnlinePaymentServices onlinePaymentServices) {
		this.onlinePaymentServices = onlinePaymentServices;
	}
	
	public void processContract(Contract contract, int months) {
		contract.getInstalments().add(new Installment(LocalDate.of(months, months, months)))
	}

}
