fun main()
{ try {
    println("Введите x")
    var x = readLine()!!.toDouble()
    println("Введите y")
    var y= readLine()!!.toDouble()
    println("Введите z")
    var z= readLine()!!.toDouble()
    var max=0.0
    var min=0.0
    when(x>z)
    {
        true->max=x
        false->max=z
    }
    when (x<=y && x<=z)
    {
        true->min=x
        false->when(y<=x && y<=z)
        {
            true->min=y
            false-> when(z<=x && z<=y)
            {
               true-> min = z
            }

        }
    }
    println("Минимальное число:$min Максимальное число:$max")
    var l=28*max-3*min
    println("Ответ:$l")
      }catch (e:Exception)
{
    println("Введен символ")
}
}