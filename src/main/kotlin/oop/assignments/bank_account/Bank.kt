package oop.assignments.bank_account

fun main() {

    val bankAccount = Account("01-8547-9", "Alberto Palma", 5000.00)

    val (clabe, name) = bankAccount

    while (true) {

        println("""
        Options
        1 - Deposit
        2 - Withdraw
    """.trimIndent())

        print("Enter the operation you want to perform: ")

        val selection = when (readLine()) {
            "1" -> {
                OperationType.DEPOSIT
            }
            "2" -> {
                OperationType.WITHDRAW
            }
            else -> {
                OperationType.UNSUPPORTED
            }
        }

        print("Enter the amount: ")
        val amount = readLine()!!.toDouble()

        val previousBalance = bankAccount.balance

        getNewBalance(selection, bankAccount, amount)

        println("""

        ------------- Receipt -------------
        Clabe: $clabe - Owner: $name
        
        Action: $selection
        Amount: $amount
        Previous balance: $previousBalance
        New balance: ${bankAccount.balance}

    """.trimIndent())
    }
}

private fun getNewBalance(
    selection: OperationType,
    bankAccount: Account,
    amount: Double
) = if (selection == OperationType.DEPOSIT) {
    println("test + ${bankAccount.balance}")
    bankAccount.balance += amount
} else {
    println("test - ${bankAccount.balance}")

    bankAccount.balance -= amount
}