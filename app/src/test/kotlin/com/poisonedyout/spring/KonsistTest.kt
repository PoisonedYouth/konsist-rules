package com.poisonedyout.spring

import com.lemonappdev.konsist.api.Konsist
import com.poisonedyouth.konsist.rules.ImmutabilityRules.verifyDataclassesNotContainMutableVariable
import com.poisonedyouth.konsist.rules.SpringNamingRules.verifyRepositoryNamingConvention
import org.junit.jupiter.api.Test

class KonsistTest {

    @Test
    fun `verify that all repositories should comply with the naming convention`(){
        Konsist.scopeFromProduction().verifyRepositoryNamingConvention()
    }

    @Test
    fun `verify that all data classes only use immutable properties`(){
        Konsist.scopeFromProduction().verifyDataclassesNotContainMutableVariable(includeNested = true)
    }
}