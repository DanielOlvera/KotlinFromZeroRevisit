package programing_foundations.assignments

fun main() {
    print("Monthly income before taxes: $")
    val monthlyIncome = readLine()?.toDouble()

    print("Monthly tax percentage: ")
    val taxPercentage = readLine()?.toDouble()

    val monthlyTax = taxPercentage?.let { monthlyIncome?.times (it.div(100)) }
    val netMonthlySalary = monthlyTax?.let { monthlyIncome!!.minus(it) }
    val netAnnualSalary = netMonthlySalary?.times(12)
    val annualTax = monthlyTax?.times(12)

    println("""
        
        Net monthly income: $netMonthlySalary
        Monthly tax: $monthlyTax
        
        Net annual salary: $netAnnualSalary
        Annual tax: $annualTax
    """.trimIndent())
}