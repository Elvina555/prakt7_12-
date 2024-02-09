import kotlin.math.tan
fun main()
{
    try
    {
        println("Введите x")
        var x = readLine()!!.toDouble()
        println("Введите y")
        var y = readLine()!!.toDouble()
        println("Введите r")
        var r= readLine()!!.toDouble()
        println("Введите R")
        var R= readLine()!!.toDouble()
        val z=x*x+y*y
        when(r*r<=z && z<=R*R)
        {
            true->println("Поподает точка в кольцо")
            false->println("Поподает точка в кольцо")
        }
    }catch (e:Exception) {
        println("Введен символ")
    }
}