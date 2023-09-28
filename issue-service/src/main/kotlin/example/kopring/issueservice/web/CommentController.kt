package example.kopring.issueservice.web

import example.kopring.issueservice.config.AuthUser
import example.kopring.issueservice.model.CommentRequest
import example.kopring.issueservice.model.CommentResponse
import example.kopring.issueservice.service.CommentService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/issue/{issueId}/comments")
class CommentController(
    private val commentService: CommentService,
) {

    @PostMapping
    fun create(
        authUser: AuthUser,
        @PathVariable issueId: Long,
        @RequestBody request: CommentRequest,
    ) : CommentResponse {
        return commentService.create(issueId, authUser.userId, authUser.username, request)
    }

    @PutMapping("/{id}")
    fun edit(
        authUser: AuthUser,
        @PathVariable id: Long,
        @RequestBody request: CommentRequest,
    ) = commentService.edit(id, authUser.userId, request)

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(
        authUser: AuthUser,
        @PathVariable issueId: Long,
        @PathVariable id: Long,
    ) {
        commentService.delete(issueId, id, authUser.userId)
    }
}