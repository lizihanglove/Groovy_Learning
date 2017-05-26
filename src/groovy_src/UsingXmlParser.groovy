/**
 * 使用xmlParser解析XML
 *
 * Created by lizihanglove on 2017/5/26.
 */

languages = new XmlParser().parse('../languages.xml')

println 'Languages and author'

languages.each {
    println "${it.@name} authored by ${it.author[0].text()}"
}