/**
 * groovy中Object的扩展
 *
 * Created by lizihanglove on 2017/5/17.
 */

def str = "hello"
println str
println str.dump()
str.inspect()


def lst = [1,2,3]
lst<<4
lst<<5
println lst.size()
println lst.contains(1)

lst.with {
    add(6)
    add(7)
    println size()
    println contains(1)
}

Car car = new Car(2017)
def properties = car.properties as String[]
for (String prop in properties) {
    println prop
}

class People{
    def walk(){
        println "walk method called without param"
    }
    def walk(int length){
        println "walk method called with one param"
    }
    def walk(int length,int width){
        println "walk method called with two param"
    }

}

People p = new People()
p.invokeMethod("walk",null)
p.invokeMethod("walk",1000)
p.invokeMethod("walk",[1000,2000])


int[] arrayOfInts = [1,2,3,4,5,6,7,8]
def integers = arrayOfInts[2..5]
println integers