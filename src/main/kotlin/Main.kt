fun main() {
    campusName("AkiraChix")

    var a = introduction("vicky", 45)
    println(a)


    var c = getLength("amazing")
    println(c)
    var d = getLength("expressive")
    println(d)

    checkName("vicky")
    checkName("Waeni")
}


fun campusName(campus: String){
    val campus = "AkiraChix"
    println(campus[0] + "" + campus[2] + campus[3])
}


fun introduction(name: String, age: Int):String{
    return "Hi, my name is $name and I am $age years old."
}


fun getLength(text: String):Int{
    return text.length
}


fun checkName(person:String){
    val firstName = "Vicky"
    if(person.equals(firstName)){
        println("That's me!")
    }
    else
    {
        println("I don't know who that is!")
    }
}