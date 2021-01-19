/*Creating a class*/

class Employee(var name:String, var email:String) {

    /*creating a function with boolean return type*/

    def compareObject(s1:Employee,s2:Employee):Boolean = {

        if(s1.name.equals(s2.name) && s1.email.equals(s2.email)){
          return true;
        }else{
          return false;
        }

    }

    /*ToString Implentation*/
    override def toString = s"Employee($name, $email)"
}
