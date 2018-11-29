package banking.infrastructure.accounts.persistence.repository;
import banking.domain.accounts.contracts.*;
import banking.domain.accounts.entities.*;
import banking.in

public class AccountHibernateRepository {
		
	public class AccountNHibernateRepository : NHibernateRepository<Account>, IAccountRepository
    {
        public AccountNHibernateRepository(UnitOfWorkNHibernate unitOfWork) : base(unitOfWork)
        {
        }

        public Account GetByNumber(string accountNumber)
        {
            return _unitOfWork.GetSession()
                .Query<Account>()
                .SingleOrDefault(x => x.Number == accountNumber);
        }

        public Account GetByNumberWithUpgradeLock(string accountNumber)
        {            
            ICriteria criteria = _unitOfWork.GetSession().CreateCriteria<Account>();
            criteria.SetLockMode(LockMode.Upgrade);
            criteria.Add(Restrictions.Eq("Number", accountNumber));
            Account account = (Account) criteria.UniqueResult();
            return account;
        }
    }

}
