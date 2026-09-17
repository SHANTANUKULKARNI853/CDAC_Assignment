//explore the concept of Inner class 
//
//Creat Outer class Account with variables 
//accId , holdername , balance 
//
//Inside that class create Inner class Locker with variables lockerId , duration 
//
//From Test class create an Object of  Account Outer class with parametrised Constructor 
//
//Also Create Object of Inner class with parametrised Constructor 
//
//And display contents of Account and Locker class using InnnerClass method showData ()

package assignment;

class Q2Test {

    public static void main(String[] args) {

        Q2Account account = new Q2Account(101, "Shantanu", 50000);

        Q2Account.Locker locker = account.new Locker(501, 12);

        locker.showData();
    }
}