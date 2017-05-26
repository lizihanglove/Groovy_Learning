/**
 * 操作符重载例子
 *
 * Created by lizihanglove on 2017/5/10.
 */

for (ch = 'a'; ch < 'd'; ch++) {
    println ch
}

for (ch in 'a'..'c') {
    println ch
}

lst = ["hello"]
lst<<"there"
println lst

for (item in lst) {
    println item
}