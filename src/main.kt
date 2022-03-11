fun main(){
    names(arrayOf("Amina","Mwende","Cate","Salma"))
    towns()
    numbers()
    mention(arrayOf("quinter","yvonne","merry"))

}
//function that creates an aaray out of them and prints out the array
fun names(name:Array<String>){
    println(name.contentToString())
}
fun towns(){
    var cities= arrayListOf("harare","mumbai","dodoma","jakarta")
    cities.forEach { city->
    println(city.capitalize())

    }
}
fun numbers(){
    var numbers=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum= numbers[1] + numbers[4]
    println(sum)
    var index=numbers.indexOf(158)
    println(index)
    var element =numbers.sortedArray()
    println(element.contentToString())
}
fun mention(mention:Array<String>):Array<String>{
    var women=mention
    println(women.contentToString())
    return women
}
