import kotlin.math.max
fun main()
{ try {
      println("Введите a")
      var a = readLine()!!.toDouble()
      println("Введите b")
      var b = readLine()!!.toDouble()
      println("Введите c")
      var c= readLine()!!.toDouble()
      var p=(a+b+c)/2
      var r=Math.sqrt(((p-a)*(p-b)*(p-c))/p)
      var R= ((a*b*c) /4*Math.sqrt(p*((p-a)*(p-b)*(p-c))))
      var r1=String.format("%.2f",r)
      var R1=String.format("%.2f",R)
      when(a>0 && b>0 && c>0 && p>=0 )
      {
          true->println("Радиус вписанной окружности: $r1 Радиус описанной окружности: $R1")
            false->println("Стороны не могут быть меньше нуля")
      }
      }catch (e:Exception)
{
      println("Введен символ")
}
}