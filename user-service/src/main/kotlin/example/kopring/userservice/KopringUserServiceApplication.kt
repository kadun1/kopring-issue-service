package example.kopring.userservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class KopringUserServiceApplication

fun main(args: Array<String>) {
    runApplication<KopringUserServiceApplication>(*args)

}