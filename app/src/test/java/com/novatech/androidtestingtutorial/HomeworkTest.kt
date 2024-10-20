package com.novatech.androidtestingtutorial

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class HomeworkTest{
    @Test
    fun `correct input returns correct result`() {
        val result = Homework.fib(5)
        assertThat(result).isEqualTo(3)
    }

    @Test
    fun `correct number of braces returns true`() {
        val result = Homework.checkBraces("(())")
        assertThat(result).isTrue()
    }

    @Test
    fun `incorrect number of braces returns false`() {
        val result = Homework.checkBraces("(()")
        assertThat(result).isFalse()
    }

}