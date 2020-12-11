package com.example.a2

fun main (){
    val a= listOf("a","a","b","c", "a", "aaaaa", "b")
    if(a.size<=1) println(a[0])
    var b = arrayListOf<Int>()
    val n=a.size-1
    var c =0
    for (i in 0..n){
        for (j in 0..n){
            if (a[i]==a[j]){
               c++}
        }
        b.add(c)
        c=0
    }
    var e= b.indexOf(b.max())

println (println(a[e]))
}