package oop.data

data class PersonB(
    var name: String,
    var phone: String
) {

    //Data classes allow us to create methods and operate with the parameters of the class
    fun getLengthOfName(): Int {
        return name.length
    }
}
