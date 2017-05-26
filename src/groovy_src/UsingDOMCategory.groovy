import groovy.xml.DOMBuilder
import groovy.xml.dom.DOMCategory
import org.w3c.dom.Document

/**
 * 使用DOMCategory解析XML
 *
 * Created by lizihanglove on 2017/5/26.
 */

 Document document = DOMBuilder.parse(new FileReader('../languages.xml'))

 rootElement  = document.documentElement

use(DOMCategory){
    println 'Languages and Author'
languages = rootElement.language
    languages.each {language->
        println "${language.'@name'} authored by ${language.author[0].text()}"

    }
}
