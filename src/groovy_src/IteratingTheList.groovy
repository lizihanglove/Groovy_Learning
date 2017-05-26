/**
 * 迭代集合
 *
 * Created by lizihanglove on 2017/5/16.
 */

def l = [1,2,3,4,5,6,7,8,9]
//正向迭代打印
l.each{print "$it "}
println()
//反向迭代打印
l.reverseEach {print "$it "}
println()
//求和
def total = 0
l.each {total +=it}
println "Total is $total"
//求乘积
def doubleList = []
l.each {doubleList << it * 2 }
println l
println doubleList
//求乘积
def collect = l.collect{it*2}
println collect



