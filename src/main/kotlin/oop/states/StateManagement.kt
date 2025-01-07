package oop.states

fun main() {
    val listOfTasks = arrayListOf(Task("Shower", TaskState.PENDING),
        Task("Brush teeth", TaskState.COMPLETED), Task("Breakfast", TaskState.PENDING))

    var taskCounter = 0

    listOfTasks.forEach {
        if (it.state == TaskState.PENDING) {
            taskCounter++
        }
    }

    println("Pending tasks: $taskCounter")
    println("Message: ${listOfTasks[1].state}")
}