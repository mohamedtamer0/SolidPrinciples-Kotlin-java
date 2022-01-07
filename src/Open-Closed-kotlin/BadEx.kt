package `Open-Closed-kotlin`

class Jobs (val name: String){
    fun getJobs(): String {
        when(name){
            "Tamer" ->{return "front-end"}
            "Salma" -> {return "Android"}
            "Ali" -> {return "back-end"}
            "ahmed" -> {return "paint"}
        }
        return name
    }
}

fun main() {
    val obj = Jobs("Tamer")
    println(obj.getJobs())
}