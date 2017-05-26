/**
 * 闭包委托
 *
 * Created by lizihanglove on 2017/5/15.
 */


def examiningClosure(closure){
    closure()
}

examiningClosure(){
    println "In first closure"
    println "class is "+getClass().name
    println "this is "+this+", super is" +this.getClass().superclass.name
    println "owner is "+owner+", super is" +owner.getClass().superclass.name
    println "delegate is "+delegate+", super is" +delegate.getClass().superclass.name

    examiningClosure(){
        println "In closure within the first closure"
        println "class is "+getClass().name
        println "this is "+this+", super is" +this.getClass().superclass.name
        println "owner is "+owner+", super is" +owner.getClass().superclass.name
        println "delegate is "+delegate+", super is" +delegate.getClass().superclass.name
    }

}


class Handler{
    def  f1 (){
        println "f1 of Handler is called !"
    }
    def  f2 (){
        println "f2 of Handler is called !"
    }
}

class Example {
    def  f1 (){
        println "f1 of Example is called !"
    }
    def  f2 (){
        println "f2 of Example is called !"
    }

    def foo(closure){
        f1()
        f2()
        closure.delegate = new Handler()
        closure()
    }
}

def f1(){
    println "f1 of Script is called !"
}
def f2(){
    println "f2 of Script is called !"
}

new Example().foo(){
    f1()
    f2()
}