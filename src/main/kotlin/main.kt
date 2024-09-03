fun main () {
    val percentCommision = 0.0075
    val minCommision = 35
    val transferAmount = 500000
    val comision =  if (transferAmount * percentCommision > 35) transferAmount * percentCommision else minCommision
    println("Коммисия за перевод составит: $comision руб.")
}