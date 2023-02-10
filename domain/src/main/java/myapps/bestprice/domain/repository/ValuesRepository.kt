package myapps.bestprice.domain.repository

interface ValuesRepository {

    fun savePrice()
    fun getPrice()

    fun saveWeight()
    fun getWeight()

    fun savePricePerKgOrLiter()
    fun getPricePerKgOrLiter()

}