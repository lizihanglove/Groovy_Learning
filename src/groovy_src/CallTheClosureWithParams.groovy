/**
 * 为闭包传递参数
 *
 * Created by lizihanglove on 2017/5/12.
 */

def tellFortune(closure){
    closure new Date("05/12/2017"),"Your day is fulled with ceremony"
}

tellFortune(){Date date,fortune->
    println "Fortune for ${date} is ${fortune}"
}