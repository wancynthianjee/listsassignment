import java.util.Objects
import javax.swing.tree.FixedHeightLayoutCache

fun main() {
    num()
//     val heights=(29,34,12,34,56,78)
  println(Obeject())
    println(CarType())



}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun num(): List<Int> {
    val indices= mutableListOf(2,4,7,9,10,12,13,9,5,1,15)
    val evenList=indices.filter{x ->x %2==0}

    println(evenList)
    return evenList

}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
//fun heights(height: Any):List<Double>{
//    val averageheightt=height.average()
//    val height = null
//    val totalheightt=height.sum()
//    val averageSum=ListOf(averageheightt,totalheightt)
//    return averagesum()
//}



//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Guys(var name:String, var age:Int,var height:Double,var weight:Double)
    fun Obeject(): Object {
        val mimi = Guys("July", 10, 1.7, 67.8)
        val mimo = Guys("Maya", 15, 1.9, 33.8)
        val mima = Guys("Jack", 22, 2.7, 77.6)
        val milo = Guys("Jackt", 29, 1.8, 56.9)
//        val objects = mutableListOf(mimi,mimo,mima,milo,)
//        Guys.sortByDescending{ object -> object.name}.sortedBy{ object -> object.height }
        return Object()
    }



//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//fun addGuys(Guys: MutableList<Object>): MutableList<Object> {
////    val Guys1 = Object("Jim",22,67)
////    val Guys2 = Object("Najim", 56)
////
////    Object.(listOf(Guys1, Guys2))
////    return (addGuys())
//}




//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(var registration:String, var mileage:Int)
fun CarType():Double{
    val car1=Car("KAK ,755",500)
    val car2=Car("BYN ,667",6745)
    val car3=Car("GAR ,889",8790)
    var lists= mutableListOf(car1,car2,car3)
    var mileage= listOf(car1.mileage,car2.mileage,car3.mileage)
    return (mileage.average())
}

