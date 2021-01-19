import scala.collection.mutable.ListBuffer

class Person1 (var id:Int, var name:String, var gender:String, var country:String, var state:String, var city:String){

    override def toString = s"Person($id, $name, $gender, $country, $state, $city)"

}
