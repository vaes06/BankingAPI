package banking.domain.transactions.contracts;

import banking.domain.accounts.entities.Account;

public interface ITransferDomainService {
	void performTransfer(Account originAccount, Account destinationAccount, double amount);
}
