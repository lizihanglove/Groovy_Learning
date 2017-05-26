/**
 * 闭包与协程
 *
 * Created by lizihanglove on 2017/5/12.
 */

def iterate(n,closure){
    1.upto(n){
        println "In iterate with value ${it}"
        closure(it)
    }

}

println 'Start..'
def total = 1
iterate(4){
    total += it
    println "In Closure with value ${total}"
}

println 'Done..'