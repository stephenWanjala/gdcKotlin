fun main() {
    var age =67
   /* if (age<18){
        println("you are a kid")
    }
    else if (age >=18 && age<35){
        println("Young adult")
    } else if (age>=35 && age<67){
        println("your are old")
    }
    else{
        println("You are really old")
    }
    */


     when{
        age<18 ->{
            println("You are a kid")
        }
         age>=18 && age<=35->{
             println("You are young adult")
         }
         age>=35 && age<67 ->{
             println("You are an adult")
         }
         else-> println("You are really old")
     }

}