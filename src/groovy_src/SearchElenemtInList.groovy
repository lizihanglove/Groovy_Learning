/**
 * 查找元素
 *
 * Created by lizihanglove on 2017/5/16.
 */

def l = [1,2,3,4,5,6,7,8,9]
println l
def found = l.find { it > 2 }
println found
def findAll = l.findAll{ it > 2 }
println findAll
//求和
def sum = l.sum()
println sum
//反向排序
l.sort(new Comparator<Integer>() {
    int compare(Integer o1, Integer o2) {
        return -1
    }
})
println l
//连接元素
def join = l.join("-")
println join
//向集合中添加集合
l<<[10,20,30]
println l
//平铺，也即是将集合内的元素是集合的话，将其元素改为父集合的元素
def flatten = l.flatten()
println flatten


