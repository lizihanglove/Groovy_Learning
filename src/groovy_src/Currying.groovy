/**
 * 科里化闭包
 *
 * Created by lizihanglove on 2017/5/12.
 */

def tellFortue(closure){
    Date date = new Date("05/12/2017")
    postFortune = closure.curry(date)
    postFortune "Your day is filled with ceremony"
    postFortune "they are features ,not bugs"
}

tellFortue(){date,fortune ->
    println "Fortune for ${date} is ${fortune}"
}