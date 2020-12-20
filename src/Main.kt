fun main() {
    println("Ingresa un numero al que llamaremos x: ")
    val x = readLine().toString().toInt()
    var barra= "|  |"
    println("El numero x es: $x")
    if (x%2 == 0){
        print(" __\n")
        for (lado in 1..x){
            println(barra)
        }
        print(" --")
    }else{
        var element=x*5
        var lista= mutableListOf<Int>()
        repeat(element){
            lista.add((0..10).random())
        }
        print("La lista es: $lista")

        var listaPares = mutableListOf<Int>()
        for (element in lista){
            if(element%2 == 0){
                listaPares.add(element)
            }
        }
        print("\nElementos pares de la lista: $listaPares")

        print("\nLa lista ordenada es:")
        lista.sort()
        print(lista)
    }
}


