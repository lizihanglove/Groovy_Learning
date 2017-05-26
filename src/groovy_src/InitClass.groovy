import groovy.transform.ToString

/**
 * 灵活初始化及具名函数
 *
 * Created by lizihanglove on 2017/5/9.
 */

@ToString
class Robot{
    def type,height,width
    def access(weight,location,fragile){
        println "Received fragile;$fragile,weight:$weight,location:$location"
    }

    Robot(type, height) {
        this()
        this.type = type
        this.height = height
    }

    Robot() {
        this.width = 0
    }
}

def  robot = new Robot(type="dot",height=10)
println "robot:$robot.width :$robot.height :$robot.type"

robot.access(12,y:25,x:36,19)
robot.access(125,36,fragile19)
robot.access(12,25,x:36,z:19)
