/**
 * 使用XmlSlurper解析XML
 *
 * Created by lizihanglove on 2017/5/26.
 */

languages = new XmlSlurper().parse("../languages.xml")
println 'Languages and author'
languages.language.each{
    println "${it.@name} authored by ${it.author[0].text()}"
}

