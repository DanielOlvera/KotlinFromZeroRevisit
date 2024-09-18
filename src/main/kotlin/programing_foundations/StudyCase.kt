package programing_foundations

import java.text.DecimalFormat

/**
 * Requirements:
 * - Store in the program the change rate and the available cash in MXN
 * - Calculate the amount of money in MXN is in the base and the amount of USD available and the rate
 * - After every operation to indicate the amount of cash in the machine in both USD and MXN
 *
 * Design (Architecture)
 * - Program to perform the required tasks in Kotlin
 *
 * Algorithm design
 * // We need them only once
 * 1. Get change rate from user
 * 2. Get the available amount of money in the vault in MXN
 * 3. Get the available amount of money in the vault in USD
 *
 * // We will need them several times
 * 4. Get the amount of USD to change
 * 5. To sum the amount of USD to change and the available in vault
 * 6. Calculate the amount of MXN to return
 * 7. Get the difference between amount of MXN provided and the remaining in the cashier
 * 8. Show the user the amount of MXN to deliver and the amount of USD and MXN available in the vault
 * 9. Return to step 4 to execute the operations again
 * 10.To exit the program, just close it.
 *
 * Implementation
 */

var changeRate = 0.0
var vaultMXN = 0.0
var vaultUSD = 0.0
fun main() {

        print("Enter the change rate from USD to MXN: $")
        changeRate = readLine()?.toDouble() ?: 0.0

        print("Enter the amount of MXN to open vault: $")
        vaultMXN = readLine()?.toDouble() ?: 0.0

        print("Enter the amount of USD to open vault: $")
        vaultUSD = readLine()?.toDouble() ?: 0.0

    operationsControl()
}

fun operationsControl() {
    print("\nEnter the amount of USD to change: $")
    val usdToChange = readLine()?.toDouble()

    vaultUSD += usdToChange!!

    val mxnToReturn = changeRate * usdToChange

    vaultMXN -= mxnToReturn

    val currencyFormat = "#,###.00"

    println("""
        ** Receipt **
        MXN to return: $${DecimalFormat(currencyFormat).format(mxnToReturn)}
        
        MXN in vault: $${DecimalFormat(currencyFormat).format(vaultMXN)}
        USD in vault: $${DecimalFormat(currencyFormat).format(vaultUSD)}
    """.trimIndent())

    operationsControl()
}