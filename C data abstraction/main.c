#include <stdio.h>
#include <stdlib.h>



typedef struct {
    char owner[50];
    int balance;
} BankAccount;

// Abstracted operations
void deposit(BankAccount *acc, int amount) {
    acc->balance += amount;
}

int getBalance(BankAccount *acc) {
    return acc->balance;
}

int main() {
    BankAccount acc = {"Felix", 5000};
    deposit(&acc, 1000);
    printf("Your new balance is %d", getBalance(&acc));  // 6000
    return 0;
}
