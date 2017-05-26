/**
 * 迭代map
 *
 * Created by lizihanglove on 2017/5/16.
 */
def m = ['language': 'groovy', "base": 'java', 'number': 10]
m.each { entry -> println "entry[$entry.key : $entry.value]" }
m.each { key, value -> println "entry[$key : $value]" }
def collect = m.collect { it }
println "collect is $collect"

def find = m.find { entry -> entry.key == 'language' }
println "find is $find"

def findAll = m.findAll { entry -> entry.value.getClass().name == String.class.name }
println "findAll is $findAll"


def students = ['xiao qiang': 23, 'xiao li': 25, 'da wang': 25]
println students.any { key, value -> key =~ "[A-Za-z]" }
println students.every { key, value -> key =~ "[A-Za-z]" }
def groupedStudents = students.groupBy { entry -> entry.key.split(" ")[0] }
groupedStudents.each { entry ->
    println "$entry.key :"
    entry.value.collect { name, age ->
        println "name is $name ,age is $age"
    }
}
