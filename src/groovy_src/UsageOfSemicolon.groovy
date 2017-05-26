import groovy.transform.ToString

/**
 * 分号的使用
 *
 * Created by lizihanglove on 2017/5/10.
 */

@ToString
class Semicolon {
    def val = 3
            {
                println "Instance initialize called,value is $val"
            }
}
println new Semicolon()
