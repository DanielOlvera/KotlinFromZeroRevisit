package oop.states

enum class TaskState {
    PENDING {
        override fun toString(): String {
            return "Task haven't been performed"
        }
            },
    IN_PROCESS,
    COMPLETED {
        override fun toString(): String {
            return "Task Completed Successfully"
        }
    }
}