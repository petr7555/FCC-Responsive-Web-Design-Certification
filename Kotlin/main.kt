fun main(args: Array<String>) {
 println("Hello world!");

 val num = "cannot be reassigned";
 var test = 15;
 println(test);
 test = 215416;

 var x: Int = 0b11011011_11100010;
 var str: String = "string";

 val a: Double = 1.2;
 val b: Float = 1.2f;
 val c: Long = 154_536_436_543L;
 val d: Short = 0x0F;
 val e: Byte = 120;
 val f: Boolean = true;
 val g: Char = 'a';

 println("$num $test $x $str");
 print("$a $b $c $d $e $f $g");
 println("num is" + test);
 println("num is $test");
 println("num is ${test+a}");
 
// val input = readLine();
// var long = input!!.toLong()
// println(input.toInt() + long);

var h = 8/3; // equals 2
var i = 5.2 / 2;
println(i)
h++;
++h;
h--;
println(h)

var j = 5;
var s1 = "value is $j";
var s2 = "${s1.replace("is","was")}, but now is ${j + 2}";
println(s2);

// practiseOne()
// practiseTwo()

val hour = 11;
if (hour < 12){
    println("Good morning");
} else if (hour < 18) {
    println("Good day");
} else {
    println("Good evening");
}

val isMorning = hour < 12;
if (isMorning) {
    println("Good morning again");
}

val n1 = 5;
val n2 = 7;
val max = if (n1 > n2) n1 else n2;
println(max);

if ((!false && true) || false) {
    println("so true");
}

val number = 15;
when (number) {
    10,11,12 -> println("case 1");
    15 -> println("case 2");
    else -> println("default case");
}

val s = when {
        number >= 15 -> "case 3";
        else -> "unknown";
}

println(s);

x = 0;
while (x<= 5) {
    println(x)
    x++;
}

x = 5;
do {
    println(x);
    x--;
    if (x==3) {
        break;
    }
} while (x>0);

x = 0;
while (x<5){
    x++;
    if (x==3) {
        continue;
    } 
    println(x);
}

var arr = arrayOf(1,2,3);
println(arr[0]);
var nums: IntArray = intArrayOf(4, 13, 25,6,-2);
println(nums[1]);


var myRange = 1.rangeTo(10) step 2;
var myRange1 = 1..10;
var decRange = 8.downTo(2);
var decRange2 = 8..2;

println(5 in myRange);
println(5 !in myRange1);
println(myRange);
println(myRange1);
println(decRange);
println(decRange2);

for(z in myRange){
    println(z);
}

for(element in nums) {
    println(element);
}

var index = 0;
while(index < nums.size) {
    println(nums[index]);
    ++index;
}

for (ix in nums.indices){
    println(nums[ix])
}

practiseThree();
practiseFour();

println();
println(square(5));
println(getSum(1,2,3));
println(getSum(1,2));
println(getSum(num2 = 2));

printIt(5);
printIt("hi");


var nonNullableStr: String = "SoloLearn";
// nonNullableStr = null;
println(nonNullableStr.length);
var nullableStr: String? = "SoloLearn";
// nullableStr = null;
println(nullableStr?.length);


var user = User("John");
user.printFirstname();
user.name = "Petr";
println(user.learningAt);
user.printHello();
user.age = -12;
println(user.age);
user.age = 12;
println(user.age);

var student = Student("Anne", 18);
student.printHi();

var house = House("London Street", 2);

}

class User constructor(var firstname: String) {
var name: String = "";
val learningAt = "SoloLearn";
var age: Int = 0
set(value) {
    if (value > 0) {
        field = value;
    }
}
get() {
    return field + 2;
}

fun printHello() {
    println("Hello $name");
}

fun printFirstname(){
    println("Hello $firstname");
}
}

class Student(val name: String, var age: Int){
    fun printHi(){
        println("Hi $name, $age");
    }
}

class House(address: String, var storeys: Int){
    init {
        println("House is on $address, $storeys storeys high.");
    }
    init {
        var saddress = address; 
        println(address);
    }
}

fun printIt(arg: Any){
    if (arg is String){
        println("Length is ${arg.length}");
    }
    println(arg);
}

fun square(x: Int): Int {
    return x*x;
}

fun getSum(num1: Int = 5, num2: Int, num3: Int = 0):Int{
    return num1+num2+num3;
}


fun practiseOne(){
    val a = readLine()!!.toInt();
    val b = readLine()!!.toInt();
    val c = readLine()!!.toInt();
    println("sum is ${a+b+c}")
}


fun practiseTwo(){
    val a = readLine()!!.toFloat();
    val b = readLine()!!.toFloat();
    println("difference is ${a-b}")
}

fun practiseThree(){
    var nums: IntArray = intArrayOf(1,2,3,4,5);
    var product = 1;
    for(num in nums){
        product*=num;
    }
    println("Product is $product")
}
 
fun practiseFour(){
    var nums = 0..100;
    for(num in nums){
        if (num%2 == 1){
            print(num);
        }
    }
}