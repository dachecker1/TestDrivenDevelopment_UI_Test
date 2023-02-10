package com.vk.testdrivendevelopment_ui_test

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.github.javafaker.Faker
import org.junit.Rule
import org.junit.runner.RunWith
import org.koin.test.KoinTest
import org.koin.test.inject
import org.koin.test.mock.MockProviderRule
import org.mockito.Mockito

@RunWith(AndroidJUnit4::class)
class MainActivityTest : KoinTest {

    @get:Rule
    val mockProvider = MockProviderRule.create { clazz ->
        Mockito.mock(clazz.java)
    }

    private val mockRepository : Repository by inject()
    private var faker = Faker()
}