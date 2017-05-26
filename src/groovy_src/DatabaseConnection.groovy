import groovy.sql.DataSet
import groovy.sql.Sql
import groovy.xml.MarkupBuilder

/**
 * 连接数据库
 *
 * Created by lizihanglove on 2017/5/26.
 */


sql = Sql.newInstance('jdbc:mysql://localhost:3306/weatherinfo','root','root','com.mysql.jdbc.Driver')

println sql.connection.catalog

println 'city :temperature'
sql.eachRow('SELECT * FROM weather;'){
    println "${it[0]} :${it[1]}"//也可以是it.city等
}


def builder = new MarkupBuilder()
builder.weather{
    sql.eachRow('SELECT * FROM weather;'){
       city(name:it.city,temperature:it.temperature)
    }
}
println()

println 'cities with higher temperature:'
def dataSet = sql.dataSet('weather')
def citiesWithHigherTemperature = dataSet.findAll { it.temperature > 30 }
citiesWithHigherTemperature.each {
    println "${it[0]}:${it[1]}"
}


println "number of cities before insert is ${sql.rows('SELECT * FROM weather;').size()}"
dataSet.add(city:'Harbin ',temperature: 10)
println "number of cities after insert is ${sql.rows('SELECT * FROM weather;').size()}"


println "number of cities before insert is ${sql.rows('SELECT * FROM weather;').size()}"
sql.execute("INSERT INTO weather(city, temperature) VALUES ('Shenzhen',39);")
println "number of cities after insert is ${sql.rows('SELECT * FROM weather;').size()}"


