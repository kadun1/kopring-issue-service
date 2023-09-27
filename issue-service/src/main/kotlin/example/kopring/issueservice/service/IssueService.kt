package example.kopring.issueservice.service

import example.kopring.issueservice.domain.Issue
import example.kopring.issueservice.domain.IssueRepository
import example.kopring.issueservice.model.IssueRequest
import example.kopring.issueservice.model.IssueResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class IssueService(
    private val issueRepository: IssueRepository,
) {

    @Transactional
    fun create(userId:Long, request: IssueRequest) : IssueResponse {

        val issue = Issue(
            summary = request.summary,
            description = request.description,
            userId = userId,
            type = request.type,
            priority = request.priority,
            status = request.status,
        )

        return IssueResponse(issueRepository.save(issue))

    }
}