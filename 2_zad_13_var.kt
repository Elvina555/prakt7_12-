import kotlin.math.exp
import  kotlin.math.pow
fun main()
{ try {
    println("Введите x")
    var x = readLine()!!.toDouble()
    println("Введите y")
    var y= readLine()!!.toDouble()
    when((x>=1 && x<=2)&&(y>=1 && y<=2))
    {
        true->println("Точка принадлежит заштрихованной части")
        false->println("Точка принадлежит не заштрихованной части")
    }
      }catch (e:Exception) {
    println("Введен символ")
}
}
