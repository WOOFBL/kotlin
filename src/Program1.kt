fun main() {
    var peple = Person()
    peple.setName()

}
class Person{
    fun setName() {
        var newName: String
        var num = readln().toInt()
        for (i in 1..num){
            val input = readln()
            newName=input
            printName(newName)

        }

    }
    fun  printName(newName: String) {
        println("Name: "+newName)


    }



}