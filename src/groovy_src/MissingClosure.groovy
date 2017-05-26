/**
 * 动态闭包
 *
 * Created by lizihanglove on 2017/5/12.
 */

def doSomthing(closure) {
    if (closure) {
        closure()
    } else {
        println 'No Closure provided for this method'
    }

}


doSomthing() {
    println 'A Closure was provided for this method'
}
doSomthing()

def computeOrders(int amount, Closure closure) {
    def interst = 0
    if (closure.maximumNumberOfParameters == 2) {
        interst = closure(amount, 0.2)
    } else {
        interst = closure(amount)
    }
    println interst

}

computeOrders(100) { it * 0.1 }
computeOrders(100) { amount, interestRate -> amount * interestRate }

def examine(Closure closure){
    println "$closure.maximumNumberOfParameters param(s) is Provided"
    for (param in closure.parameterTypes) {
        println param.name
    }
}

examine {}
examine {Date val ->}
examine {val ->}
examine {int a,int b,double c ->}