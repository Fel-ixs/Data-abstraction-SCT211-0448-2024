class BankAccount {
    constructor(owner, balance) {
        this.owner = owner;
        let _balance = balance;  // private variable via closure
       
        this.deposit = function(amount) {
            _balance += amount;
        }

        this.getBalance = function() {
            return _balance;  // only accessible through method
        }
    }
}

let acc = new BankAccount("Felix", 5000);
acc.deposit(1000);
console.log(acc.getBalance());   // 6000