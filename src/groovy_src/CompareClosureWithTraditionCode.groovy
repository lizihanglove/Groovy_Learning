/**
 * 闭包与传统代码的对比
 *
 * Created by lizihanglove on 2017/5/11.
 *
 */

/**
 * 传统代码一
 * @param n
 * @return
 */
def sum(n) {
    def  total = 0
    for (int i = 2; i <= n; i += 2) {
        total += i
    }
    total
}

println "the sum of even number from 1 to 10 is ${sum(10)}"

/**
 * 传统代码二
 * @param n
 * @return
 */
def product(n) {
   def prod = 1
    for (int i = 2; i <= n; i += 2) {
        prod *= i
    }
    prod
}

println "the production of even number from 1 to 10 is ${product(10)}"

/**
 * 传统代码三
 * @param n
 * @return
 */
def sqr(n) {
    def squared = 1
    for (int i = 2; i <= n; i += 2) {
        squared << i**2
    }
    squared
}

println "the squares of even number from 1 to 10 is ${sqr(10)}"

/**
 * 闭包代码块
 * @param n
 * @param block
 */
def pickEvent(n, block) {
    for (int i = 2; i <= n; i += 2) {
        block(i)//此处为闭包作为参数传递后的代码
    }
}

//打印偶数
pickEvent(10, { number -> println number })//打印偶数，此处使用Lambda表达式
pickEvent(10, { println(it) })//打印偶数，当方法参数唯一时，可以在闭包调用时用it替换
pickEvent(10) { println(it) }//打印偶数，同上，但是闭包可以放于方法参数列表之后

//偶数相加
def total = 0
pickEvent(10) { total += it }
println total

//偶数相乘
def pro = 1
pickEvent(10){pro *= it }
println pro

//偶数次幂
def sqrt = 1
pickEvent(10){sqrt<< it**2}
println sqrt


def totalSelectValue(n,closure){
    def total = 0
    for (i in 1..n) {
        if (closure) {
            total +=i
        }
    }
    total
}
print 'total of event value from 1 to 10 is : '
println totalSelectValue(10,{it %2 == 0})




print 'total of event value from 1 to 10 is : '
def isEven = {it%2 == 0}
println totalSelectValue(10,isEven)



