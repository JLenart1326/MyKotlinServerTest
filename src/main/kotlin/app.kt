import spark.Request
import spark.Response
import spark.Spark.*

fun main() {

    get("/") { req, res -> "hello!" }
    get("/aaa") { req, res -> anyFunction(req, res) }


}

fun anyFunction(req: Request?, res: Response?): String {
    val test = "response"
    res!!.type("application/json")
    return test
}
