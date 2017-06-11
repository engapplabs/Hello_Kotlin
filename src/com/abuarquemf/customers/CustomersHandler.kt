package com.abuarquemf.customers

/**
 * Created by animal505 on 10/06/17.
 */

class CustomersHandler {

    private var customers = mutableListOf<Customer>();

    fun addCustomer(customer: Customer): Unit {
        customers.add(customer);
    }

    fun getCustomers(): List<Customer> {
        return customers;
    }

    override fun toString(): String {
        return "CustomersHandler(customers=$customers)"
    }
}
