class Lab12 
{
  public static void main(String[] args)
  {
		Account account = new Account(1122,(double)20000);
		account.setRate(.045);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Account Balance is:"+account.getBal());
		System.out.println("Monthly Interest is:"+account.getInterest());
		System.out.println("Account Creation Date is:"+account.getDate());
  }
}
/*Account Balance is:20500.0
Monthly Interest is:76.875
Account Creation Date is:Tue Dec 16 12:43:01 EST 2014*/
