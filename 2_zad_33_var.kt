fun main()
{
    try
    {
        println("Введите k")
        var k = readLine()!!.toDouble()
        println("Введите b")
        var b = readLine()!!.toDouble()
        println("Введите r")
        var r= readLine()!!.toDouble()
        if(r>0)
        {
            var d=4*k*k*b-4*(k*k+1)*(b*b-r*r)
            var c=when
            {
                d<0->0
                d==0.00->1
                else->2
            }
            println("Количество точек пересечения расположеных в первой координатной четверти: $c")
        }
        else
            println("Радиус не может меньше нуля или равен нулю")
    }catch (e:Exception) {
        println("Введен символ")
    }
}