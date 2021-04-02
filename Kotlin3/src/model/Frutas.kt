package model



class Frutas : Alimento(){
    val menuFrutas = """Ingresa cuales frutas deseas agregar a la receta
    |1. Fresa
    |2. Platanos
    |3. Uvas
    |4. Manzana
    |5. Naranja
    |6. Pera
    |7. Cereza
    |8. Dovelverse
"""
    init {
        displayList()
    }

    init {
        displayList()
    }
    override fun displayList() {
        this.ingredienteReceta = ""
        do{
            println("Ingresa en que cantidad deseas la fruta")
            this.cantidad = readLine()?.toDouble()?:0.0

            println(menuFrutas)
            this.opcion = readLine()?.toInt()?:0

            when(opcion){
                1 -> this.ingredienteReceta += "Se agregan ${cantidad.toInt()} Fresas\n"
                2 -> this.ingredienteReceta += "Se agregan ${cantidad.toInt()} Platanos\n"
                3 -> this.ingredienteReceta += "Se agregan ${cantidad.toInt()} Uvas\n"
                4 -> this.ingredienteReceta += "Se agregan ${cantidad.toInt()} Manzanas\n"
                5 -> this.ingredienteReceta += "Se agregan ${cantidad.toInt()} Naranjas\n"
                6 -> this.ingredienteReceta += "Se agregan ${cantidad.toInt()} Peras\n"
                7 -> this.ingredienteReceta += "Se agregan ${cantidad.toInt()} Cerezas\n"
                8 -> {}
                else -> println("Ingresa una opcion correcta")
            }
        }while (opcion != 8)
    }
}