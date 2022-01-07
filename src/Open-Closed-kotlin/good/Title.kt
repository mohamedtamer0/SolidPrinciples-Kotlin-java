package `Open-Closed-kotlin`.good

interface Jobs {
    fun getJobs(): String
}

class Tamer:Jobs {
    override fun getJobs(): String {
        return "front-end"
    }
}

class Salma:Jobs {
    override fun getJobs(): String {
        return "Android"
    }
}

class Ali:Jobs {
    override fun getJobs(): String {
        return "back-end"
    }
}