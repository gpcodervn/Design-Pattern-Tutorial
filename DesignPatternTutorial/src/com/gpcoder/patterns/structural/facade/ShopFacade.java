package com.gpcoder.patterns.structural.facade;

public class ShopFacade {

	private static final ShopFacade INSTANCE = new ShopFacade();

	private AccountService accountService;
	private PaymentService paymentService;
	private ShippingService shippingService;
	private EmailService emailService;
	private SmsService smsService;

	private ShopFacade() {
		accountService = new AccountService();
		paymentService = new PaymentService();
		shippingService = new ShippingService();
		emailService = new EmailService();
		smsService = new SmsService();
	}

	public static ShopFacade getInstance() {
		return INSTANCE;
	}

	public void buyProductByCashWithFreeShipping(String email) {
		accountService.getAccount(email);
		paymentService.paymentByCash();
		shippingService.freeShipping();
		emailService.sendMail(email);
		System.out.println("Done\n");
	}

	public void buyProductByPaypalWithStandardShipping(String email, String mobilePhone) {
		accountService.getAccount(email);
		paymentService.paymentByPaypal();
		shippingService.standardShipping();
		emailService.sendMail(email);
		smsService.sendSMS(mobilePhone);
		System.out.println("Done\n");
	}
}
