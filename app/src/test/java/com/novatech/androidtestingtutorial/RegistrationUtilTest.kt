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

}