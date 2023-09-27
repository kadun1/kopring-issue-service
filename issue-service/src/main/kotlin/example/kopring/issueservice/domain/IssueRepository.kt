package example.kopring.issueservice.domain

import example.kopring.issueservice.domain.enums.IssueStatus
import org.springframework.data.jpa.repository.JpaRepository

interface IssueRepository : JpaRepository<Issue, Long> {

    fun findAllByStatusOrderByCreatedAtDesc(status: IssueStatus) : List<Issue>?
}