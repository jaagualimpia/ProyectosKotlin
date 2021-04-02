package model

abstract class Alimento () {
    var opcion = 0
    var cantidad = 0.0
    protected var ingredienteReceta = ""
    protected abstract fun displayList()

    fun getIngredientesReceta(): String{
        return this.ingredienteReceta
    }

}
