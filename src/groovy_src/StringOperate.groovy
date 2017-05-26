/**
 * 字符串的操作
 *
 * Created by lizihanglove on 2017/5/15.
 */


def str = "It's a rainy day in Seattle"
println str
str -= "rainy"
println str


def sentence = "Seattle "
println sentence * 3
println sentence + 2 * 3



for (String i in 'held'..'helm') {
    print i
    print " "
}
println()


def pattern = ~"(H|h)ello"

def text = 'Hello world'
if (text =~ pattern) {//模式在后，字符串在前
    println 'match'
} else {
    println 'not match'
}

if (text ==~ pattern) {//模式在后，字符串在前
    println 'match'
} else {
    println 'not match'
}

if (text =~ /(H|h)ello/) {//RegEx在后，字符串在前
    println 'match'
} else {
    println 'not match'
}
