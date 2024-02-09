import kotlin.math.max
fun main()
       { try {
               println("Введите первый член прогрессии")
               var a = readLine()!!.toDouble()
               println("Введите пятый член прогрессии")
               var b = readLine()!!.toDouble()
               println("Введите число n")
               var n= readLine()!!.toDouble()
           var d=(b-a)/4
           var d2=a+(n-1)*d
           var sum=((a+d2)*n)/2
           print ("Величина члена прогрессии с номером N: $d2")
           print ("Сумма N чисел: $sum")
           } catch (e:Exception)
       {
               println("Введен символ")
           }
       }