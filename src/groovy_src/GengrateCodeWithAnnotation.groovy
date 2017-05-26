import groovy.transform.Canonical
import groovy.transform.Immutable
import groovy.transform.ToString

/**
 * 注解生成代码
 *
 * Created by lizihanglove on 2017/5/10.
 */
@Canonical(excludes = "lastName,age")
class Person {
    String firstName
    String lastName
    int age

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
    }
}

def sara = new Person("Sara", "Walker", 23)
println(sara)

class Worker {
    def work() { println 'get work done' }

    def analyze() { println 'get analyze done' }

    def write() { println 'get write done' }
}

class Expert {
    def analyze() { println 'get expert analyze done' }
}

class Manager {
    @Delegate
    Expert expert = new Expert()
    @Delegate
    Worker worker = new Worker()
}

def manager = new Manager()
manager.work()
manager.analyze()

@Immutable
class CreditCard {
    String id
    int creditLimit
}

def card = new CreditCard("54444444231231", 25)
println card


class Heavy {
    def size = 10

    Heavy() {
        println 'A Heavy created.'
    }

    Heavy(size) {
        this.size = size
        println 'A Heavy created.'
    }
}

class AsNeeded {
    def value
    @Lazy
    def heavy1 = new Heavy()
    @Lazy
    def heavy2 = { new Heavy(value) }()

    AsNeeded(value) {
        this.value = value
    }
}

def asNeeded = new AsNeeded(1000)
println asNeeded.heavy1.size
println asNeeded.heavy1.size
println asNeeded.heavy2.size


@ToString
//生成toString方法
class Doggie {
    String nickName
    int age

    Doggie(String nickName, int age) {
        this.nickName = nickName
        this.age = age
    }
}

@Newify([Doggie]) def dog = Doggie('wan', 1)
println dog


@Singleton(lazy = true)
class Unique {
    def sayHello() {
        println 'hello'
    }

}
Unique.getInstance().sayHello()