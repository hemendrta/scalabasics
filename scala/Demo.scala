import java.util
import java.util.{Collections, Date}

import scala.collection.mutable.ListBuffer

object Demo {
  def main(args: Array[String]): Unit = {

    println("Welcome")

    var num:Int = 10; /*value of var can be changed*/

    val num1:Int =20; /*value of val can not be changed*/

    println(num+num1);

    num =20; /*Demonstration that we can change the value of a var*/

    println(num+num1);

    /*Semi colon is not mandatory at the end of statement*/

    var name:String = "hemendra singh chouhan"

    println("\nLength of the string is : "+name.length)

    /*Creating a class*/

    case class Student(){

    }

    /*Creating a class with parameterized constructor*/

//    case class Employee(var name:String, var age:Int, var email:String, var dob:Date){
//
//    }

    /*creating a class and adding default values to it*/

    case class Person(var name:String ="Hemendra Singh Chouhan", var contact:Long=7999996891l){

      private var name1:String = name;

      /*Declaration of methods*/

      def showData(): Unit ={

          println("\n"+name+"\n"+contact+"\n"+name1);

      }

      def showInfo()= {

        println("Another function")

      }

    }

    /*creating object of class*/

    var person:Person = Person();
    println("--------------------------------------")
    println(person.name);
    println(person.contact);

    println("---------------------------------------")

    var person1 = Person();
    println("--------------------------------------")
    println(person1.name);
    println(person1.contact);

    /*Assigning values to the members of class*/

    person1.contact=7999996890l;
    person1.name="Aditi Gupta Chouhan"

    println("--------------------------------------")
    println(person1.name);
    println(person1.contact);

    /*Accessing the function in the class*/

    println("--------------------------------------")
    var person2 = Person("Sunny Singh Chouhan", 9229170965l);

    println(person2)
    person2.showData()

    println("--------------------------------------")
    person.showInfo()

    println("--------------------------------------")

    var employee1 =new Employee("Hemendra","hemendra.singh.c@outlook.com");
    var employee2 =new Employee("Subhash","subhash.singh.c@outlook.com");
    var employee3 =new Employee("Aditi","aditi.singh.c@outlook.com");
    var employee4 =new Employee("Nisha","nisha.singh.c@outlook.com");
    var employee5 =new Employee("Demo","demo.singh.c@outlook.com");

    /*Adding elements to the list or creating a list of type Employee*/

    var col:List[Employee]=List(employee1,employee2,employee3,employee4,employee5)

    /*Usage of forEach loop*/

    col.foreach(f=> println(f.name))
    println("--------------------------------------")

    /*Implementing comparator*/

    col.sorted((e1:Employee,e2:Employee)=> e2.name.compareTo(e1.name)).foreach(e=> println(e))
    println("--------------------------------------")

    /*Implementation of filter*/

    col.filter(f=> f.name.length>5).foreach(e=> println("\n"+e.name+":"+e.email))
    println("--------------------------------------")
    for(e <- col){
      println(e.name)
    }
    println("--------------------------------------")

    col.map(e=> e.name.length).foreach(len=> println(len))

//    println(employee1.compareObject(employee1,employee2))

    println("--------------------------------------")

    /* Conditional Statement Usage */

   var name1:String="Hemendra Singh Chouhan"

    if(name1.length>5){

      println(name1.length)
    }else{

      print(name1+" : length is smaller")

    }
    println("--------------------------------------")
    /* Loops */

    var num11=1;
    while(num11<10){

      println(num11)
      num11 = num11 + 1
    }

    println("--------------------------------------")

    var j=2;

    for(i<- 0 to 10){

      println(i*j)

    }

    println("--------------------------------------")

    for(k <- 1 until 10){

      println(k)

    }

    println("--------------------------------------")

    var p1:Person1 = new Person1(101,"Hemendra Singh Chouhan","M","India","Madhya Pradesh", "Indore")
    var p2:Person1 = new Person1(102,"Aditi Singh Chouhan","F","India","Madhya Pradesh", "Indore")
    var p3:Person1 = new Person1(103,"Nisha Singh Chouhan","F","India","Madhya Pradesh", "Indore")
    var p4:Person1 = new Person1(104,"Subhash Singh Chouhan","M","India","Madhya Pradesh", "Indore")
    var p5:Person1 = new Person1(105,"Sunny Singh Chouhan","M","India","Madhya Pradesh", "Indore")

    /* Loop Variations */

    var list = List(p1,p2,p3,p4,p5);
    for(i<- list){
      println(i.name+":"+i.gender)

    }

    println("--------------------------------------")

    list.foreach(p=>println(p.name))

    println("--------------------------------------")

    for(i<- list if i.gender.equalsIgnoreCase("F")){
      println(i.name+":"+i.gender)

    }
    println("--------------------------------------")

    /* Anonymous Function */

    var result1= (a:Int,b:Int)=> a+b
    println(result1(10,20))

    var test1= (str:String)=> str.length


    println("--------------------------------------")

    println(test1("hemendra"))

    println("--------------------------------------")

    /* Dealing with Collections */

    var nums=Set() //empty set

    var set2example = Set(10,10,20,30,40,50)

    for(i<- set2example){

      println(i)

    }
    println("--------------------------------------")

    println(set2example.head) //gets the element which is at the first place.

    println(set2example.tail) //returns all element except first element.

    println(set2example.isEmpty) //tells whether the collection is empty or not.



  }


}
