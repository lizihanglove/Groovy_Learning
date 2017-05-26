/**
 * 能力式设计
 *
 * Created by lizihanglove on 2017/5/10.
 */

class Man {
    void helpMoveThings() {
        println "Man's helping"
    }
}

class Woman {
    void helpMoveThings() {
        println "Woman's helping"
    }
}

class Elephant {
    void helpMoveThings() {
        println "Elephant's helping"
    }

    void eatSugarcane() {
        println "Elephant's eating"
    }
}

def takeHelp(helper) {

    helper.helpMoveThings()//每个类都有方法实现
    if (helper.metaClass.respondsTo(helper, "eatSugarcane")) {
        helper.eatSugarcane()//某些类有实现
    }

}

takeHelp(new Man())
takeHelp(new Woman())
takeHelp(new Elephant())