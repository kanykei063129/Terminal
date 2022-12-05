package services.impl;

import classes.BankAccount;
import classes.Person;

public class PersonImpl extends Person {
   private Person[] people;

   public PersonImpl(String firstName, String lastName, String gmail, String phoneNumber, String password, BankAccount bankAccount) {
      super(firstName, lastName, gmail, phoneNumber, password, bankAccount);
   }
}
