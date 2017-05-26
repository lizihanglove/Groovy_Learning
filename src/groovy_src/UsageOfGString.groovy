/**
 * 字符串用法
 *
 * Created by lizihanglove on 2017/5/15.
 */

char aChar = 'a' as char
println aChar.getClass().name//打印java.lang.Character

def sentence = 'he said "hello!"'
println sentence//打印he said "hello!"
println sentence.getClass().name//打印java.lang.String

def value = 25
def singleQuoteString = 'the value is ${value}'
println singleQuoteString
def  doubleQuoteString = "the value is $value"
println doubleQuoteString




def slashString = /I am slash String/
println slashString


def  singleSlashString = /the value is $value/
println singleSlashString


def printClass(obj){
    println "Class is ${obj.getClass().name}"
    println "SuperClass is ${obj.getClass().superclass.name}"
}

def v = 20
printClass('singleQuote without value')
printClass("doubleQuote without value")
printClass("doubleQuote with value $v")
printClass(/slash without value/)
printClass(/slash with vlaue $v/)

company = 'Google'
price = 222
def quote = "Today ${->  company} stock closed at ${->price}"
println quote
def stocks =[Apple:663.01,Microsoft:30.95]
stocks.each {key,val->
    company = key
    price = val
    println quote
}


