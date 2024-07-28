package lesson2

fun main() {
accountingSoftware()
}

fun accountingSoftware() {
    val employee = 50
    val employeeSalary = 30000
    val interns = 30
    val salaryForIntern = 20000

    val employeeSalaryExpenses = employee * employeeSalary
    println("Employee salary expenses: $employeeSalaryExpenses")

    val salaryExpensesForInterns = interns * salaryForIntern
    println("Salary expenses for intern: $salaryExpensesForInterns")

    val sumSalaryForEmployeeAndInterns = employeeSalaryExpenses+salaryExpensesForInterns
    println("Sum salary for Employee and Interns: $sumSalaryForEmployeeAndInterns")

    val sumOfEmployee =employee+interns
    println("Sum of Employee and Interns: $sumOfEmployee")

    val averageEmployeeSalary = sumSalaryForEmployeeAndInterns/sumOfEmployee
    println("Average employee salary: $averageEmployeeSalary")

}