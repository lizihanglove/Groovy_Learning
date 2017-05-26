/**
 * 创建数组的两种方式
 *
 * Created by lizihanglove on 2017/5/10.
 */

//int [] arr1 = new int[]{1,2,3,4,5,6} //出现错误,可能与闭包有关
int [] arr2 = [1,2,3,4,5,6,7]
println arr2
println "arr2 is ${arr2.getClass().name}"

def arr3  = [1,2,3,4,5,6,7,8,9] as int[]
println arr3
println "arr3 is ${arr3.getClass().name}"
