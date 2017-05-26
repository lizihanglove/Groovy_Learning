/**
 * list的使用
 *
 * Created by lizihanglove on 2017/5/16.
 */


def l = [1,2,3,4,5,6,7]
println l
println l.getClass().name
println l[1]
println l[l.size()-1]
println l[-1]
println l[2..5]
println l[-2..-5]
def sublist = l[2..5]
println sublist.dump()
sublist[0] = 'three'
println sublist
println l

l<<8

println l