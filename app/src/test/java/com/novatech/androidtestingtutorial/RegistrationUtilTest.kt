package com.novatech.androidtestingtutorial

import RegistrationUtil
import com.google.common.truth.Truth.assertThat
import org.junit.Test


class RegistrationUtilTest{

    @Test
    fun `empty username return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "", "123", "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Nova", "123", "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl", "123", "123"
        )
        assertThat(result).isFalse()
    }

    // password is empty
    @Test
    fun `password is empty returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl", "", ""
        )
        assertThat(result).isFalse()
    }

    // password repeated incorrectly
    @Test
    fun `password repeated incorrectly returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl", "123", "122"
        )
        assertThat(result).isFalse()
    }

    // password contains less than two digits
    @Test
    fun `password contains less than two digits returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl", "abc1", "abc1"
        )
        assertThat(result).isFalse()
    }

}