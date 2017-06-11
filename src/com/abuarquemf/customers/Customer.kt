package com.abuarquemf.customers

/**
 * Created by animal505 on 10/06/17.
 */

class Customer constructor(name: String, age: Int, email: String) {

    private var name: String = "";
    private var age: Int = 0;
    private var email: String = "";

    init {
        println("Insided customer constructor");
        this.name = name;
        this.age = age;
        this.email = email;
    }

    fun getName(): String {
        return name;
    }

    fun getAge(): Int {
        return age;
    }

    fun getEmail(): String {
        return email;
    }

    override fun toString(): String {
        return "Customer(name='$name', age=$age, email='$email')"
    }
}
