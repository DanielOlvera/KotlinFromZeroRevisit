package oop.assignments.bank_account

enum class OperationType {
    DEPOSIT {
        override fun toString(): String {
            return "Money deposit"
        }
            },
    WITHDRAW {
        override fun toString(): String {
            return "Money withdraw"
        }
    },
    UNSUPPORTED
}