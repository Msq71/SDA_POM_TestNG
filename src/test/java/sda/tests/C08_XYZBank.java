package sda.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import sda.pages.XYZBank;
import sda.utilities.Driver;

import java.awt.dnd.DragGestureEvent;

public class C08_XYZBank {
    //Open 5 new  Accounts, deposit 100 USD and withdraw 100 USD from any account and delete all accounts you created.

    @Test
    public void XYZBankTest() throws InterruptedException {

        XYZBank xyzBank = new XYZBank();
        String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
//  Go to url https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
        Driver.getDriver().get(url);

//  Click on "Bank Manager Login" button
        xyzBank.managerLoginButton.click();
//  Click on "Add Customer" button
        xyzBank.addCustomerButton.click();
//  Fill inputs and click on "Add Customer" submit button
        Thread.sleep(1000);
        xyzBank.addCustomer();
//  Accept alert
        Thread.sleep(1000);
        xyzBank.acceptAlert();
        Thread.sleep(1000);
//  Add 4 more customers
        xyzBank.addCustomer();
        xyzBank.addCustomer();
        xyzBank.addCustomer();
        xyzBank.addCustomer();
//  Click on "Open Account" button
        xyzBank.openAccount.click();
//  Click on "Customer" dropdown
        xyzBank.customerDropdown.click();

//  Select customer name
//  Click on "Currency" dropdown
//  Select "Dollar"
//  Click on "Process" button
        xyzBank.openAccount(0);
//  Accept alert
        xyzBank.acceptAlert();
//  Open 4 more accounts
        xyzBank.openAccount(1);
        xyzBank.openAccount(2);
        xyzBank.openAccount(3);
        xyzBank.openAccount(4);
//  Click on "Customers" button
        xyzBank.customersButton.click();

//  Count table row numbers
        System.out.println("row numbers = " + xyzBank.rows.size());
//  Assert that you created 5 customers
        xyzBank.verifyRowNumber(5);
//  Click on "Home" button
        xyzBank.homeButton.click();
//  Click on "Customer Login" button
        xyzBank.customerLoginButton.click();
//  Click on "Your Name" dropdown
        xyzBank.yourNameDropdown.click();
//  Select any name you created
        xyzBank.selectName(5);
//  Click on "Login" button
        xyzBank.loginButton.click();
//  Click on "Deposit" button
        xyzBank.depositButton.click();
//  Type 100 into "Amount to be Deposited" input
        xyzBank.amountField.sendKeys("100");
//  Click on "Deposit"(Submit) button
        xyzBank.amountSubmitButton.click();
//  Assert that "Deposit Successful" is displayed
        Assert.assertTrue(xyzBank.depositMsg.isDisplayed());
//  Click on "Withdrawal" button
        xyzBank.withdrawalButton.click();
//  Type 100 into "Amount to be Withdrawn" input
        xyzBank.amountField.sendKeys("100");
//  Click on "Withdraw"(Submit) button
        xyzBank.amountSubmitButton.click();
//  Assert that "Transaction  Successful" is displayed
        Assert.assertTrue(xyzBank.withdrawalMsg.isDisplayed());
//  Click on "Logout" button
        xyzBank.logOutButton.click();
//  Click on "Home" button
        xyzBank.homeButton.click();
//  Click on "Bank Manager Login" button
        xyzBank.managerLoginButton.click();
//  Click on "Customers" button
        xyzBank.customersButton.click();
//  Click on each "Delete" button
        xyzBank.deleteAllCustomers();
//  Count table row numbers
        System.out.println("row numbers = " + xyzBank.rows.size());
//  Assert that number of customers is 0
        Assert.assertTrue(xyzBank.rows.isEmpty());
    }

}
