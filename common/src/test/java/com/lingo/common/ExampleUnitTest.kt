package com.lingo.common

import org.junit.Assert
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val yesResult = true.yes {
            1
        }.otherwise {
            2
        }

        val yesOtherwiseResult = false.yes {
            1
        }.otherwise {
            2
        }

        val noResult = true.no {
            1
        }.otherwise {
            2
        }

        val noOtherwiseResult = false.no {
            1
        }.otherwise {
            2
        }

        Assert.assertEquals(yesResult, 1)
        Assert.assertEquals(yesOtherwiseResult, 2)
        Assert.assertEquals(noResult, 2)
        Assert.assertEquals(noOtherwiseResult, 1)
    }
}
