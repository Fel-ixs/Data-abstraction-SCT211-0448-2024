
class BankAccount:
    def __init__(self, owner, balance):
        self.owner = owner
        self.__balance = balance   # private attribute

    def deposit(self, amount):
        self.__balance += amount
        return amount

    def get_balance(self):
        return self.__balance


acc = BankAccount("Felix", 5000)
deposited_amount = acc.deposit(1000)

print(f"Your balance is {acc.get_balance()} and the amount deposited is {deposited_amount}")