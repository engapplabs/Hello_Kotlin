package com.abuarquemf.view

import com.abuarquemf.customers.Customer
import com.abuarquemf.customers.CustomersHandler
import java.util.*

/**
 * Created by animal505 on 10/06/17.
 */

class App {
    private val customersHandler = CustomersHandler();
    private val scanner = Scanner(System.`in`)
    private val menuMessage = "1. Add new Customers;\n2. Show Customers info.\n3. Finish\n"

    private fun addCustomer() {
        println("Client name: ")
        val name = readLine()
        println("Cliente email: ")
        val email = readLine()
        println("Cliente age: ")
        val age = scanner.nextInt()

        customersHandler.addCustomer(Customer(name as String, age, email as String))
    }

    private fun showCustomersInfo() {
        var counter: Int = 1;
        val customers: List<Customer> = customersHandler.getCustomers()
        if(customers.size != 0) {
            for (customer in customers)
                println("${counter++}:\tName: ${customer.getName()}\n" +
                        "\tEmail: ${customer.getEmail()}\n\tAge: ${customer.getAge()}")
        } else {
            println("There are no customers.");
        }
    }

    fun run() {
        var finish: Boolean = false
        while(!finish) {
            println(menuMessage)
            val option: Int = scanner.nextInt()
            when(option) {
                1 -> addCustomer()
                2 -> showCustomersInfo()
                3 -> finish = true
            }
        }
    }
}