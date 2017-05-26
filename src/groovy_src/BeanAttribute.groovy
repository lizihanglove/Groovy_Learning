import groovy.transform.TypeChecked

/**
 * bean类的使用
 *
 * Created by lizihanglove on 2017/5/9.
 */


class Car {
    private miles = 0
    final year

    Car(theYear){
        year = theYear
    }

    def getMiles(){
        println 'getMiles called'
        miles
    }

    private void setMiles(miles) {
        throw  new IllegalAccessException("you are not allowed to change miles")
    }

    def drive(dist) {
        if (dist > 0) {
            miles += dist
        }
    }
}

def car = new Car(2017)
println car.miles
println car.year
println car.drive(100)
println car.miles

try {
    car.miles = 1000
} catch (IllegalAccessException ex) {
    println ex.localizedMessage
}
