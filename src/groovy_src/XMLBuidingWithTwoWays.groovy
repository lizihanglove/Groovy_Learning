import groovy.xml.StreamingMarkupBuilder

/**
 * XML的生成
 *
 * Created by lizihanglove on 2017/5/26.
 */

langs = ['c++': 'Stroustrup', 'java': 'Gosling']
content = ""
langs.each {
    language,author->
        fragment = """<language name = ${language}>
        <author>
            ${author}
        </author>
    </language>"""
        content+=fragment
}
xml = """
<languages>
    ${content}
</languages>"""


println xml

println '-------------------'


xmlDocument = new StreamingMarkupBuilder().bind {

    mkp.xmlDeclaration()
    mkp.declareNamespace(computer: 'Computer')
    languages {
        comment << "Created using StreamingMarkupBuilder"
        langs.each { key, value ->
            language(name: key) {
                author(value)
            }
        }

    }
}
println xmlDocument