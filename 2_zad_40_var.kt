fun main()
{
    try
    {
        println("Введите b")
        var b = readLine()!!.toDouble()
        println("Введите a")
        var a= readLine()!!.toDouble()
        println("Введите l")
        var l= readLine()!!.toDouble()
        var x1=(-b)/(2*a)
        var y1=a*x1*x1+b*x1
        var x2=(l-b)/(2*a)
        var y2=a*x2*x2+b*x2
        when(l>0)
        {
            true-> println("x1=$x1, y1=$y1, x2=$x2, y2=$y2")
            false->println("l не может меньше нуля или равен нулю")
        }
        when(x1>=0 && x1<=1 && y1>=0 &&y1<=1&&x2>=0 && x2<=1 && y2>=0 &&y2<=1)
        {
            true->println("Обе точки пересечения попадают в квадрат со стороной $l в начале координат")
            false->println("Обе точки пересечения не попадают в квадрат со стороной $l в начале координат")
        }
    }catch (e:Exception) {
        println("Введен символ")
    }
}