import kotlin.math.abs
import  kotlin.math.pow
import  kotlin.math.log10
fun main()
{ try {
    println("Введите a")
    var a = readLine()!!.toDouble()
    println("Введите b")
    var b = readLine()!!.toDouble()
    println("Введите c")
    var c= readLine()!!.toDouble()
    println("Введите d")
    var d = readLine()!!.toDouble()
    println("Введите n")
    var n = readLine()!!.toDouble()
    var ch=0.25*(a-b).toDouble()
    var ch1=abs(b).toDouble()
    var ch2=c-d.toDouble()
    var ch3=10.0.pow(n+3).toDouble()
    var ch4=ch3+(log10(b)/ch2).toDouble()
    var ch5=ch1/ch4.toDouble()
    var ch6=(1/8)-ch5.toDouble()
    var ch7=ch/ch6.toDouble()
    var ch8=String.format("%.2f",ch7)
    when (ch6>0)
    {
        true->println("Ответ:$ch8")
        false->println("Знаментатель должен быть больше нуля")
    }
    }catch (e:Exception)
{
    println("Введен символ")
}
}