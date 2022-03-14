package ru.netology

fun main(){
    val pastPurchases = 1005
    val isRegularCustomer = true
    val basketAmount = 101
    val discountStartFirst = 1000
    val discountStartSecond = 10000
    val discount = if (pastPurchases <= discountStartFirst) 0
        else if (pastPurchases <= discountStartSecond) 100
        else (basketAmount*0.05).toInt()
    val rawTotalPrice = if(basketAmount<discount) basketAmount else basketAmount-discount
    val totalPrice = if (isRegularCustomer) rawTotalPrice*0.99
        else rawTotalPrice
    val greetingOut = if (isRegularCustomer) "Спасибо, что являетесь постоянным покупателем"
        else "Будем рады видеть вас среди наших постоянных покупателей"
    println("Сумма покупки: $totalPrice\n $greetingOut")
}