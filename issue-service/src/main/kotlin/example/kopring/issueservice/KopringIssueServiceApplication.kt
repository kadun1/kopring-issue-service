package example.kopring.issueservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class KopringIssueServiceApplication

fun main(args: Array<String>) {
    runApplication<KopringIssueServiceApplication>(*args)
}
