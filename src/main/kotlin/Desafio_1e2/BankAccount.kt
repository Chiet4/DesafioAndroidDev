package Desafio_1e2

class BankAccount(
    private var balance: Double,
    val accountHolder: String
) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        } else {
            println("Não existe depósito negativo")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && balance >= amount) {
            balance -= amount
        } else {
            println("Seu saldo é insuficiente ou o valor é inválido")
        }
    }

    fun getBalance(): Double {
        return balance
    }

    override fun toString(): String {
        return "Nome: ${accountHolder}\nSaldo: R$${getBalance()}\n"
    }
}

fun main() {
    val bankAccount = BankAccount(120.76, "Anchieta Albano")
    bankAccount.deposit(192.0)
    bankAccount.withdraw(57.0)
    println(bankAccount.getBalance())
    println(bankAccount)
}
