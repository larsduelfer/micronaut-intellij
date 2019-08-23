package testapp

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("testapp")
                .mainClass(Application.javaClass)
                .start()
    }
}