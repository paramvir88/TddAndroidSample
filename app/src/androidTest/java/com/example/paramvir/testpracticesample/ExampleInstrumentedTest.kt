package com.example.paramvir.testpracticesample

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 *
 *
 * Login screen - what we can test:
 * username and password is valid -> run check
 * username and password entered and only then login method happens -> unit test
 * when username and password are entered then only the submit button is enabled -> UI test
 *
 *
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.example.paramvir.testpracticesample", appContext.packageName)
    }

    
}
