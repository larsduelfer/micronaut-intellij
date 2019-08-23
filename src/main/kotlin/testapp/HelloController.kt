package testapp

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller()
class LikeController() {

    @Get("/hello")
    fun findLikes(): HttpResponse<String> {
        return HttpResponse.ok("Hello")
    }
}