package com

import com.example.myapplication.User
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class UserTest {

    @Test
    fun testIsAdult() {
        val user = User("Mike", 49)
        assertTrue(user.isAdult())
    }

    @Test
    fun testIsNotAdult() {
        val user = User("Emi", 13)
        assertFalse(user.isAdult())
    }

    @Test
    fun testIsTeenager() {
        val user = User("Sofia", 14)
        assertTrue(user.isTeenager())
    }

    @Test
    fun testIsNotTeenager() {
        val user = User("jaime", 54)
        assertFalse(user.isTeenager())
    }

    @Test
    fun testIsChild() {
        val user = User("Mari", 9)
        assertTrue(user.isChild())
    }

    @Test
    fun testIsNotChild() {
        val user = User("Math", 66)
        assertFalse(user.isChild())
    }
}