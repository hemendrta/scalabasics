class Employee(var name:String, var email:String) {


    def compareObject(s1:Employee,s2:Employee):Boolean = {

        if(s1.name.equals(s2.name) && s1.email.equals(s2.email)){
          return true;
        }else{
          return false;
        }

    }


    override def toString = s"Employee($name, $email)"
}
